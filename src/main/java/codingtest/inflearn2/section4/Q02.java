package main.java.codingtest.inflearn2.section4;

import java.util.*;
class Q02 {
    public int[] solution(int[] nums){
        int[] answer = new int[nums.length / 2];
        int idx = 0;
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();

        for(int v : nums) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }

        for(int v : nums) {
            if(map.get(v) != 0) {
                answer[idx] = v;
                map.put(v, map.get(v)-1);
                map.put(v * 2, map.get(v * 2) - 1);
                idx++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Q02 T = new Q02();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 10, 2, 3, 5, 6})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 1, 6, 2, 2, 7, 3, 14})));
        System.out.println(Arrays.toString(T.solution(new int[]{14, 4, 2, 6, 3, 10, 10, 5, 5, 7, 7, 14})));
    }
}



