package org.dsa.java.recursion.third;

public class PlaceTiles {

    public static int placeTiles(int n, int m) {

        if(n==m) {
            return 2;
        }
        if(n < m) {
            return 1;
        }

        int v = placeTiles(n-m, m);

        int  h = placeTiles(n-1,m);

        return v + h;
    }

    public static void main(String[] args) {

    }
}
