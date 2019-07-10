package chap13.thread.control;

class StoppableThread extends Thread {
    private boolean timeToQuit = false;
    private int count;

    @Override
    public void run() {
        while (!timeToQuit) {
            // do work until we are told to quit
            System.out.println("count = " + count++);
        }
        
        System.out.println("Thread " + Thread.currentThread().getName() + " completed");
    }

    public void stopRunning() {
        timeToQuit = true;
    }
}

public class ThreadControlTest {
    public static void main(String[] args) {
    	StoppableThread st = new StoppableThread();
        // start the thread
        st.start();
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // stop the thread
        st.stopRunning();//stop대신 이렇게 사용한다.
       
        
        System.out.println("End of main()");
    }
}
