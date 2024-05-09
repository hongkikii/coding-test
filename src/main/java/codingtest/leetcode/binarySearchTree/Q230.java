package main.java.codingtest.leetcode.binarySearchTree;


import java.util.ArrayList;
import java.util.List;

class Q230 {
    List<Integer> result;

    public int kthSmallest(TreeNode root, int k) {
        result = new ArrayList<>();
        inOrderTraversal(root, k);
        return result.get(k-1);
    }

    private void inOrderTraversal(TreeNode node, int k) {
        if(result.size() == k) return;
        else {
            if(node.left != null) inOrderTraversal(node.left, k);
            result.add(node.val);
            if(node.right != null) inOrderTraversal(node.right, k);
        }
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
