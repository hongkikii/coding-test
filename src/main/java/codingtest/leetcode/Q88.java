package main.java.codingtest.leetcode;

public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int[] answer = new int[m+n];
        int idx = 0;

        while(p1 < m && p2 < n) {
            if(nums1[p1] < nums2[p2]) {
                answer[idx] = nums1[p1];
                p1++;
            }
            else {
                answer[idx] = nums2[p2];
                p2++;
            }
            idx++;
        }

        while(p1 < m) {
            answer[idx] = nums1[p1];
            idx++; p1++;
        }

        while(p2 < n) {
            answer[idx] = nums2[p2];
            idx++; p2++;
        }

        System.arraycopy(answer, 0, nums1, 0, nums1.length);
    }
}
