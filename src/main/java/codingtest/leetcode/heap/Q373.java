package main.java.codingtest.leetcode.heap;

import java.util.ArrayList;
import java.util.List;

public class Q373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        int leftPointer = 0;
        int rightPointer = 0;
        int count = 0;
        List<Integer> firstPair = new ArrayList<>();
        firstPair.add(nums1[leftPointer]);
        firstPair.add(nums2[rightPointer]);
        answer.add(firstPair);
        count++;
        while(count < k) {
            List<Integer> pair = new ArrayList<>();

            if(nums1[leftPointer+1] + nums2[rightPointer] <= nums1[leftPointer] + nums2[rightPointer+1]) {
                leftPointer++;
            }
            else {
                rightPointer++;
            }
            pair.add(nums1[leftPointer]);
            pair.add(nums2[rightPointer]);
            answer.add(pair);
            count++;
        }
        return answer;
    }
}
