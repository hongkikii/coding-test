package main.java.codingtest.leetcode.binarySearchTree;


class Q230 {

    public int kthSmallest(TreeNode root, int k) {
        return inOrderTraversal(root, k, 0);
    }

    private int inOrderTraversal(TreeNode node, int k, int current) {
        if(current == k) {
            return node.val;
        }
        if(node.left != null) {
            inOrderTraversal(node.left, k, ++current);
        }
        if(node.right != null) {
            inOrderTraversal(node.right, k, ++current);
        }
        return -1;
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
