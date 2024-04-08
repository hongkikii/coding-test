package main.java.codingtest.inflearn2.section1;

import java.util.*;

class Solution {
    public int solution(int[] nums){
        int answer = 0;
        List<Integer> peaks = new ArrayList<>();

        for (int idx = 1; idx < nums.length -1; idx++) {
            if (nums[idx] > nums[idx - 1] && nums[idx] > nums[idx + 1]) {
                peaks.add(idx);
            }
        }
        for (int idx : peaks) {
            int count = 1;
            int condition = idx;
            while (idx >= 1 && nums[idx] > nums[idx - 1]) {
                count++;
                idx--;
            }
            while (condition <= nums.length -2 && nums[condition] > nums[condition + 1]) {
                count++;
                condition++;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(T.solution(new int[]{1, 3, 2, 5, 7, 4, 2, 5, 1}));
        System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
        System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
        System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
    }
}
