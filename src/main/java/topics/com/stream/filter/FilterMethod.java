package topics.com.stream.filter;

import java.util.List;


// method referencing
public class FilterMethod {
    public List<Integer> filterEven(FilterInterface<Integer> filter, List<Integer> list) {
        return filter.filterEven(list);
    }


    public static List<Integer> filterEvenHandler(List<Integer> list) {
        return list.stream().filter(i -> i % 2 == 0).toList();
    }
}

class TestFilter{
    public static void main(String[] args) {

        List<Integer> list = List.of(3,7,6,3,68,9,46);
        FilterMethod filter = new FilterMethod();
        System.out.println(filter.filterEven(FilterMethod::filterEvenHandler, list));


        // implementation class
        ImpleFilterInterface imp = new ImpleFilterInterface();
        System.out.println(imp.filterEven(List.of(9,0,7,9,0,1,8,3,5,8)));

        // creating lambda
        FilterInterface<Integer> lamda = (mylist)->{
            return mylist.stream().filter(i -> i % 2 == 0).toList();
        };

        System.out.println(lamda.filterEven(List.of(1,2,3,4,5,6,7,8,9)));
    }
}
