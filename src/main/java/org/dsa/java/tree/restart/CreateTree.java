package org.dsa.java.tree.restart;

public class CreateTree {

    static int indexCount = -1;

    static class Tree {
        int value;
        Tree left;
        Tree right;

        Tree (){}
        Tree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }

    static Tree buildTree(int[] arr) {
        // index count starts from 0
//        System.out.println(indexCount);
        ++indexCount;
        if(arr[indexCount] == -1) {
            return null;
        }

        Tree node = new Tree(arr[indexCount]);
        node.left = buildTree(arr);
        node.right = buildTree(arr);
        return node;
    }

    // inorder traversal
    static void inOrderTraversal(Tree head) {
        if(head == null) {
//            System.out.println("-1");
            return;
        }
        inOrderTraversal(head.left);
        System.out.print(" , "+head.value);
        inOrderTraversal(head.right);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree tree = buildTree(nodes);

        inOrderTraversal(tree);
    }

}
