package com.demo.test;

/**
 * 内存分配
 * @author Teacher
 * @createTime 2017年7月19日 下午3:57:31
 * @version 1.0.0
 */
public class TestMemoryDistribution {
	
	private Person p = new Person("0002", "Tom");
	
	public static void main(String[] args) {
		int x = 10;
		int y = 100;
		Person p = new Person("0001", "张三");
		System.out.println(p);
		p = new Person("0001", "张三");
		System.out.println(p);
		new TestMemoryDistribution();
	}
	
}
