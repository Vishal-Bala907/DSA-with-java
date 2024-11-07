package com.leetcode.tree.easy;

public class ConvertSortedArrayToBST {
  public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode() {
      }

      TreeNode(int val) {
          this.val = val;
      }

      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }



    public static TreeNode sortedArrayToBST(int[] nums) {

      TreeNode root = null;
      for(int n:nums) {
          root = createTree(root,n);
      }
      return root;

    }

    private static TreeNode createTree(TreeNode node , int n) {

      if(node == null) {
          node = new TreeNode(n);
          return node;
      }
      if(node.val > n) {
          node.left = createTree(node.left , n);
      } else {
          node.right = createTree(node.right , n);
      }
        return node;
    }

    public static void main(String[] args) {
        int[] arr = {-10,-3,0,5,9};
        TreeNode treeNode = sortedArrayToBST(arr);

        printTree(treeNode);
    }

    private static void printTree(TreeNode treeNode) {
      if(treeNode== null) {
          return;
      }
      printTree(treeNode.left);
      System.out.print(treeNode.val +" ");
      printTree(treeNode.right);
    }
}
