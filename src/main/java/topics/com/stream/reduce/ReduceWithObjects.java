package topics.com.stream.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceWithObjects {
    public static void reduceWithObjects(List<User> user) {
        Integer reduce = user.stream().map(User::getAge).reduce(0, Integer::sum);
        System.out.println(reduce);
    }

    public static void main(String[] args) {
            List<User> list = Arrays.asList(new User("vishal",22) , new User("Thomas",45));
            reduceWithObjects(list);
    }
}
