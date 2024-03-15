package main.java.codingtest.inflearn2.section5;

import java.util.*;
class Q02 {
    public int solution(int[] nums){
        int answer = 0;
        int left = 0;
        int right = nums.length -1;
        Arrays.sort(nums);
        while (left <= right) {
            if (nums[left] + nums[right] <= 5) {
                answer++;
                left++;
                right--;
            }
            else {
                answer++;
                right--;
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

