package topics.com.stream.reduce;

import java.util.List;

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> integers = List.of(34, 2, 1, 6, 8, 67, 45);
        Integer reduce = integers.stream().reduce(0, (Integer::sum));
        // adds up all the element and give us a value

        List<Integer> emptyList = List.of();
        Integer reduce1 = emptyList.stream().reduce(100, (Integer::sum));
        // the list is empty, so its returns identity
        System.out.println(reduce1);
    }
}
