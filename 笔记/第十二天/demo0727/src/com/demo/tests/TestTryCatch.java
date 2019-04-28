package com.demo.tests;

import java.io.IOException;

/**
 * try..catch 捕获并处理异常
 * @author Teacher
 * @createTime 2017年7月27日 下午3:11:40
 * @version 1.0.0
 */
public class TestTryCatch {
	
	public static void method() {
		try {
			int i = 8/0;
			System.out.println("i="+i);
		} catch(Exception e) {
			//输出异常信息
			//System.out.println("错误: "+e.getMessage());
			//堆栈输出异常信息
			e.printStackTrace();
		} finally {
			System.out.println("清理资源!");
		}
		System.out.println("执行完毕!");
	}
	
	public static void method2() {
		try {
			
		} catch(Exception e) {
			
		}
		
		try {

		} catch(Exception e) {

		} finally {
			
		}
		
		try {

		} finally {
			
		}
		
		/*try { //错误，try{}不能单独存在
			
		}*/
	}
	
	public static void method3() {
		try {
			
		} catch(RuntimeException e) {
			
		} catch(Exception e) {
			
		}
		
        try {
			
		} catch(IllegalArgumentException e) {
			
		} catch(NullPointerException e) { //不存在is a关系，两个异常类型的顺序任意。
			
		} catch(RuntimeException e) {
			
		} catch(Exception e) {//存在is a关系，遵守“先子类，后父类”的规则。

			
		}
	}
	
	public static int method4() {
		int i;
		try {
			i = 10;
			return i; //已经确定要返回的值，再执行finall{}语句块，然后回到return指令，返回值（该值是前面确定的值，值未改变）。
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("------程序执行完毕!------");
			i = 20;
			return i; //终止方法的执行，返回方法的调用的位置。
		}
		//return 0;
	}

	public static void main(String[] args) {
		method();
		method2();
		method3();
		System.out.println(method4());
	}

}
