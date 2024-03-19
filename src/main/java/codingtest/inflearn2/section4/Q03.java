package main.java.codingtest.inflearn2.section4;

import java.util.*;
class Q03 {
    public int solution(int[] nums, int k){
        int answer = 0;
        Arrays.sort(nums);
        Queue<Points> queue = new PriorityQueue<>();
        for(int i=0; i<nums.length-1; i+=2) {
            int small = nums[i];
            int big = nums[i+1];
            queue.add(new Points(small, big));
        }

        for(int i=0; i<k; i++) {
            Points points = queue.poll();
            answer += points.big;
        }

        while(!queue.isEmpty()) {
            Points points = queue.poll();
            answer += points.small;
        }
        return answer;
    }

    class Points implements Comparable<Points> {
        int small;
        int big;
        int gap;

        public Points(int small, int big) {
            this.small = small;
            this.big = big;
            this.gap = big-small;
        }

        @Override
        public int compareTo(Points o) {
            if(this.gap == o.gap) return o.big - this.big;
            return o.gap - this.gap;
        }
    }

    public static void main(String[] args){
        Q03 T = new Q03();
        System.out.println(T.solution(new int[]{7, 8, 5, 12, 3, 1, 3, 1, 1, 12}, 2));
        System.out.println(T.solution(new int[]{8, 2, 12, 12, 12, 12, 2, 2}, 2));
        System.out.println(T.solution(new int[]{3, 7, 12, 3, 3, 5, 7, 8, 9, 11, 23, 4, 6, 7}, 3));
        System.out.println(T.solution(new int[]{12, 34, 56, 23, 22, 34, 55, 45, 24, 23, 45, 55, 55, 23, 11, 12, 23, 12}, 3));
        System.out.println(T.solution(new int[]{14, 15, 20, 11, 10, 20, 20, 12, 9, 22, 27, 25, 30, 19}, 3));
    }
}

