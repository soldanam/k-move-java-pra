// 계좌
class Account {
	// 잔고
	private int balance;
	
	public Account(int initBalance) {
		this.balance = initBalance;
	}
	// 출금
	public boolean withdraw(int amount) {
		if (amount <= balance) {   //try { Thread.sleep((int)Math.random()*200); } catch (InterruptedException e) {}
			balance -= amount;
			return true;
		}
		return false;
	}
	// 입금
	public void deposit(int amount) {
		balance += amount;
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
		
		//while (true) if (!husband.isAlive() && !wife.isAlive()) break;
		//System.out.println("현재 잔고는 " + myAccount.getBalance() + "원입니다.");
	}
}