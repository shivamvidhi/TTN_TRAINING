package question_12;



import java.util.*;

public class question12 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,5,6,7,8);
        System.out.println(list.stream().filter(e -> e%2==0 && e>3).findFirst().orElse(-1));

        Optional<Integer> optional = list.stream().filter(e -> e%2==0 && e>3).findFirst();
        if(optional.isPresent())
        {
            System.out.println(optional.get());
        }
        else
        {
            System.out.println("Not found");
        }
    }

}
