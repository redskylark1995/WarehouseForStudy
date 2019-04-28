package com.demo.tests;

import java.io.IOException;

class Parent {
	
	public void method() throws IOException {
		
	}
	
	public void method2() {

	}
}

class Sub extends Parent {

	public void method() {

	}
	
	/*public void method2() throws IOException { //编译失败：父类中的method2()方法没有抛出这个异常（注意：编译时异常才遵守这个规则）

	}*/
}

/**
 * 输出字符串线程
 * @author Teacher
 * @createTime 2017年8月4日 下午5:42:03
 * @version 1.0.0
 */
class PrintStringThread extends Thread {
	
	@Override
	public void run() {
		try {
			for(int i=0; i<50; i++) {
				System.out.println("中软国际!");
				sleep(200);
			}
		} catch(InterruptedException e) {
			//e.printStackTrace();
		}
	}
	
}

/**
 * 使用中断标识结束线程
 * @author Teacher
 * @createTime 2017年8月4日 下午5:41:04
 * @version 1.0.0
 */
public class TestInterrupt {

	public static void main(String[] args) {
        Thread t = new PrintStringThread();
        //t.interrupt();
        t.start();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        t.interrupt();
	}

}
