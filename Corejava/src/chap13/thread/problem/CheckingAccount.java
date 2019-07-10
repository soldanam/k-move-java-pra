package chap13.thread.problem;

// 계좌
class Account {
	// 잔고
	private int balance;

	public Account(int initBalance) {
		this.balance = initBalance;
	}

	// 출금
	public boolean withdraw(int amount) {
		synchronized (this) {// balance가 들어갈 수 없음 => 객체가 아니라서 Accout계좌를 넣어야함으로, 내가 실행하고 있는 class 객체 this를
								// 넣어준다.   * 문제가 안생긴 줄 아는데 출금하는것만 해서 문제가 안생긴거임. 그래서 입금에서 synch를 넣어줌 
			//synchronized(this)이면 메소드 전체가 synch임 그래서 전체를 synch를 설정할 수 있음 그래서 public synchronize withdraw 이런식으로 넣을 수 있음
			if (amount <= balance) {
				try {
					Thread.sleep((int) Math.random() * 200);
				} catch (InterruptedException e) {
				} // 0-199이 된다. delay를 위해 근데 true가 6번 나온다. 이러면 안됨.

				balance -= amount;
				return true;
			}
			return false;
		}
	}
	/* 출금
		public synchronized boolean withdraw(int amount) {
			synchronized (this) {// balance가 들어갈 수 없음 => 객체가 아니라서 Accout계좌를 넣어야함으로, 내가 실행하고 있는 class 객체 this를
									// 넣어준다.   * 문제가 안생긴 줄 아는데 출금하는것만 해서 문제가 안생긴거임. 그래서 입금에서 synch를 넣어줌 
				//메소드 전체가 synch임 그래서 전체를 synch를 설정할 수 있음 그래서 public synchronize withdraw 이런식으로 넣을 수 있음
				if (amount <= balance) {
					try {
						Thread.sleep((int) Math.random() * 200);
					} catch (InterruptedException e) {
					} // 0-199이 된다. delay를 위해 근데 true가 6번 나온다. 이러면 안됨.

					balance -= amount;
					return true;
				}
				return false;
			}
		}*/
	// 입금
	public void deposit(int amount) {//
		synchronized (this) {
			balance += amount;	
		}
		
	}

	public int getBalance() {
		return balance;
	}
}

class WithdrawMoney implements Runnable {
	private Account account;

	public WithdrawMoney(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int count = 0; count < 5; count++) {
			System.out.println(name + "이(가) 10000원을 출금합니다." + " 결과: " + account.withdraw(10000));
		}
	}
}

public class CheckingAccount {
	public static void main(String[] args) {
		Account myAccount = new Account(50000);
		System.out.println("현재 잔고는 " + myAccount.getBalance() + "원입니다.");

		Runnable r = new WithdrawMoney(myAccount);
		Thread husband = new Thread(r, "남편");
		Thread wife = new Thread(r, "부인");
		husband.start();
		wife.start();

		// while (true) if (!husband.isAlive() && !wife.isAlive()) break;
		// System.out.println("현재 잔고는 " + myAccount.getBalance() + "원입니다.");
	}
}