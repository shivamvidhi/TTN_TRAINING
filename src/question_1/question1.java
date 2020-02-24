/*
1)  First number is greater than second number or not
    Parameter (int ,int ) Return boolean
 */




package question_1;

import java.util.Scanner;
@FunctionalInterface
interface calculate
{
    boolean greater(int a, int b);
}
public class question1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        calculate c = (int a, int b) -> {
            if(a>b)
            {System.out.println("First number i.e. "+a+" is greater than "+b);
            return true;}
            return false;
        };
        c.greater(2,1);
    }
}
