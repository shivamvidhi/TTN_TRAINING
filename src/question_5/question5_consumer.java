package question_5;


import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class question5_consumer {
    public static void main(String[] args) {

//        The Java Consumer interface is a functional interface that represents an function that
//        consumes a value without returning any value. A Java Consumer implementation could be printing
//        out a value, or writing it to a file, or over the network etc.


        Consumer<Integer> con = (value) -> System.out.println(value);
        con.accept(10);


//        The Java Supplier interface is a functional interface that represents an function that
//        supplies a value of some sorts. The Supplier interface can also be thought of as a factory interface.


        Supplier<Integer> sup = () -> 10;
        System.out.println(sup.get());

//        The Java Predicate interface, java.util.function.Predicate, represents a simple function that
//        takes a single value as parameter, and returns true or false.

        Predicate pred = (value) -> value != null;
        System.out.println(pred.test(3));
        System.out.println(Arrays.asList(1,2).stream().filter(pred).count());

        Function<Integer,String> f = value -> "Shivam";
        System.out.println(f.apply(10));

    }
}
