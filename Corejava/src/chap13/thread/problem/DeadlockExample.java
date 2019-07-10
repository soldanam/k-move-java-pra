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
			System.out.println("�� �̸��� " + name + "�Դϴ�." + " :" + Thread.currentThread().getName());   //try { name.wait(); } catch (InterruptedException ie) { }
			synchronized (job) {
				System.out.println(name + "��(��) " + job + "�Դϴ�." + " :" + Thread.currentThread().getName());
			}
		}
	}
	
    public void printInfo2() {
        synchronized (job) {
            System.out.println("���� " + job + "�Դϴ�." + " :" + Thread.currentThread().getName());
            synchronized (name) {
                System.out.println(job + "�� �� �̸��� " + name + "�Դϴ�." + " :" + Thread.currentThread().getName());   //name.notify();
            }
        }
    }
}

public class DeadlockExample {//ThreadTest2�� ���� ���� 
    public static void main(String[] args) {
    	final Deadlock dead = new Deadlock("������", "���ӽ�");

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
public class DeadlockExample {//��ø Ŭ����? 
    public static void main(String[] args) {
        String name = "������";
        String job = "���ӽ�";

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
            System.out.println("�� �̸��� " + name + "�Դϴ�." + " :" + Thread.currentThread().getName());  //try { name.wait(); } catch (InterruptedException ie) { }            
            synchronized (job) {
                System.out.println(name + "��(��) " + job + "�Դϴ�." + " :" + Thread.currentThread().getName());
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
            System.out.println("���� " + job + "�Դϴ�." + " :" + Thread.currentThread().getName());            
            synchronized (name) {
                System.out.println(job + "�� �� �̸��� " + name + "�Դϴ�." + " :" + Thread.currentThread().getName());  //name.notify();
            }
        }
    }
}*/
