/*
Create a functional interface whose method takes 2 integers and return one integer.
 */
package question_2;

interface oneParameter
{
    String oneP(String a, String b);
}
public class question2A {
    public static void main(String[] args) {
        oneParameter one  = (String a, String b) -> { return a;};

        String value = one.oneP("abcd", "efgh");
        System.out.println(value);
    }
}

