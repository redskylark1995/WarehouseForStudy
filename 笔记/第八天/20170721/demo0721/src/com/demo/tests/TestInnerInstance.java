package com.demo.tests;

import com.demo.tests.OuterClass.SimpleInnerClass;
import com.demo.tests.OuterClass.StaticInnerClass;

class OuterClass {
	
	public class SimpleInnerClass {
		
		public void printInfo() {
			System.out.println("普通内部类!");
		}
	}
	
	public static class StaticInnerClass {

		public void printInfo() {
			System.out.println("静态内部类!");
		}
	}
	
	public void method() {
		SimpleInnerClass sic = new SimpleInnerClass();
		StaticInnerClass stic = new StaticInnerClass();
	}
	
	public static void staticMethod() {
		/*OuterClass oc = new OuterClass();
		SimpleInnerClass sic = oc.new SimpleInnerClass();*/
		SimpleInnerClass sic = new OuterClass().new SimpleInnerClass();
		StaticInnerClass stic = new StaticInnerClass();
	}
	
}

/**
 * 创建内部类的对象
 * @author Teacher
 * @createTime 2017年7月21日 下午2:28:03
 * @version 1.0.0
 */
public class TestInnerInstance {
	
	public void method( ) {
		//引入内部类前
		/*OuterClass.SimpleInnerClass sic = new OuterClass().new SimpleInnerClass();
		OuterClass.StaticInnerClass stic = new OuterClass.StaticInnerClass();*/
		//引入内部类后
		SimpleInnerClass sic = new OuterClass().new SimpleInnerClass();
		StaticInnerClass stic = new StaticInnerClass();
	}

	public static void main(String[] args) {
		//引入内部类前
		/*OuterClass.SimpleInnerClass sic = new OuterClass().new SimpleInnerClass();
		OuterClass.StaticInnerClass stic = new OuterClass.StaticInnerClass();*/
		//前面的OuterClass.  路径，全写：com.demo.tests.OuterClass.
		//"="后面的OuterClass.  访问类中类成员（静态变量、静态方法、静态内部类）
		
		
		//引入内部类后
		SimpleInnerClass sic = new OuterClass().new SimpleInnerClass();
		OuterClass.StaticInnerClass stic = new StaticInnerClass();
		
		sic.printInfo();
		stic.printInfo();
	}

}
