package com.leetcode.tree.easy;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/*
* EASY
* 94. Binary Tree Inorder Traversal
* */
public class InorderTraversal {
    static int idx = -1;
    List<Integer> list = new ArrayList<>();
    private void inOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }
            inOrderTraversal(root.left);
            System.out.print(root.val+" , ");
            inOrderTraversal(root.right);

    }


    private static TreeNode createTree(int[] tree) {
        idx++;
        if(idx >= tree.length) {
            return null;
        }
        if(tree[idx] == -1) {
            return null;
        }
        // create root node
        TreeNode root = new TreeNode(tree[idx], createTree(tree),createTree(tree));
        return root;
    }

    public static void main(String[] args) {
        int[] tree = {1,2,3};
//        int[] tree2 = {1,2,3};
//        int[] tree = {};
        TreeNode root = createTree(tree);

        TreeNode second = createTree(new int[]{1,2,3});

//        TreeNode root2 = root;

        InorderTraversal traversal = new InorderTraversal();

        traversal.inOrderTraversal(root);
        traversal.inOrderTraversal(second);

//        System.out.println(traversal.isSameTree(root,second));
    }
}
