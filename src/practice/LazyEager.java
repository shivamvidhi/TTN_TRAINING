package practice;

import java.util.*;
import java.util.stream.Collectors;

public class LazyEager {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(
                list
                .stream()
                .filter(  e -> {
                    System.out.println("Filter>>>>>"+e);
                    return e>1;
                })
                .map(e ->
                {
                    System.out.println("Map>>>>>>>>>>>"+e);
                    return e*2;
                })
                .collect(Collectors.toList())
        );
    }
}
