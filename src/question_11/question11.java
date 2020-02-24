package question_11;

import java.util.stream.Stream;

public class question11 {
    public static void main(String[] args) {
        System.out.println(Stream.of(1,2,3,4,5,6).mapToInt(e->e*2).average());
    }
}
