package com.leetcode.med;
/*
* Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go
* outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
* */
public class ReversedInteger {

    public int reverse(int x) {
        boolean neg = false;
        StringBuilder builder = null;
        if(x < 0) {
            if(x <= Integer.MIN_VALUE) {
                return 0;
            }
            neg = true;
            builder = new StringBuilder(String.valueOf(Math.abs(x))).reverse();
        } else {
            builder = new StringBuilder(String.valueOf(x)).reverse();
        }
        if(Integer.MAX_VALUE < Double.parseDouble(builder.toString())) {
            return 0;
        } else {
            if(neg) {

            return -Integer.parseInt(builder.toString());
            }
        }
        return Integer.parseInt(builder.toString());
    }

    public static void main(String[] args) {
        ReversedInteger re = new ReversedInteger();
//        System.out.println(re.reverse(-123));
        System.out.println(re.reverse(-2147483648));
    }

}
