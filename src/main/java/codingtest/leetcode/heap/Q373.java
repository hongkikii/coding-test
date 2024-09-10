package main.java.codingtest.leetcode.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] + a[1] - b[0] - b[1]);
        for(int i=0; i<Math.min(nums1.length, k); i++) {
            minHeap.add(new int[]{nums1[i], nums2[0], 0});
        }
        while(k > 0) {
            int[] min = minHeap.poll();
            List<Integer> pair = new ArrayList<>();
            pair.add(min[0]);
            pair.add(min[1]);
            answer.add(pair);

            if(min[2] + 1 < nums2.length) {
                minHeap.offer(new int[]{min[0], nums2[min[2] + 1], min[2] + 1});
            }
            k--;
        }
        return answer;
    }
}
