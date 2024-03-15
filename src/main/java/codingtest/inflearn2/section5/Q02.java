package main.java.codingtest.inflearn2.section5;

import java.util.*;
class Q02 {
    public int solution(int[] nums){
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int v : nums) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        Arrays.sort(nums);

        for(int j=nums.length-1; j>=0; j--) {
            int v = nums[j];
            if(map.get(v) != 0) {
                if (v != 5 && v != 4) {
                    for (int i = 5 - v; i >= 2; i--) {
                        if (map.getOrDefault(i, 0) != 0) {
                            map.put(i, map.get(i) - 1);
                            break;
                        }
                    }
                }
                answer++;
                map.put(v, map.get(v)-1);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Q02 T = new Q02();
        System.out.println(T.solution(new int[]{2, 5, 3, 4, 2, 3}));
        System.out.println(T.solution(new int[]{2, 3, 4, 5}));
        System.out.println(T.solution(new int[]{3, 3, 3, 3, 3}));
    }
}

