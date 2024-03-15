package main.java.codingtest.inflearn2.section4;

import java.util.*;
class Q02 {
    public int[] solution(int[] nums){
        int length = nums.length;
        int[] answer = new int[length / 2];
        int idx = answer.length-1;
        Arrays.sort(nums);
        for(int i=length-1; i>=0; i--) {
            if(nums[i] == 0) continue;
            int half = nums[i] / 2;
            for(int j=i-1; j>=0; j--) {
                if(nums[j] == 0) continue;
                if(half == nums[j]) {
                    answer[idx] = nums[j];
                    idx--;
                    nums[j] = 0;
                    break;
                }
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


