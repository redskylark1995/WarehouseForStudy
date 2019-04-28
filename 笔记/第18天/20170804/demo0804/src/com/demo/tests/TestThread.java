package com.demo.tests;

/**
 * 继承Thread类创建线程
 * @author Teacher
 * @createTime 2017年8月4日 下午3:08:01
 * @version 1.0.0
 */
class PrintAThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			if(i!=0&&i%10==0) {
				System.out.println();
			}
			System.out.print('A');
			System.out.print(' ');
		}
	}
	
}

/**
 * 实现Runnable接口创建线程
 * @author Teacher
 * @createTime 2017年8月4日 下午3:09:51
 * @version 1.0.0
 */
class PrintBThread implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			if(i!=0&&i%10==0) {
				System.out.println();
			}
			System.out.print('B');
			System.out.print(' ');
		}
	}
	
}

public class TestThread {

	public static void main(String[] args) {
		//创建对象
		Thread t1 = new PrintAThread();
		Thread t2 = new Thread(new PrintBThread());
		//System.out.println(t1.isAlive());
		//System.out.println(t1.getPriority());
		//System.out.println(t2.getPriority());
		//设置优先级，线程的优先级只是控制获得CPU资源的概率。不能保证高优先级的线程一定能抢到资源。
		t1.setPriority(1);
		t2.setPriority(10);
		//启动线程
		t2.start();
		t1.start();
		//System.out.println(t1.isAlive());
		while(t1.isAlive()||t2.isAlive()) {
			try {
				Thread.sleep(50); //单位: 毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("程序执行完毕!");
	}

}
