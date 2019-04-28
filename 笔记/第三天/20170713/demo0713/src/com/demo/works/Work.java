package com.demo.works;

import java.util.Scanner;

/**
 * 作业
 * @author Teacher
 * @createTime 2017年7月13日 上午9:36:02
 * @version 1.0.0
 */
public class Work {

	public static void main(String[] args) {
		/*//控制台输入一个整数作为年龄，输出年龄所处得阶段
		//获得输入一个整数
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //判断年龄，输出年龄所处得阶段
        if(age<0||age>200) {
        	System.out.println("超出年龄范围[0..200]!");
        } else if(age>=0&&age<18) {
        	System.out.println("未成年!");
        } else if(age>=18&&age<40) {
        	System.out.println("青壮年!");
        } else if(age>=40&&age<65) {
        	System.out.println("中年!");
        } else {
        	System.out.println("老年");
        }*/
		/*//计算出1..10阶层的和
		int sum = 0;
		for(int i=1; i<=10; i++) {
			//计算阶层
			int rs = 1;
			for(int j=i; j>0; j--) {
				rs *= j;
			}
			//累加计算出的阶层的值
			sum += rs;
		}
		System.out.println("1..10阶层的和: "+sum);*/
		/*//控制台输出九九乘法表
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+"*"+i+"="+j*i);
				System.out.print("\t");
			}
			System.out.println();
		}*/
		/*//控制台打印输出菱形的字符
		int rowCount = 4;
		//上部分
		for(int i=1; i<=rowCount; i++) {
			//循环输出前面空格
			for(int j=1; j<=rowCount-i; j++) {
				System.out.print("  ");
			}
			//循环输出字符*
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		//下部分
		for(int i=rowCount-1; i>0; i--) {
			//循环输出前面空格
			for(int j=1; j<=rowCount-i; j++) {
				System.out.print("  ");
			}
			//循环输出字符*
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}*/
		
		//综合输出菱形的代码
		int rowCount = 4;
		int i = 1;
		boolean state = false;
		for( ; ; ) {
			//循环输出前面空格
			for(int j=1; j<=rowCount-i; j++) {
				System.out.print("  ");
			}
			//循环输出字符*
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(" *");
			}
			System.out.println();
			if(i<rowCount&&!state) {//控制上部分输出     // state值为false时， !state 相当于 state==false
				i++;
			} else { //控制下部分输出
				state = true;
				i--;
			}
			if(i<=0) {
				break;
			}
		}
	}

}















