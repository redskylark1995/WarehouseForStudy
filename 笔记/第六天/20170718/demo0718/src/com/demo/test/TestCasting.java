package com.demo.test;

class A {
	
}

class B extends A {
	
}

class C extends A {
	
}

class D extends B {
	
}

/**
 * 上下转型
 * @author Teacher
 * @createTime 2017年7月18日 下午3:28:50
 * @version 1.0.0
 */
public class TestCasting {

	public static void main(String[] args) {
		//上转型
		A a = new B();
		a = new C();
		a = new D();
		
		//B b = new C(); //不存在is-a关系，不能上转型
		//B b = (B)new C(); //不存在is-a关系，不能下转型
		
		//下转型
		A a1 = new B();
		B b1 = (B) a1;
		
		//B b2 = (B) new A(); //编译通过，运行时出错。
		
		A a2 = new D();
		D d2 = (D) a2;
		B b2 = (B) a2;
		
		//C c2 = (C) a2;  //编译通过，运行时出错。
		
		System.out.println("程序运行完毕!");
		
		A aa = new A();
		A aa2 = new B();
		B bb = new B();
		System.out.println(aa instanceof A); //true
		System.out.println(aa2 instanceof A); //true
		System.out.println(bb instanceof A); //true
		System.out.println(bb instanceof B); //true
		System.out.println(bb instanceof Object); //true
	}

}













