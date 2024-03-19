package main.java.codingtest.inflearn2.section5;

import java.util.*;
class Q03 {

    int copyN;
    public int solution(int n, int[] nums){
        int answer = 0;
        copyN = n;
        List<Points> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            list.add(new Points(i, nums[i]));
        }

        Collections.sort(list);
        int s = 0;
        int e = 0;

        for(Points points : list) {
            if(points.left <= s) {
                e = Math.max(e, points.right);
            }
            else {
                answer++;
                if(e == n) return answer;
                s = e;
            }
        }
        return -1;
    }

    class Points implements Comparable<Points> {
        int left;
        int right;

        Points(int center, int scope) {
            this.left = Math.max(center-scope, 0);
            this.right = Math.min(center+scope, copyN);
        }

        @Override
        public int compareTo(Points o) {
            if(this.left == o.left) return this.right - o.right;
            return this.left - o.left;
        }
    }

    public static void main(String[] args){
        Q03 T = new Q03();
        System.out.println(T.solution(8, new int[]{1, 1, 1, 2, 1, 1, 2, 1, 1}));
        System.out.println(T.solution(4, new int[]{1, 2, 2, 0, 0}));
        System.out.println(T.solution(5, new int[]{2, 0, 0, 0, 0, 2}));
        System.out.println(T.solution(11, new int[]{1, 2, 3, 1, 2, 1, 1, 2, 1, 1, 1, 1}));
    }
}
