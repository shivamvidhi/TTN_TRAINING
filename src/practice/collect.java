package practice;



import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collect {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,6);


        System.out.println(list.stream().filter(e -> e>2 ).collect(Collectors.toList()));



        System.out.println(list.stream().filter(e -> e>2 ).collect(Collectors.toSet()));
    }
}
