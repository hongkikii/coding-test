package main.java.codingtest.leetcode.divideAndConquer;

class Q108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return makeBST(nums, 0, nums.length-1);
    }

    public TreeNode makeBST(int[] nums, int start, int end) {
        if(start > end) return null;
        int mid = (start + end) /2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = makeBST(nums, start, mid-1);
        root.right = makeBST(nums, mid+1, end);
        return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
