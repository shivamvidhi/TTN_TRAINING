package practice;


import java.util.*;

public class variable_capture {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        int var=10;
        // var++; this line will give error. we cannot modify the variable that we are using in the lambda function.
;        integerList.forEach(e->System.out.println(e+var));
        integerList.forEach(System.out::println);
        // Lambdas can refer to local variables that are not declared final (but are never modified)
    }
}
