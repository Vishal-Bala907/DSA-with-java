package org.dsa.java.bitmanipulation;


class InsertionSort{
    // devide the arry in two , pick one elememnt from unsorted area and place it in the sorted area

    public void sortInInsertion(int[] arr){

        for(int i=1;i<arr.length;i++){ // sorted part
            for(int j=i-1;j>=0;j--){
                
            }
        }
    }
}

//? Find smallest and put it in the fron
class SortInSelection{
    public int[] selectionSort(int[] arr){

        int smallestIndex = 0;
        //? O(n^1 )
        for(int i=0; i<arr.length; i++){
            smallestIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[smallestIndex]){
                    smallestIndex = j;
                }

            }
            // ive got the smallest index
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;

        }
    return arr;
    }

}
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {45,23,878,23,56,34,78,345,787,434};
        SortInSelection ss = new SortInSelection();
        ss.selectionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
