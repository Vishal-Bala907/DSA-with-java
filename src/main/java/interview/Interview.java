package interview;

import java.util.ArrayList;
interface MyInterface
{
    public int getnumber();
}
public class Interview implements MyInterface{

        public int getnumber ()
        {
              int number= 10;
              return number;
        }

        public static void main (String[] args){
//        ArrayList arr[]= new ArrayList[2];
//        arr[]= new int [10, 15];List
        Interview interviewobj = new Interview();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);


        System.out.println("First number=" + arr.get(0));
    }
    }

