package Multi_Threading.question2;

public class question2_b implements Runnable {
    @Override
    public void run()
    {
        int i = 0;
        while(i<5)
        {
            System.out.println("This is implementing Runnable interface");
            i++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread th = new Thread(new question2_b());
        th.start();
    }
}
