package main.java.codingtest.inflearn2.section7;

import java.util.*;
class Q03 {
    public int solution(int s, int e){
        int answer = 0;
        Queue<Point> queue = new LinkedList<>();
        boolean[] checkPerson = new boolean[200001];
        queue.add(new Point(s, e));
        checkPerson[s] = true;
        while(!queue.isEmpty()) {
            answer++;
            int size = queue.size();
            for(int i=0; i<size; i++) {
                Point point = queue.poll();
                int nextCow = point.cow +1;
                if(nextCow > 200000) return -1;
                int nextPerson1 = point.person + 1;
                int nextPerson2 = point.person - 1;
                int nextPerson3 = point.person * 2;
                if(nextCow == nextPerson1 || nextCow == nextPerson2 || nextCow == nextPerson3) return answer;
                if(nextPerson1 >= 0 && nextPerson1 <= 200000 && !checkPerson[nextPerson1]) {
                    checkPerson[nextPerson1] = true;
                    queue.add(new Point(nextPerson1, nextCow));
                }
                if(nextPerson2 >= 0 && nextPerson2 <= 200000 && !checkPerson[nextPerson2]) {
                    checkPerson[nextPerson2] = true;
                    queue.add(new Point(nextPerson2, nextCow));
                }
                if(nextPerson3 >= 0 && nextPerson3 <= 200000 && !checkPerson[nextPerson3]) {
                    checkPerson[nextPerson3] = true;
                    queue.add(new Point(nextPerson3, nextCow));
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

    class Point {
        int person;
        int cow;
        public Point(int person, int cow) {
            this.person = person;
            this.cow = cow;
        }
    }
}

