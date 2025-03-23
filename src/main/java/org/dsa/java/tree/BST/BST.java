package org.dsa.java.tree.BST;

import java.util.ArrayList;
import java.util.List;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static Node createNode(Node node, int val) {
        if(node == null) {
            node = new Node(val);
            return node;
        }
        if(val > node.data) {
           node.right = createNode(node.right , val);
        }else{
             node.left = createNode(node.left , val);
        }
        return node;
    }

    public static void printInorder(Node root) {
        if(root == null) {
            return;
        }
        printInorder(root.left);
        printInorder(root.right);
        System.out.print(root.data+" , ");
    }

    // Search BST
    public static boolean isAvailable(Node root , int key) {
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        } else if (key > root.data) {
            return isAvailable(root.right, key);
        }else {
            return isAvailable(root.left, key);
        }
    }

    /*
    * Delete node
    * */
    public static Node deleteNode(Node root, int val) {
        //TODO 1st find the node to be deleted
        if(root.data > val) {
            root.left = deleteNode(root.left,val);
        } else if(root.data < val) {
            root.right = deleteNode(root.right,val);
        }else {
            // reached to the node
            // CASE 1, leaf node
            if(root.left == null && root.right == null) {
                return null;
            }

            // CASE 2, one of two child is null
            if(root.left == null) {
                return root.right;
            }else if(root.right == null) {
                return root.left;
            } {
                // both left and right children are not null
                // find inOrderSuccessor
                Node successor = findInorderSuccessor(root.right);
                root.data = successor.data;
                root.right = deleteNode(root.right, successor.data);
            }
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    /*
    * Print in range (x,y)
    * */

    public static void printInRange(Node root, int x, int y) {

        if(root == null) {
            return;
        }

        if(root.data >= x && root.data <= y) {
            printInRange(root.left,x,y);
            System.out.print(root.data+" , ");
            printInRange(root.right,x,y);
        } else if(root.data >= y) {
            printInRange(root.left,x,y);
        }else {
            printInRange(root.right,x,y);
        }
    }
    /*
    * Root to leaf paths
    * */
    public static void rootToLeafPaths(Node root, List<Integer> paths) {
        if(root == null) {
            return;
        }
        Integer data = root.data;
        paths.add(data);

        if(root.left == null && root.right == null) {
            System.out.println(paths);
        }else {
            rootToLeafPaths(root.left,paths);
            rootToLeafPaths(root.right,paths);
        }
        paths.remove(data);
    }

    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i :values) {
            root = createNode(root , i);
        }
        printInorder(root);
        System.out.println();

//        for(int v :values) {
//            System.out.println(isAvailable(root, v));
//        }

//        System.out.println(isAvailable(root, 11));
        rootToLeafPaths(root,new ArrayList<Integer>());
    }
}
