package temp;

import java.util.*;

public class TwoSum {
    public static List<Integer> twoSumProblem(int[] arr , int num) {
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int front = 0 , back = 0;
        int sum = 0;
        while (back != arr.length - 1) {

            if(sum == num) {
                list.add(back);
                list.add(--front);
                return list;
            }

            if(sum < num) {
                if(front != arr.length - 1) {
                    sum += arr[front++];
                } else {
                    sum += arr[back++];
                }
            } else {
                sum -= arr[i++];
                back++;
            }
        }

        return List.of();
    }

    public static void main(String[] args) {
        System.out.println(twoSumProblem(new int[]{6,7,11,15,44} , 33));
        System.out.println(twoSumProblem(new int[]{1,2,3,4,5,6} , 9));
        System.out.println(twoSumProblem(new int[]{1,2,3,4,5,6} , 999));
        System.out.println(twoSumProblem(new int[]{1,2,3,4,5,6} , 12));
    }
}
