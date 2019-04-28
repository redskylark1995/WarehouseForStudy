package com.demo.test2;

import com.demo.test.Transportation;

public class Bus extends Transportation {

	public static void main(String[] args) {
		Transportation trans = new Transportation();
		//不同包中的类
		//System.out.print(trans.number); //编译失败，无访问权限
		//System.out.print(trans.price+"\t"); //编译失败，无访问权限
		//System.out.print(trans.type+"\t"); //编译失败，无访问权限
		System.out.print(trans.createTime+"\t");
		System.out.println();
		
		//不同包中子类
		Bus bus = new Bus();
		//System.out.print(bus.number); //编译失败，无访问权限
		//System.out.print(bus.price+"\t"); //编译失败，无访问权限
		//不同包的子类可以继承父类中public、protected修饰的属性或方法
		System.out.print(bus.type+"\t"); //通过继承方式，访问父类中受保护的属性或方法
		System.out.print(bus.createTime+"\t");
		System.out.println();
	}

}
