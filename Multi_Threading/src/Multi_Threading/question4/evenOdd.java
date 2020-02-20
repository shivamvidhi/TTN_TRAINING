package Multi_Threading.question4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class evenOdd {
    private static int limit = 20;
    public static void main(String[] args) {
        Thread obj1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(i<=limit)
                {
                    System.out.println(i);
                    i+=2;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread obj2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 1;
                while(i<limit)
                {
                    System.out.println(i);
                    i+=2;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(obj1);
        executor.submit(obj2);
        executor.shutdown();
    }

}
