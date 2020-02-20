package Multi_Threading.question3;

public class question3_b extends Thread {
    private static int count = 0;
    public void  run()
    {
        doTask();
    }

    private synchronized void doTask() {
        for(int i=0;i<5;i++) {
            count++;

        }
    }

    public static void main(String[] args) throws InterruptedException {
        question3_b obj1 = new question3_b();
        question3_b obj2 = new question3_b();
        obj1.start();
        obj2.start();
        obj1.join();
        obj2.join();
        System.out.println(count);

    }
}
