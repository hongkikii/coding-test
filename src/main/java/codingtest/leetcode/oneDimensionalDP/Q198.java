package main.java.codingtest.leetcode.oneDimensionalDP;

public class Q198 {
    public int rob(int[] nums) {
        int length = nums.length;
        int[] max = new int[length];
        max[0] = nums[0];
        if(length > 1) max[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i<length; i++) {
            for(int j=i; j<length; j++) {
                max[j] = Math.max(max[j-2]+nums[j], max[j-1]);
            }
        }
        return max[length-1];
    }
}
