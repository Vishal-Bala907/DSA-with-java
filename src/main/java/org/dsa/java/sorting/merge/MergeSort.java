package org.dsa.java.sorting.merge;

import java.util.Arrays;

interface Sort {
  void devideTheArray(int si, int ei, int[] arr);
  void sortTheArray(int si, int mid, int end , int[] arr);
}

class MergerAscending implements Sort {

    @Override
    public void devideTheArray(int si, int ei, int[] arr) {

        if(si >= ei)
            return;

        int mid = si + (ei - si) / 2;
        devideTheArray(si, mid, arr);
        devideTheArray(mid+1,  ei, arr);
        sortTheArray(si,mid,ei,arr);



    }

    @Override
    public void sortTheArray(int si, int mid, int ei, int[] arr) {
        int[] merger = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        // left array
        while (idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] <= arr[idx2]) {
                merger[x++] = arr[idx1++];
            }else {
                merger[x++] = arr[idx2++];
            }
        }

        // Managing remaining elements

        while(idx1 <= mid) {
            merger[x++] = arr[idx1++];
        }

        while(idx2 <= ei) {
            merger[x++] = arr[idx2++];
        }

        System.out.println(Arrays.toString(merger));
        // merger to original array
        for(int i=0, j=si; i < merger.length; i++,j++) {
            arr[j] = merger[i];
        }



    }
}


public class MergeSort {
    public static void main(String[] args) {
        MergerAscending mergerAscending = new MergerAscending();
        int[] arr = {9,0,7,9,0,1,8,3,5,8};
        mergerAscending.devideTheArray(0,arr.length -1, arr);

        for(int a : arr) {
            System.out.print(a+" ,");
        }
    }
}
