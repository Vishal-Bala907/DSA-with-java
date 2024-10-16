package com.leetcode.tree.easy;

public class IsSameTree {

    public boolean isIdentical(TreeNode lst, TreeNode rst) {
        if(lst.val == rst.val) {
            return true;
        }
        return false;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        if(isIdentical(p,q)) {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        return false;
    }
}
