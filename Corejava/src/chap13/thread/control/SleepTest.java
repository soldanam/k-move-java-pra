package chap13.thread.control;

public class SleepTest {
    public static void main(String[] args) {
        Thread t = new Thread(new CountDown());
        t.start();
    }
}

class CountDown implements Runnable {
    @Override
    public void run() {
        try {//
            System.out.println("Count Down...");

            for (int i = 10; i > 0; i--) {
                System.out.println("count: " + i);
                Thread.sleep(1000);
            }

            System.out.println("Fire!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
