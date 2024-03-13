package main.java.codingtest.inflearn2.section3;

import java.util.HashSet;
import java.util.Set;

class Q01 {
    public int solution(int[] nums){
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int v : set) {
            if(set.contains(v-1)) continue;
            int count = 0;
            while (set.contains(v)) {
                count++;
                v++;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }

    public static void main(String[] args){
        Q01 T = new Q01();
        System.out.println(T.solution(new int[]{8, 1, 9, 3, 10, 2, 4, 0, 2, 3}));
        System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0}));
        System.out.println(T.solution(new int[]{3, 3, 3, 3, 3, 3, 3, 3}));
        System.out.println(T.solution(new int[]{-3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1}));
        System.out.println(T.solution(new int[]{-5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7}));
    }
}
