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

      int mid = nums.length / 2;

      TreeNode node = new TreeNode(nums[mid]);
      node.left = createLeftSubTree(--mid, nums);
      node.right = createRightSubTree(++mid, nums);

      return node;

    }
    public static TreeNode createLeftSubTree(int index ,int[] nums) {
      if(index <= 0) {
          return null;
      }
      TreeNode node = new TreeNode(nums[index]);
      return node.left = createLeftSubTree(--index , nums);
    }
    public static TreeNode createRightSubTree(int index ,int[] nums) {
        if(index >= nums.length - 1) {
            return null;
        }
        TreeNode node = new TreeNode(nums[index]);
        return node.right = createLeftSubTree(++index , nums);
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
