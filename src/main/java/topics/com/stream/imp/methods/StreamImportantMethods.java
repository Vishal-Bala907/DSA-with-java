package topics.com.stream.imp.methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamImportantMethods {

    public static void mapMethod(List<String> str) {
        List<String> list = str.stream().map(String::toUpperCase).toList();
        list.forEach(System.out::println);
    }

    public  static void mapMethod2(List<Integer> integers) {
        List<Integer> list = integers.stream().map(num -> (int) (Math.pow(num, 2))).toList();
        list.forEach(System.out::println);
    }

    public static void sortIntegers(List<Integer> list) {
        list.stream().sorted().forEach(e-> System.out.print(e + " ,"));
    }

    public static void sortedComparator(List<Integer> list) {
   /*     List<Integer> list1 = list.stream().sorted((x,y)->{
            if(x > y ) return -1;
            if( x < y) return 1;
            else return 0;
        }).toList(); */
//        List<Integer> list1 = list.stream().sorted((x,y)->y.compareTo(x)).toList();
        List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder()).toList();

        // all three above are same
        System.out.println(list1);
    }

    public static void minAndMax(List<Integer> list) {
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        Optional<Integer> max = list.stream().min(Comparator.reverseOrder());

        System.out.println("min value is "+min.orElse(0));
        System.out.println("max value is "+max.orElse(0));
    }

    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("erasmus");
        str.add("finn");
        str.add("thomas");
        str.add("john doe");
        str.add("arthur");

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

//        mapMethod2(integers);

//        sortIntegers(List.of(34,2,1,6,8,67,45));

//        sortedComparator(List.of(34,2,1,6,8,67,45));

          minAndMax(List.of(34,2,1,6,8,67,45));

    }

}
