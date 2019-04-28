package com.demo.tests;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 输出数字的线程的任务
 * @author Teacher
 * @createTime 2017年8月7日 下午4:33:49
 * @version 1.0.0
 */
class PrintNumber implements Runnable {

	private int v;

	public PrintNumber(int v) {
		this.v = v;
	}

	@Override
	public void run() {
		//Thread.currentThread()  获得当前执行线程的对象
		System.out.println(Thread.currentThread().getName()+"\t"+v);
	}

}

/**
 * 使用线程池
 * 线程池：控制线程的数量、重复利用线程、节省内存资源、提高程序性能的一种多线程处理形式。
 * 等待队列，若线程数达到上限且没有空闲线程，线程进入等待队列中，等待被执行；线程从队列提取任务执行按照添加到池中的先后顺序。
 * @author Teacher
 * @createTime 2017年8月7日 下午4:31:47
 * @version 1.0.0
 */
public class TestThreadPool {

	public static void main(String[] args) {
		/*//单例线程池
		ExecutorService service = Executors.newSingleThreadExecutor();
		//添加任务
		service.execute(new PrintNumber(1));
		service.execute(new PrintNumber(2));
		service.execute(new PrintNumber(3));
		service.execute(new PrintNumber(4));
		service.execute(new PrintNumber(5));
		service.execute(new PrintNumber(6));
		service.execute(new PrintNumber(7));
		//关闭线程池
		service.shutdown();*/
		/*//固定大小的线程池
		ExecutorService service = Executors.newFixedThreadPool(3);
		//添加任务
		service.execute(new PrintNumber(1));
		service.execute(new PrintNumber(2));
		service.execute(new PrintNumber(3));
		service.execute(new PrintNumber(4));
		service.execute(new PrintNumber(5));
		service.execute(new PrintNumber(6));
		service.execute(new PrintNumber(7));
		service.execute(new PrintNumber(8));
		service.execute(new PrintNumber(9));
		service.execute(new PrintNumber(10));
		service.execute(new PrintNumber(11));
		service.execute(new PrintNumber(12));
		service.execute(new PrintNumber(13));
		service.execute(new PrintNumber(14));
		service.execute(new PrintNumber(15));
		service.execute(new PrintNumber(16));
		service.execute(new PrintNumber(17));
		service.execute(new PrintNumber(23));
		service.execute(new PrintNumber(25));
		service.execute(new PrintNumber(26));
		service.execute(new PrintNumber(18));
		//关闭线程池
		service.shutdown();*/
		/*//可缓存的线程池，是一种无限线程池, 最大线程数由硬件设备(内存)确定
		ExecutorService service = Executors.newCachedThreadPool();
		//添加任务
		service.execute(new PrintNumber(1));
		service.execute(new PrintNumber(2));
		service.execute(new PrintNumber(3));
		service.execute(new PrintNumber(4));
		service.execute(new PrintNumber(5));
		service.execute(new PrintNumber(6));
		service.execute(new PrintNumber(7));
		service.execute(new PrintNumber(8));
		service.execute(new PrintNumber(9));
		service.execute(new PrintNumber(10));
		service.execute(new PrintNumber(11));
		service.execute(new PrintNumber(12));
		service.execute(new PrintNumber(13));
		service.execute(new PrintNumber(14));
		service.execute(new PrintNumber(15));
		service.execute(new PrintNumber(16));
		service.execute(new PrintNumber(17));
		service.execute(new PrintNumber(23));
		service.execute(new PrintNumber(25));
		service.execute(new PrintNumber(26));
		service.execute(new PrintNumber(18));
		//关闭线程池
		service.shutdown();*/
		//支持定时安排计划的线程, 也是一种无限线程池
		ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
		//延迟指定的时间，再执行任务
		service.schedule(new PrintNumber(1), 1, TimeUnit.SECONDS);
		//添加定时周期性执行任务
		service.scheduleAtFixedRate(new PrintNumber(2), 1, 3, TimeUnit.SECONDS);
		//关闭线程池
		//service.shutdown();
	}

}















