package question_10;

import java.util.stream.Stream;

public class question10 {
    public static void main(String[] args) {

        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9,10,11).filter(value -> value > 5).mapToInt(e -> e).sum());

    }
}
