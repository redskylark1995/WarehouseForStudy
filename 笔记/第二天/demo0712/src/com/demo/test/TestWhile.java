package com.demo.test;

/**
 * 测试三种循环
 * @author Teacher
 * @createTime 2017年7月12日 下午5:41:20
 * @version 1.0.0
 */
public class TestWhile {

	public static void main(String[] args) {
		//输出1..10十个数字
		//while循环
		int i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		//do..while循环
		i=1;
		do {
			System.out.print(i+" ");
			i++;
		} while(i<=10);
		System.out.println();
		//for循环
		for(int j=1; j<=10; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
		//循环嵌套
		//控制台输出下列效果的字符
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		for(int j=0; j<5; j++) {
			//System.out.println(" "+'*');
			//循环输出*
			for(int k=0; k<=j; k++) { 
				System.out.print(" "+'*');
			}
			//换行
			System.out.println(); 
		}
	}

}






