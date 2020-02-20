package Multi_Threading.question3;

public class Main {
   static question3_a obj = new question3_a();
    public static void main(String[] args) throws InterruptedException {


        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    obj.lockCall();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    obj.lockCall();
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
}
