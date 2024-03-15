package main.java.codingtest.inflearn2.section7;


import java.util.*;
class Q02 {
    public int solution(int[] pool, int a, int b, int home){
        int answer = -1;
        boolean[] nope = new boolean[10001];
        for(int v : pool) {
            nope[v] = true;
        }
        Queue<Move> queue = new LinkedList<>();
        queue.add(new Move(0, false));
        int level = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                Move poll = queue.poll();
                int current = poll.point;
                if(current == home) return level;
                int nextFront = current+a;
                int nextBack = current-b;
                if(nextFront <= 10000  && !nope[nextFront]) {
                    queue.add(new Move(nextFront, false));
                }
                if(nextBack > 0 && !nope[nextBack]) {
                    if(!poll.back) {
                        queue.add(new Move(nextBack, true));
                    }
                }
            }
            level++;
        }
        return answer;
    }

    public static void main(String[] args){
        Q02 T = new Q02();
        System.out.println(T.solution(new int[]{11, 7, 20}, 3, 2, 10));
        System.out.println(T.solution(new int[]{1, 15, 11}, 3, 2, 5));
        System.out.println(T.solution(new int[]{9, 15, 35, 30, 20}, 2, 1, 25));
        System.out.println(T.solution(new int[]{5, 12, 7, 19, 23}, 3, 5, 18));
        System.out.println(T.solution(new int[]{10, 15, 20}, 3, 2, 2));
    }

    class Move {
        int point;
        boolean back;
        public Move(int point, boolean back) {
            this.point = point;
            this.back = back;
        }
    }
}



