package topics.com.stream.filter;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ImpleFilterInterface implements FilterInterface<Integer>{

    @Override
    public List<Integer> filterEven(List<Integer> list) {
        return list.stream().filter(i -> i % 2 == 0).toList();
    }

   public Map<String, Long> filterLargestKey(Map<String, Long> list) {

        int lk =0,lv=0;
       Collection<Long> values = list.values();
       values.forEach(System.out::println);
       return Map.of();
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(9, 0, 7, 9, 0, 1, 8, 3, 5, 8);

        System.out.println(integers.stream().max(Integer::compare).orElse(0));

    }

}
