package question_6;
interface methods
{
    static void add(int a , int b)
    {
        System.out.println(a+b);
    }
    default void multiply(int a, int b)
    {
        System.out.println(a*b);
    }
}
 class question4 implements methods{

    public static void main(String[] args) {
        question4 mul = new question4();
        mul.multiply(10,20);

        methods.add(10,20);
    }

}
