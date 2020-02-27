package question_9;

import java.util.Arrays;
import java.util.stream.Stream;

public class even {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9).stream().filter(value -> value%2 == 0).collect(Collectors.toList()));
    }
}
