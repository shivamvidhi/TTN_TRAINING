package Multi_Threading.question5;

import java.util.Scanner;

public class waitAndNotify {

    public static void main(String[] args) throws InterruptedException {
        waitAndNotify obj = new waitAndNotify();

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    obj.addQueue();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    obj.deleteQueue();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        th1.start();
        th2.start();
        th1.join();
        th2.join();

    }
    private void addQueue() throws InterruptedException {
        synchronized (this)
        {
            System.out.println("Item Added");
            Thread.sleep(1000);
            System.out.println("Waited for action");
            wait();
            System.out.println("I'm back");
        }

    }
    private void deleteQueue() throws InterruptedException {
        synchronized (this)
        {

            Thread.sleep(1000);
            new Scanner(System.in).nextLine();
            System.out.println("Item Deleted");
            notify();
        }

    }
}


