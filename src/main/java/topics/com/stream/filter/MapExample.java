package topics.com.stream.filter;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();

        map.put("a", 1L);
        map.put("b", 145L);
        map.put("c", 1356L);
        map.put("d", 146L);
        map.put("e", 134L);
        map.put("f", 13L);

        ImpleFilterInterface impleFilterInterface = new ImpleFilterInterface();
        impleFilterInterface.filterLargestKey(map);
    }
}
