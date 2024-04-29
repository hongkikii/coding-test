package main.java.codingtest.leetcode.twoPointers;

public class Q167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] answer = new int[2];

        while(true) {
            if(numbers[left] + numbers[right] == target) {
                answer[0] = left + 1;
                answer[1] = right + 1;
                return answer;
            }
            if(numbers[left] + numbers[right] < target) {
                left++;
            }
            else {
                right--;
            }
        }
    }
}
