package Multi_Threading.question3;

public class question3_a extends Thread {
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    public void thread1() throws InterruptedException {
        synchronized (lock1)
        {
            System.out.println("this is Synchronised Block with lock 1");
            Thread.sleep(1000);
        }
    }
    public void thread2() throws InterruptedException {
        synchronized (lock2)
        {
            System.out.println("this is Synchronised Block with lock 2");
            Thread.sleep(1000);
        }
    }
    public void lockCall() throws InterruptedException {
        for(int i=0;i<5;i++)
        {
            thread1();
            thread2();
        }
    }
}
