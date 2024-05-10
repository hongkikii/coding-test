package main.java.codingtest.leetcode.divideAndConquer;

class Q108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid = nums[nums.length/2];
        TreeNode node = new TreeNode(mid);
        node.left = sortedArrayToBST(); // 왼쪽 배열?
        node.right = sortedArrayToBST(); // 오른쪽 배열?
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
