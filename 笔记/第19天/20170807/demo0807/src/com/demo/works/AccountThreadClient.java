package com.demo.works;

/**
 * 账户类
 * @author Teacher
 * @createTime 2017年8月7日 上午9:32:54
 * @version 1.0.0
 */
class Account {
	
	private String number;
	private String user;
	private double amount;
	
	public Account(String number, String user, double amount) {
		this.number = number;
		this.user = user;
		this.amount = amount;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	/*public synchronized void setAmount(double amount) {
		try {
			//获得当前的余额
			double temp = this.amount;
			Thread.sleep(10);
			//加上存入的金额
			temp += amount;
			//设置余额的值
			this.amount = temp;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	
	
	
}

class AccountThread extends Thread {
	
	private Account account;
	
	public AccountThread(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		/*//账户中存入金额
		account.setAmount(10);*/
		try {
			//同步语句块
			synchronized(account) {
				//获得当前的余额
				double amount = account.getAmount();
				sleep(10);
				//加上存入的金额
				amount += 10;
				//设置账户中的余额
				account.setAmount(amount);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

/**
 * 使用账户线程类
 * @author Teacher
 * @createTime 2017年8月7日 上午9:26:05
 * @version 1.0.0
 */
public class AccountThreadClient {

	public static void main(String[] args) {
		try {
			ThreadGroup group = new ThreadGroup("AccountThreadGroup");
			Account account = new Account("50004617831456001", "小玲", 0);
			for(int i=0; i<100; i++) {
				Thread t = new Thread(group, new AccountThread(account));
				t.start();
			}
			while(group.activeCount()>0) {
				Thread.sleep(50);
			}
			System.out.println(account.getNumber()
					+"\t"+account.getUser()+"\t"+account.getAmount());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
