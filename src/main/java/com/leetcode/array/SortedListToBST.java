package com.leetcode.array;

import com.sun.source.tree.Tree;

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
public class SortedListToBST {
//    static int mid = -1;
    TreeNode createSubtree(int[] nums,int limit , int index) {
        if(index+1 == limit) {
            TreeNode node = new TreeNode();
            node.val = nums[index];
            return  node;
        }
        TreeNode root = new TreeNode(nums[index]);
        if(root.val <= nums[index]){
            // create a new right subtree
            root.right = createSubtree(nums, limit , ++index);
//            root.left = null;
        } else {
            // create a new right subtree
//            root.right = null;
            root.left =  createSubtree(nums, limit , ++index);
        }
        return root;
    }


  public  TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length == 0) {
            return null;
        }
        if(nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int mid =  (nums.length/2);
        TreeNode node = new TreeNode(nums[mid]);
        int index = 0;
        node.left = createSubtree(nums , mid , index);
        node.right = createSubtree(nums , nums.length, mid + 1);
        return node;
    }

    void inOrderTraversal(TreeNode head) {
        if(head == null) {
            return;
        }
        System.out.print(" , " + head.val);
        inOrderTraversal(head.left);
        inOrderTraversal(head.right);
    }

    public static void main(String[] args) {
        int[] arr = {-10,-3,0,5,9};
        TreeNode root = new SortedListToBST().sortedArrayToBST(arr);
        new SortedListToBST().inOrderTraversal(root);
    }
    
}
