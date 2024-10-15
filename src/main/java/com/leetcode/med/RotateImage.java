package com.leetcode.med;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        final int length = matrix[0].length - 1;
        int row = 0, col = 0, temp1, temp2,prevRow=0;
        for(int k=0; k <=length -1 ; k++) {

            for(int i=k; i < length - k  ; i++) {
                col = i;
                row = k;
                prevRow = row;
                temp1 = matrix[row][col];

                    for(int j = 0; j < 4; j++) {

                        // next row and col
                        row = col; // 0,3,3
                        col = length - prevRow; // 3,3,0
                        prevRow = row; // 0,3,3
                        // swapping values
                        temp2 = matrix[row][col]; // 4,16,13
                        matrix[row][col] = temp1; // 1,4,16
                        temp1 = temp2; // 4,16,13


                    }

            }



        }

    }
//



    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}}; //,{13,14,15,16}};
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; //,{13,14,15,16}};
//        int[][] arr = {{1,2},{3,4}}; //,{7,8,9}}; //,{13,14,15,16}};

        rotate(arr);

        for(int i=0; i<arr.length; i++) {
            for(int j =0; j < arr.length; j++) {
                System.out.print(STR."\{arr[i][j]}  ");
            }
            System.out.println();
        }
    }
}
