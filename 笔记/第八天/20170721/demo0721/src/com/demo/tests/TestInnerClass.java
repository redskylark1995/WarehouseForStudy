package com.demo.tests;

/**
 * 顶层类
 * 包含四种内部类
 * @author Teacher
 * @createTime 2017年7月21日 上午11:35:17
 * @version 1.0.0
 */
class TopClass {
	
	private int i = 10;
	private static int j = 20;
	
	/*class TopClass { //内部类不能与它的外层类的类名相同
		
	}*/
	
	//普通内部类
	public class SimpleInnerClass {
		
		//class A {} //内部类中可以存在内部类
		
	    public void printInfo() {
	    	System.out.println("sum="+(i+j));
	    }
		
	}
	
	//方法本地内部类
	public void method() {
		int k = 30;
		//new MethodLocalInnerClass(); //错误； 须遵守“先定义，后使用”的规则
		//只能使用abstract、final修饰符
	    class MethodLocalInnerClass {		
			public void printInfo() {
				System.out.println("sum="+(i+j+k));
			}
		}
	    new MethodLocalInnerClass();
	}
	
	//静态内部类
	static class staticInnerClass {
		
		/*class staticInnerClass_2 { //成功
			
		}*/
		
		public void printInfo() {
			//System.out.println("sum="+(i+j)); //不能直接使用i变量，只能直接使用静态成员
			System.out.println("sum="+j);
		}
	}
	
	//静态块中内部类
	static {
		class staticInnerClass {
			
		}
		//new staticInnerClass();
		//new staticInnerClass();
	}
	
}

abstract class Person {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void printInfo();
	
}

public class TestInnerClass {

	public static void main(String[] args) {
		//匿名类（匿名内部类）
		Person p = new Person() {		
			@Override
			public void printInfo() {
				System.out.println("姓名: "+name);
			}
		};
		/*p.printInfo();*/
	}

}
