package practice;

import java.util.Arrays;

public class oddelements {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4,5,6).stream().filter(value -> value % 2 == 0).forEach(System.out::println);
    }
}
