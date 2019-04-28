package com.demo.works;


/**
 * 账户类
 * @author Teacher
 * @createTime 2017年8月7日 上午9:32:54
 * @version 1.0.0
 */
class MyAccount {
	
	private String number;
	private String user;
	private double amount;
	
	public MyAccount(String number, String user, double amount) {
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
	
	/**
	 * 存入金额
	 * @param amount
	 */
	public void deposit(double amount) {
		synchronized (this) {
			this.amount += amount;
			System.out.println("存款:￥"+amount+"\t\t取款:￥0\t\t余额:￥"+this.amount);
			//唤醒等待的线程
			notify();
		}
	}
	
	/**
	 * 取出金额
	 * @param amount
	 * @throws InterruptedException 
	 */
	public void withdraw(double amount) throws InterruptedException {
		synchronized(this) {
			//判断余额是否不够
			if(this.amount<amount) {
				wait();
				//递归，再次判断金额是否足够
				withdraw(amount);
			} else {
				this.amount -= amount;
				System.out.println("存款:￥0\t\t取款:￥"+amount+"\t\t余额:￥"+this.amount);
			}
		}
	}
}

/**
 * 存款线程
 * @author Teacher
 * @createTime 2017年8月7日 下午2:53:05
 * @version 1.0.0
 */
class DepositThread extends Thread {
	
	private MyAccount account;
	
	public DepositThread(MyAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				//获得随机数，作为存入的金额
				double amount = Math.ceil(Math.random()*100); //1~100的随机数
				//访问资源对象，存入金额
				account.deposit(amount);
				//休眠1s
				sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

/**
 * 取款线程
 * @author Teacher
 * @createTime 2017年8月7日 下午2:53:13
 * @version 1.0.0
 */
class WithdrawThread extends Thread {
	
	private MyAccount account;
	
	public WithdrawThread(MyAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				//获得随机数，作为取出的金额
				double amount = Math.ceil(Math.random()*100);
				//访问资源对象，取出金额
				account.withdraw(amount);
				//休眠1s
				sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

/**
 * 多线程模拟存取款的案例
 * @author Teacher
 * @createTime 2017年8月7日 上午11:40:15
 * @version 1.0.0
 */
public class PersonAccountClient {

	public static void main(String[] args) {
		//System.out.println(Math.floor(3.8));
		//System.out.println(Math.ceil(0.2222));
		//创建账户对象
		MyAccount account = new MyAccount("6201478521145288", "小麦", 0);
		//创建线程对象
		Thread dt = new DepositThread(account);
		Thread wt = new WithdrawThread(account);
		//启动线程
		dt.start();
		wt.start();
	}

}
