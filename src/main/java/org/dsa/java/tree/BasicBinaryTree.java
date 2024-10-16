package org.dsa.java.tree;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BasicBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node() {}
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        // Returns root node
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Preorder Traversal
        public static void traverse(Node root) {
            if (root == null) {
                System.out.print(-1 + " , ");
                return;
            }

            System.out.print(root.data + " , ");
            traverse(root.left);
            traverse(root.right);
        }

        // Inorder traversal
        /*
         * First print the left subtree
         * Second print the root
         * Third print the right subtree
         * */
        public static void printInorder(Node root) {
            if (root == null) {
                System.out.print(-1 + " , ");
                return;
            }

            traverse(root.left);
            System.out.print(root.data + " , ");
            traverse(root.right);
        }

        // Inorder traversal
        /*
         * First print the left subtree
         * Second print the right subtree
         * Third print the root
         * */
        public static void printPostOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + " , ");
                return;
            }

            traverse(root.left);
            traverse(root.right);
            System.out.print(root.data + " , ");
        }

        /*
         * Lever order traversal (using iteration and queue)
         * Push root to the queue
         * pop the root and print its value
         * now, push both the children of the root to the queue
         * follow the same
         * */
        public static void levelOrderTraversal(Node head) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(head);
            do {
                Node remove = queue.remove();
                System.out.print(remove.data);
                if(remove.left != null) {
                    queue.add(remove.left);
                }
                if(remove.right != null) {
                    queue.add(remove.right);
                }

            } while (!queue.isEmpty());
            System.out.println();
        }

        //? count the number of nodes
        /*
        * ===============> RECURSION <====================
        * first count the left subtree and return the count
        * Second count the right subtree and return the count
        * now the total nodes including the root node is
        * leftSubtreeNodes + rightSubtreeNodes + 1
        * */
        public static int countNodes(Node head) {
            if(head == null) {
                return 0;
            }
            int i = countNodes(head.left);
            int j = countNodes(head.right);

            return i + j + 1;
        }

        //? sum of nodes
        /*
        * Similar as count nodes
        * return leftSubtree's node value if it is Not null do the  same with right subtree
        * now add both the values with root nodes value
        * */

        public static int sumOfNodes(Node head) {
            if(head == null) {
                return 0;
            }
            return head.data + sumOfNodes(head.left) + sumOfNodes(head.right);
        }

        //? Height of the tree
        /*
        * 1. find the length of left and right subtrees
        * 2, return the greater one
        * */
        public static int height( Node root) {

            if(root == null) {
                return 0;
            }

            int left = height(root.left);
            int right = height(root.right);

            return  Math.max(left,right) + 1;
        }

        /*
        * Diameter of tree
        * 1. Diameter of LeftSubtree
        * 2. Diameter of RightSubtree
        * 3. Diameter from root node
        *
        * calculate leftDiameter/rightDiameter and Height and return the max
        *
        * 1st Approach O(n^2) time
        * */
        public static int diameterFirst(Node root) {

            if(root == null) {
                return 0;
            }

            int d1 = diameterFirst(root.left);
            int d2 = diameterFirst(root.right);
            int d3 = height(root.left) + height(root.right) + 1;

            return Math.max(d3, Math.max(d1,d2));
        }

        /*
        * Diameter Second approach
        * Calculate Diameter and height once
        * */
        static class TreeDiameter {
            int ht;
            int dim;

            public TreeDiameter(int ht, int dim) {
                this.ht = ht;
                this.dim = dim;
            }
        }
        public static TreeDiameter diameterSecond(Node root) {
//
            if(root == null) {
                return new TreeDiameter(0,0);
            }

//            Left subtree
            TreeDiameter left = diameterSecond(root.left);
            TreeDiameter right = diameterSecond(root.right);

            int myHeight = Math.max(left.ht,right.ht) + 1;
            int d1 = left.dim;
            int d2 = right.dim;
            int d3 = left.ht + right.ht + 1;

            int myDim = Math.max(d1,Math.max(d2,d3));
            TreeDiameter diameter = new TreeDiameter(myHeight,myDim);
            return diameter;
        }

        /*
        * 1) Check the subtree root with tree root
        * 2.) If equal, then check the remaining corresponding root
        * 3.) If not equal, then check the left subtree of tree or right subtree of tree
        * */
        public static boolean isIdentical(Node tree, Node subtree) {
                if(tree == null && subtree == null ) {
                    return true;
                }
                if(tree == null || subtree == null ) {
                    return false;
                }
                if(tree.data == subtree.data) {
                    return isIdentical(tree.left,subtree.left) && isIdentical(tree.right,subtree.right);
                }
                return false;
        }
        public static boolean subTreeOfTree(Node tree, Node subtree) {
            if(subtree == null) {
                return true;
            }
            if(tree==null) {
                return false;
            }

            if(tree.data == subtree.data) {
                if(isIdentical(tree,subtree)) {
                    return true;
                }
            }
            return subTreeOfTree(tree.left,subtree) || subTreeOfTree(tree.right, subtree);

        }

        public static void main(String[] args) {
            int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            Node head = BinaryTree.buildTree(nodes);
//        System.out.println(head.data);
//        BinaryTree.traverse(head);
//        System.out.println("\nInorder Traversal");
//        BinaryTree.printInorder(head);
//        System.out.println("\nPostOrder Traversal");
//        BinaryTree.printPostOrder(head);
//            System.out.println("\nLevel Order Traversal");
//            BinaryTree.levelOrderTraversal(head);
//            System.out.println("Counting the nodes \n"+BinaryTree.countNodes(head));
//            System.out.println("Sum of the nodes \n"+BinaryTree.sumOfNodes(head));
//            System.out.println("Calculating height \n"+BinaryTree.height(head));
//            System.out.println("Calculating Diameter by first Approach \n "+BinaryTree.diameterFirst(head));
            System.out.println("Calculating Diameter by second Approach \n "+BinaryTree.diameterSecond(head).dim);
        }
    }
}
