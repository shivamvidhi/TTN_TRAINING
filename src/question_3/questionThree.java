/*
Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create
and apply multiplication method for the functional interface created.
 */
package question_3;

interface operations
{
    void display(int a, int b);
}
public class questionThree {
    static void ADD(int a , int b)
    {
        System.out.println(a+b);
    }
    static void SUBTRACT(int a , int b)
    {
        if(a>=b) System.out.println(a-b);
        else System.out.println(b-a);
    }
    void MULTIPLY(int a , int b)
    {
        System.out.println(a*b);
    }
    void DIVIDE(int a , int b)
    {
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        operations add = questionThree::ADD;
        add.display(10,20);

        operations sub = questionThree::SUBTRACT;
        sub.display(10,20);

        operations mul = new questionThree()::MULTIPLY;
        mul.display(10,20);

        operations div = new questionThree()::DIVIDE;
        div.display(20,10);
    }


}
