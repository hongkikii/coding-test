package main.java.codingtest.inflearn2.section7;

import java.util.*;

class Q01 {
    public int solution(int[] nums){
        int n = nums.length;
        boolean[] check = new boolean[n];
        check[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        int L = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                int current = queue.poll();
                for(int j=1; j<=nums[current]; j++) {
                    int next = current + j;
                    if(next == n-1) return L;
                    if(next < n-1 && !check[next]) {
                        check[next] = true;
                        queue.add(next);
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args){
        Q01 T = new Q01();
        System.out.println(T.solution(new int[]{2, 2, 1, 2, 1, 1}));
        System.out.println(T.solution(new int[]{1, 0, 1, 1, 3, 1, 2, 1}));
        System.out.println(T.solution(new int[]{2, 3, 1, 0, 1, 1, 2, 3, 1, 5, 1, 3, 1}));
        System.out.println(T.solution(new int[]{1, 2, 1, 2, 1, 2, 1, 1, 3, 1, 2, 1}));
        System.out.println(T.solution(new int[]{1, 3, 2, 1, 1, 2, 3, 1, 3, 1, 2, 3, 5, 1, 5, 1, 2, 1, 1}));
    }
}


