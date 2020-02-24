package practice;

import java.util.*;
import java.util.stream.Collectors;

public class nullSafe {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,null,2,null);
       System.out.println(list.stream().map(e-> e).collect(Collectors.toList()));
        list.stream().forEach(e -> System.out.println(e));
        //list.stream().filter(e-> e>1).findFirst();
    }
}
