package question_8;

interface inter1 {
    default void display(){
        System.out.println("inter1");
    }
}

interface child1 extends inter1{
    default void display(){
        System.out.println("child1");
    }
}

interface child2 extends inter1{
    default void display(){
        System.out.println("child2");
    }
}

 class question4_c implements child1,child2 {
    public void display(){
        System.out.println("DefaultMethods");
    }

    public static void main(String[] args) {
        question4_c obj=new question4_c();
        obj.display();
    }
}

