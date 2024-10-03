package org.dsa.java.recursion.third;

public class PathCounter {
    public static int countPath(int i, int j, int n, int m) {

        if(i==n || j == m) {
            return 0;
        }
        if(i == n-1 || j == m-1){
            return 1;
        }

        int downPaths = countPath(i+1, j , n, m);

        int rightPaths = countPath(i,j+1,n,m);

        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int i = countPath(0, 0, 3, 3);
        System.out.println(i);
    }
}
