package main.java.codingtest.inflearn2.section5;

import java.util.*;
class Q04 {
    public int solution(int[] plantTime, int[] growTime){
        int answer = 0;
        Queue<Plant> queue = new PriorityQueue<>();
        for(int i=0; i<plantTime.length; i++) {
            queue.add(new Plant(i, plantTime[i], growTime[i]));
        }
        int plantDate = 0;
        while(!queue.isEmpty()) {
            Plant now = queue.poll();
            plantDate += now.plant;
            answer = Math.max(answer, plantDate + now.grow);
        }
        return answer;
    }

    class Plant implements Comparable<Plant> {
        int idx;
        int plant;
        int grow;
        public Plant(int idx, int plant, int grow) {
            this.idx = idx;
            this.plant = plant;
            this.grow = grow;
        }

        @Override
        public int compareTo(Plant o) {
            if(this.plant == o.plant) return this.grow - o.grow;
            return this.plant - o.plant;
        }
    }

    public static void main(String[] args){
        Q04 T = new Q04();
        System.out.println(T.solution(new int[]{1, 3, 2}, new int[]{2, 3, 2}));
        System.out.println(T.solution(new int[]{2, 1, 4, 3}, new int[]{2, 5, 3, 1}));
        System.out.println(T.solution(new int[]{1, 1, 1}, new int[]{7, 3, 2}));
        System.out.println(T.solution(new int[]{5, 7, 10, 15, 7, 3, 5}, new int[]{6, 7, 2, 10, 15, 6, 7}));
        System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{7, 5, 4, 3, 2, 1, 6}));
    }
}

