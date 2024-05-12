package main.java.codingtest.leetcode.binarySearch;

public class Q35 {
    int[] array;
    int value;

    public int searchInsert(int[] nums, int target) {
        array = nums;
        value = target;
        return binarySearch(0, nums.length-1);
    }

    private int binarySearch(int start, int end) {
        if(start > end) {
            return end+1;
        }
        int mid = (start+end) / 2;
        if(array[mid] == value) return mid;
        else if(array[mid] > value) return binarySearch(start, mid-1);
        else return binarySearch(mid+1, end);
    }
}
