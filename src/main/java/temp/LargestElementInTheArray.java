package temp;

public class LargestElementInTheArray {

    public static void largestInTheArray(int[] arr) {
        int MAX = arr[0];
        for(int i = 0 ; i < arr.length ; i++) {
            if(MAX < arr[i]) {
                MAX = arr[i];
            }
        }

        System.out.println(MAX);
    }

    public static void main(String[] args) {
        largestInTheArray(new int[]{1,3,7,234,67,3465,78,343465,546});
    }
}
