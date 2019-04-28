package com.demo.test;

class Parent {
	
	int value = 10;
	
	public int getValue() {
		System.out.println("父类中方法!");
		return value;
	}
	
	public static void print() {
		System.out.println("父类中静态方法!");
	}
	
	public Person method() {
		return null;
	}
	
}

class Sub1 extends Parent {
	
	int value = 100;
	int x = 200;
	
	@Override
	public int getValue() {
		System.out.println("子类1中方法!");
		return value;
	}
	
	//@Override   静态方法没有重写，静态方法属于类的
	public static void print() {
		System.out.println("子类中静态方法!");
	}
	
	@Override   //返回值类型可以是子类的类型
	public Student method() {
		return null;
	}
}

class Sub2 extends Parent {
	
	int value = 1000;
	
	@Override
	public int getValue() {
		System.out.println("子类2中方法!");
		return value;
	}
}


/**
 * 运行时多态
 * 重写
 * @author Teacher
 * @createTime 2017年7月18日 上午11:24:58
 * @version 1.0.0
 */
public class TestRunningMultiState {

	public static void main(String[] args) {
		/*Parent p = new Parent();
		System.out.println(p.getValue());
		p = new Sub1();
		System.out.println(p.getValue());
		p = new Sub2();
		System.out.println(p.getValue());*/
		Parent p = new Sub1();
		System.out.println(p.value); //10     访问的是父类的属性
		//System.out.println(p.x); //错误：父类引用访问不到子类的自定义属性、方法
		System.out.println(p.getValue()); //访问的是子类的方法
		p.print();  //访问的父类的静态方法
	}

}
