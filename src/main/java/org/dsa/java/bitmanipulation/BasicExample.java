package org.dsa.java.bitmanipulation;

public class BasicExample {
    public static void getBit(int num,int n){

        //! getting mask
        int mask = 1<<n;

        //! performing and
        if((num & mask)==0){
            System.out.println("bit is zero");
        }else{
            System.out.println("bit is non zero");
        }
    }

    public static void setBit(int num,int pos){
            // shifting the number by 1 bit
        int mask = 1<<pos;
        System.out.println(mask | num);
    }

    public static void clearBit(int num,int pos){

        int mask = 1<<pos;
        System.out.println((~mask) & num );

    }
//    public static void
    public static void main(String[] args) {
//        int a = 2;
//        int b = 1;
//
//        System.out.println("left shift 2<<1" + (2<<1));
//        System.out.println("right shift 2<<1" + (2>>1));
        getBit(5,2);
        setBit(5,1);
        clearBit(5,2);

    }

}
