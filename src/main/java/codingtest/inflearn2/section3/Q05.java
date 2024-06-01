package main.java.codingtest.inflearn2.section3;

import java.util.*;
class Q05 {
    public int[] solution(int[][] tasks){
        int tasksCount = tasks.length;
        int[] answer = new int[tasksCount];
        Queue<CallInfo> works = new PriorityQueue<>();
        Queue<ExecutingInfo> waitingPlace = new PriorityQueue<>();
        boolean isFinished = true;
        int finishTime = 0;
        int answerIdx = 0;

        for(int i=0; i<tasksCount; i++) {
            works.add(new CallInfo(i, tasks[i][0]));
        }
        for(int i=0; i<=10000; i++) {
            if(finishTime == i) isFinished = true;
            while(!works.isEmpty() && works.peek().callTime == i) {
                int num = works.poll().idx;
                waitingPlace.add(new ExecutingInfo(num, tasks[num][1]));
            }
            if(!waitingPlace.isEmpty() && isFinished) {
                ExecutingInfo work = waitingPlace.poll();
                answer[answerIdx++] = work.idx;
                finishTime = work.executingTime + i;
            }
            if(works.isEmpty() && waitingPlace.isEmpty()) break;
        }
        return answer;
    }

    static class CallInfo implements Comparable<CallInfo> {
        public int idx;
        public int callTime;

        public CallInfo(int idx, int callTime) {
            this.idx = idx;
            this.callTime = callTime;
        }

        @Override
        public int compareTo(CallInfo o) {
            return this.callTime - o.callTime;
        }
    }

    static class ExecutingInfo implements Comparable<ExecutingInfo> {
        public int idx;
        public int executingTime;

        public ExecutingInfo(int idx, int executingTime) {
            this.idx = idx;
            this.executingTime = executingTime;
        }

        @Override
        public int compareTo(ExecutingInfo o) {
            if(this.executingTime == o.executingTime) {
                return this.idx - o.idx;
            }
            return this.executingTime - o.executingTime;
        }
    }

    public static void main(String[] args){
        Q05 T = new Q05();
        System.out.println(Arrays.toString(T.solution(new int[][]{{2, 3}, {1, 2}, {8, 2}, {3, 1}, {10, 2}})));
        System.out.println(Arrays.toString(T.solution(new int[][]{{5, 2}, {7, 3}, {1, 3}, {1, 5}, {2, 2}, {1, 1}})));
        System.out.println(Arrays.toString(T.solution(new int[][]{{1, 2}, {2, 3}, {1, 3}, {3, 3}, {8, 2}, {1, 5}, {2, 2}, {1, 1}})));
        System.out.println(Arrays.toString(T.solution(new int[][]{{999, 1000}, {996, 1000}, {998, 1000}, {999, 7}})));
    }
}

