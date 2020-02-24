package question_7;
interface method
{
    default void add()
    {
        System.out.println("This is the addition method");
    }
}
 class question4_b implements method {

    @Override
    public void add() {

        System.out.println("This is the overridden addition method");

    }

    public static void main(String[] args) {
        question4_b obj = new question4_b();
        obj.add();
    }
}
