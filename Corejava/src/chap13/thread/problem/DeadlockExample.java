package chap13.thread.problem;


class Deadlock {
	private String name;
	private String job;

	public Deadlock(String name, String job) {
        this.name = name;
        this.job = job;
    }

	public void printInfo1() {
		synchronized (name) {
			System.out.println("제 이름은 " + name + "입니다." + " :" + Thread.currentThread().getName());   //try { name.wait(); } catch (InterruptedException ie) { }
			synchronized (job) {
				System.out.println(name + "은(는) " + job + "입니다." + " :" + Thread.currentThread().getName());
			}
		}
	}
	
    public void printInfo2() {
        synchronized (job) {
            System.out.println("저는 " + job + "입니다." + " :" + Thread.currentThread().getName());
            synchronized (name) {
                System.out.println(job + "인 제 이름은 " + name + "입니다." + " :" + Thread.currentThread().getName());   //name.notify();
            }
        }
    }
}

public class DeadlockExample {//ThreadTest2를 같이 보자 
    public static void main(String[] args) {
    	final Deadlock dead = new Deadlock("아이유", "댄스머신");

        Thread t1 = new Thread(new Runnable() {
        	@Override
        	public void run() {
        		dead.printInfo1();
        	};
        });
        
        Thread t2 = new Thread(new Runnable() {
        	@Override
        	public void run() {
        		dead.printInfo2();
        	}
        });
        
        t1.start();
        t2.start();
    }
}

/*
public class DeadlockExample {//중첩 클래스? 
    public static void main(String[] args) {
        String name = "아이유";
        String job = "댄스머신";

        Thread t1 = new FirstThread(name, job);
        Thread t2 = new SecondThread(name, job);
        t1.start();
        t2.start();
    }
}

class FirstThread extends Thread {
    private String name, job;

    public FirstThread(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public void run() {
        synchronized (name) {
            System.out.println("제 이름은 " + name + "입니다." + " :" + Thread.currentThread().getName());  //try { name.wait(); } catch (InterruptedException ie) { }            
            synchronized (job) {
                System.out.println(name + "은(는) " + job + "입니다." + " :" + Thread.currentThread().getName());
            }
        }
    }
}

class SecondThread extends Thread {
    private String name, job;

    public SecondThread(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public void run() {
        synchronized (job) {
            System.out.println("저는 " + job + "입니다." + " :" + Thread.currentThread().getName());            
            synchronized (name) {
                System.out.println(job + "인 제 이름은 " + name + "입니다." + " :" + Thread.currentThread().getName());  //name.notify();
            }
        }
    }
}*/
