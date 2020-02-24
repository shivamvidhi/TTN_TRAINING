/*
(2) Increment the number by 1 and return incremented value
    Parameter (int) Return int
 */
package question_1;

interface incrementedValue
{
    int increment(int a);
}
public class question1B {
    public static void main(String[] args) {
        incrementedValue incv = (int a)->{return a+1;};
        int value = incv.increment(10);
        System.out.println(value);
    }
}
