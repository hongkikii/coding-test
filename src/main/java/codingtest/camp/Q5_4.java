package main.java.codingtest.camp;

import java.util.*;

public class Q5_4 {
    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();
        int max = -1;

        for(int i=0; i<priorities.length; i++) {
            queue.offer(new Process(i, priorities[i]));
            if(max < priorities[i]) max = priorities[i];
        }

        int answer = 0;
        while(!queue.isEmpty()) {
            answer++;
            Process process = queue.poll();
            if(process.priority < max) {
                queue.add(process);
            }
            else {
                if(location == process.index) {
                    return answer;
                }
                max = process.priority;
            }
        }
        return answer;
    }

    static class Process {
        public int index;
        public int priority;

        public Process(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}
