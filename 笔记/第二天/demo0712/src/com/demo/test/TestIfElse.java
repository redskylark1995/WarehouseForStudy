package com.demo.test;

import java.util.Scanner;

/**
 * 分支语句
 * if..else
 * @author Teacher
 * @createTime 2017年7月12日 下午5:10:15
 * @version 1.0.0
 */
public class TestIfElse {

	public static void main(String[] args) {
		//创建扫描器对象
		Scanner sc = new Scanner(System.in);
		//获得控制台输入的整数
		int age = sc.nextInt();
		//System.out.println("age="+age);
		//使用if..else语句判断年龄是否合法
		if(age<0) 
			System.out.println("您还没有出生，别着急!");  //若只有一行代码，可以省略{}
		else if(age>200) {
			System.out.println("超出已知寿命极限，请等待审查!");
		} else {
			System.out.println("您成功录入年龄，年龄: "+age);
		}
	}

}
