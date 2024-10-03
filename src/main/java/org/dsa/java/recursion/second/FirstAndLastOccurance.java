package org.dsa.java.recursion.second;

public class FirstAndLastOccurance {
    public static int[] getOccurance(String str, String ch , int first , int last, int position) {

        if(position >= str.length() -1){
            return new int[]{first, last};
        }

        if(String.valueOf(str.charAt(position)).equals(ch) && first == -1) {
            first = position;
        }else {
            last = position;
        }
        return getOccurance(str, ch, first, last, position + 1);
    }

    public static void main(String[] args) {
//        String chr = "VISHAL BALA IS GREAT";
        String chr = "abaacdaefaah";
        int[] as = getOccurance(chr, "a", -1, -1, 0);
        System.out.println(as[0] +  " \n" + as[1]);
    }

}
