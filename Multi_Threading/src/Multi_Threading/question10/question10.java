package Multi_Threading.question10;

public class question10 {
    public static void main(String[] args) {
        String sampleText = "randomStuff";
        String anotherSampleText = "anotherRandomStuff";

        Thread thread = new Thread() {
            @Override
            public void run() {
                synchronized (sampleText) {
                    System.out.println("sampleText is with thread");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (anotherSampleText) {
                        System.out.println("anotherSampleText is with thread");
                    }
                }
            }
        };

        Thread anotherThread = new Thread() {
            @Override
            public void run() {
                synchronized (anotherSampleText) {
                    System.out.println("anotherSampleText is with anotherThread");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (sampleText) {
                        System.out.println("sampleText is with anotherThread");
                    }
                }
            }
        };

        thread.start();
        anotherThread.start();
    }
}
