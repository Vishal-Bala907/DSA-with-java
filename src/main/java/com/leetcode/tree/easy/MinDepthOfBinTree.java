package com.leetcode.tree.easy;

public class MinDepthOfBinTree {
    public int minDepth(TreeNode root) {

        if(root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if(left ==0 || right == 0) {
            return Math.max(left,right) + 1;
        }
        return Math.min(left,right) + 1;

    }


    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left,right) + 1;
    }

}
