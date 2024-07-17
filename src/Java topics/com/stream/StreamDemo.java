package com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(4,45,12,46,78,34,68,89,3,43);

        // extracting even numbers
        List<Integer> evenList = new ArrayList<>();
        for(Integer i : list1) {
            if(i % 2 == 0) {
                evenList.add(i);
            }
        }
        System.out.println(evenList);

        // Using filter
        List<Integer> collect = list1.stream().filter(i -> i % 2 == 0).toList();
        var compare = 0;
        Optional<Integer> max = list1.stream().max(Integer::compare);

        max.ifPresent(System.out::println);

        System.out.println(collect);


    }
}
