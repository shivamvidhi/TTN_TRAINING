/*
(3) Concatination of 2 string
    Parameter (String , String ) Return (String)
 */
package question_1;

interface concatenation
{
    String concat(String a, String b);
}
public class question1C {
    public static void main(String[] args) {
        concatenation cat  = (String a, String b)->{return a+b;};
        String value = cat.concat("abcd", "efgh");
        System.out.println(value);
    }
}

