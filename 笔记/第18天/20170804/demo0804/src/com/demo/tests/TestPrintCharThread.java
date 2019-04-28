package com.demo.tests;

/**
 * 输出任意字符，可控次数的线程
 * @author Teacher
 * @createTime 2017年8月4日 下午4:34:51
 * @version 1.0.0
 */
class PrintCharThread extends Thread {
	
	private char c;
	private int times;
	
	public PrintCharThread(char c, int times) {
		this.c = c;
		this.times = times;
	}
	
	@Override
	public void run() {
		for(int i=0; i<times; i++) {
			if(i!=0&&i%10==0) {
				System.out.println();
			}
			System.out.print(c);
			System.out.print(' ');
		}
	}
	
}


public class TestPrintCharThread {

	public static void main(String[] args) throws InterruptedException {
		/*//创建线程组
		ThreadGroup tg = new ThreadGroup("线程组");
		//循环创建10个线程
		for(int i=0; i<10; i++) {
			//创建线程，并添加到线程组中
			Thread t = new Thread(tg, new PrintCharThread((char)('A'+i), 100));
			//启动线程
			t.start();
		}
		//循环判断线程组中是否存在活动线程
		while(tg.activeCount()>0) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n程序执行完毕!");*/
		
		//创建线程对象
		Thread t1 = new PrintCharThread('渝', 100);
		Thread t2 = new PrintCharThread('川', 100);
		t1.start();
		t2.start();
	    //当前线程等待线程t1、t2执行结束
		t1.join();
		t2.join();
		System.out.println("\n程序执行完毕!");
	}

}
