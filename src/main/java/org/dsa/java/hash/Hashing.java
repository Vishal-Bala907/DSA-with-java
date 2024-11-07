package org.dsa.java.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        set.forEach(System.out::print);
        System.out.println();

        Map<String,Long> map = new HashMap<>();
        map.put("India",132L);
        map.put("China",135L);
        map.put("America",30L);
        map.put("Nepal",2L);

        System.out.println(map);
        // iterate map
        for(Map.Entry<String,Long> mp : map.entrySet()) {
            System.out.println(mp);
        }

    }
}
