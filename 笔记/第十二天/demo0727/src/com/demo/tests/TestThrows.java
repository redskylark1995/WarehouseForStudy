package com.demo.tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * 自定义异常类
 * @author Teacher
 * @createTime 2017年7月27日 下午4:54:09
 * @version 1.0.0
 */
class MyException extends Exception {
	
	private String message;
	
	public MyException() {
		this.message = "参数不能是负数,包括0!";
	}
	
	public MyException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
}

/**
 * throws抛出异常
 * @author Teacher
 * @createTime 2017年7月27日 下午4:19:29
 * @version 1.0.0
 */
public class TestThrows {

	public void method() throws Exception {
		//int i=8/0;
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		format.parse("2017-08-09");
	}
	
	public void method2(int value) throws Exception {
		if(value<0) {
			//throw new Exception("参数不能是负数!");
			throw new MyException();
		}
		System.out.println("value="+value);
	}
	
	public static void main(String[] args) throws Exception {
		TestThrows tt = new TestThrows();
		/*try {
			tt.method();
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
		tt.method();
		tt.method2(100);
		tt.method2(-1);
	}

}
