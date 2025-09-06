package topics.com.stream.obtainObject;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ObtainStreamObject {

    public static void main(String[] args) {

        // create a empty Stream
        Stream<String> empty = Stream.empty();

        // creating stream from a list or array
        String[] names = {"vishal","thomas","arthur","jhon"};

        Stream<String> names1 = Stream.of(names);
        List<String> v = names1.filter(name -> name.startsWith("v")).collect(Collectors.toList());
        System.out.println(v);

        // by using builder pattern
        Stream<Object> stream3 = Stream.builder().build(); // empty

        // Arrays
        IntStream stream = Arrays.stream(new int[]{1, 3, 5, 7, 94, 3, 56, 7});

        // from collection object
        List<String> vishal = List.of("vishal", "thomas", "arthur", "jhon");
        vishal.forEach(System.out::println);


    }
}
