package com.demo.tests;

/**
 * 懒汉模式
 * @author Teacher
 * @createTime 2017年7月26日 上午11:28:47
 * @version 1.0.0
 */
class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
}

/**
 * 使用单例模式的类
 * @author Teacher
 * @createTime 2017年7月26日 上午11:28:20
 * @version 1.0.0
 */
public class TestSingleton {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s);
		s = Singleton.getInstance();
		System.out.println(s);
		s = Singleton.getInstance();
		System.out.println(s);
	}

}
