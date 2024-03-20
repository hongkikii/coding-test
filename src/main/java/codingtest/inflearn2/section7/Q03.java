package main.java.codingtest.inflearn2.section7;

import java.util.*;
class Q03 {
    public int solution(int s, int e){
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] checkPerson = new boolean[200001];
        queue.add(s);
        checkPerson[s] = true;
        while(!queue.isEmpty()) {
            answer++;
            int size = queue.size();
            e += answer;
            if(e > 200000) return -1;
            for(int i=0; i<size; i++) {
                int cx = queue.poll();
                for(int nx : new int[]{cx + 1, cx - 1, cx * 2}) {
                    if(nx == e) return answer;
                    if(nx >= 0 && nx <= 200000 && !checkPerson[nx]) {
                        checkPerson[nx] = true;
                        queue.add(nx);
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Q03 T = new Q03();
        System.out.println(T.solution(1, 11));
        System.out.println(T.solution(10, 3));
        System.out.println(T.solution(1, 34567));
        System.out.println(T.solution(5, 6));
        System.out.println(T.solution(2, 54321));
    }
}

