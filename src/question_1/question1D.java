/*
(4) Convert a string to uppercase and return .
    Parameter (String) Return (String)
 */
package question_1;


interface caseChange
{
    String upperCase(String a);
}
public class question1D {
    public static void main(String[] args) {
        caseChange cas  = (String a) -> { return a.toUpperCase();};

        String value = cas.upperCase("abcd");
        System.out.println(value);
    }
}