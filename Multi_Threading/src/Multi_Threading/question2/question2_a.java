package Multi_Threading.question2;

public class question2_a extends Thread {
    public void run()
    {
        int i=0;
        while(i<5)
        {
            System.out.println("This is extending Thread Class");
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        question2_a obj = new question2_a();
        obj.start();
    }
}
