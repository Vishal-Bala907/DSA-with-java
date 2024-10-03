package org.dsa.java.recursion.third;

public class Invite {

    public static int inviteInPair(int n) {
        if(n < 0) {
            return 0;
        } else if(n == 0 ) {
            return 1;
        }
        return inviteInPair(n-1) + (n-1) * inviteInPair(n-2);
    }

    public static void main(String[] args) {

    }
}
