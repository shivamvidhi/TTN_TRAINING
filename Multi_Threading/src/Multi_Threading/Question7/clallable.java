package Multi_Threading.Question7;

import java.util.concurrent.*;

public class clallable {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        Future<Integer> future = exec.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Starting...");
                Thread.sleep(1000);
                System.out.println("Finished...");
                return null;
            }
        });
        exec.shutdown();
        try {
            System.out.println("Result is "+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
