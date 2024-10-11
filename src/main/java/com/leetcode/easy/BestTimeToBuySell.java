package com.leetcode.easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BestTimeToBuySell {

//    public static int buyAndSell() {
//
//
//
//        return 0;
//    }

    public static int maxProfit(int[] prices) {

        if(prices.length == 1) {
            return 0;
        }
        int sell = 0;
        int ans = 0;
        for(int i = 0; i< prices.length - 1; i++) {
//            System.out.println(ans);
            for(int j = i+1; j < prices.length; j++) {

                if((prices[i + 1] - prices[i]) > sell)    {
                    ans = prices[i+1] - prices[i];
                    sell = ans;
                }else {
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {7,6,4,3,1};
//        int [] arr = {7,1,5,3,6,4};
//        int [] arr = {2,4,1};
//        int [] arr = {3,2,6,5,0,3};
        int buy = Integer.MAX_VALUE , sell = 0;
        int buyDate = 0;

        System.out.println(maxProfit(arr));
//        for(int i = 0; i<arr.length ; i++) {
//            if(arr[i] < buy && i < arr.length - 1) {
//                buy = arr[i];
//                buyDate = i;
//            }
//        }
//
//        for(int i = buyDate; i< arr.length ; i++) {
//            if(arr[i] >= sell) {
//                sell = arr[i];
//            }
//        }
//
//        System.out.println(sell - buy);

    }
}
