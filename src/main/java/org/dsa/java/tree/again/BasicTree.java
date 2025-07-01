package org.dsa.java.tree.again;
/*
* ref: https://www.geeksforgeeks.org/introduction-to-tree-data-structure/
*
* */

public class BasicTree {

    static class Node {
        int value;
        Node left;
        Node right;

        public Node() {}

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    static class BinaryTree {
        public static int index = -1;
        public Node createBinaryTree(int[] arr) {
            index++;
            if(index >= arr.length || arr[index] == -1) {
                return null;
            }

            Node node = new Node(arr[index]);
            node.left = createBinaryTree(arr);
            node.right = createBinaryTree(arr);

            return node;
        }
    }

    // left -> Root -> right
    static void inOrderTraversal(Node node) {

        if(node == null) {
            System.out.print(" ");
            return;
        }

        inOrderTraversal(node.left);
        System.out.print(node.value + " , ");
        inOrderTraversal(node.right);

    }


    //    Root → Left → Right
    static void preOrderTraversal(Node node) {

        if(node == null) {
            System.out.print(" ");
            return;
        }

        System.out.print(node.value + " , ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }

//    Left → Right → Root
    static void postOrderTraversal(Node node) {

        if(node == null) {
            System.out.print(" ");
            return;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " , ");

    }

    public static void main(String[] args) {
//        int[] tree = {1,2,-1,3,5,-1,4};
        int[] tree = {1, 2, -1, -1, 3, 5, -1, -1, 4, -1, -1};
        Node node = new BinaryTree().createBinaryTree(tree);

//        BasicTree.inOrderTraversal(node); // 2 , 1, 5, 3, 4
//        BasicTree.preOrderTraversal(node); // 1 , 2, ,3, 5, 4
//        BasicTree.postOrderTraversal(node); // 2, 5, 4, 3, 1

    }

}
