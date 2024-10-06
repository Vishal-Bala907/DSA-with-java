package com.leetcode.easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        String add = add(a, b, a.length()-1, b.length()-1, 0);
        String sum =  "";
        for(int i = add.length() -1; i >= 0; i--) {
            sum += add.charAt(i);
        }
        return String.valueOf(Integer.parseInt(sum));
    }

    public String add(String a, String b, int aidx, int  bidx, int carry) {

        if (aidx >= 0  && bidx >= 0) {

            int sum = a.charAt(aidx) - '0' + b.charAt(bidx) - '0' + carry;
            if(sum == 2) {

                String returnValue =  add(a,b, aidx - 1, bidx-1, 1);
                return "0" + returnValue;
            }

            else if(sum == 3) {

                String returnValue = add(a,b, aidx - 1, bidx-1,  1);
                 return "1"  + returnValue;
            }
            else{

                String returnValue = add(a,b, aidx - 1, bidx-1, 0);
                return sum  + returnValue;
            }

        }
        else if(aidx >= 0) {

            int sum =  a.charAt(aidx) - '0'  + carry;

            if(sum == 2) {

                String returnValue =  add(a,b, aidx - 1, bidx, 1);
                return "0" + returnValue;
            }
            else{
                String returnValue = add(a,b, aidx - 1, bidx, 0);
                return sum  + returnValue;
            }

        }
        else if(bidx >= 0) {

            int sum =  b.charAt(bidx) - '0'  + carry;

            if(sum == 2) {
                String returnValue =  add(a,b, aidx, bidx-1, 1);
                return "0" + returnValue;
            }
            else{
                String returnValue = add(a,b, aidx, bidx-1, 0);
                return sum  + returnValue;
            }

        }
        else {
            return carry > 0 ? "1" : "";
        }

    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
//        System.out.println(addBinary.addBinary("11", "1"));
//        System.out.println(addBinary.addBinary("1", "11"));
//        System.out.println(addBinary.addBinary("111", "111"));
//        System.out.println(addBinary.addBinary("11111", "11"));
//        System.out.println(addBinary.addBinary("110", "00"));
        System.out.println(addBinary.addBinary("000", "1"));
    }



}
