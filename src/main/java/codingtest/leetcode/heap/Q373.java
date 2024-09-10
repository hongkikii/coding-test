package main.java.codingtest.leetcode.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] + a[1] - b[0] - b[1]);
        for(int i=0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                minHeap.add(new int[]{nums1[i], nums2[j]});
            }
        }
        while(k > 0) {
            List<Integer> pair = new ArrayList<>();
            int[] min = minHeap.poll();
            pair.add(min[0]);
            pair.add(min[1]);
            answer.add(pair);
            k--;
        }
        return answer;
    }
}
