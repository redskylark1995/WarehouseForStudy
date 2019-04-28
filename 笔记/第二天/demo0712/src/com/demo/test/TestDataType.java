package com.demo.test;

/**
 * 测试数据类型
 * @author Teacher
 * @createTime 2017年7月12日 上午11:42:41
 * @version 1.0.0
 */
public class TestDataType {

	public static void main(String[] args) {
		//整型
		byte b = 8;
		short s = 8;
		int i = 8;
		long l = 8;
		long l2 = 10000000000L; //长整型的常量值，必须在其后加上L|l
		//浮点型
		double d = 3.2;
		double d2 = 3.2D; //常量值默认为double型
		float f = 8;
		float f2 = 3.2f; //常量值后添加F|f，表示常量值是单精度float型，此处必须加F|f
		//字符型
		char c = 'a';
		char c2 = '1';
		char c3 = '中';
		char c4 = '\u42e9'; //unicode码
		//控制台输出结果
		System.out.println(c3);
		System.out.println(c4);
		//练习一
		//定义两个变量，将变量的值交换，输出交换后的结果
		int x=10, y=20;
		/*int temp;
		temp = x;
		x = y;
		y = temp;*/
		x = x+y;  //30
		y = x-y;  //10
		x = x-y;  //20
		System.out.println("x="+x+", y="+y);
		//二进制、八进制、十六进制
		//二进制, 数字前加上 0B或0b, jdk1.7+ 才支持
		int b1 = 0B110;  // 1*2^2+1*2^1+0*2^0
		//八进制，数字前加上0
		int b2 = 0110;   // 1*8^2+1*8^1+0*8^0
		//十六进制，数字前加上0X或0x
		int b3 = 0X110;  // 1*16^2+1*16^1+0*16^0
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		//科学记数
		double db1 = 385000;
		double db2 = 3.85E5;
		System.out.println(db1);
		System.out.println(db2);
		
		//数据类型转换
		int it1 = 10;
		long lo1 = it1;
		System.out.println(lo1);
		
		float fl1 = 3.25f;
		int it2 = (int) fl1;
		System.out.println(it2);
		
		System.out.println((int)'a');
		int ia = 'a';
		System.out.println(ia); //97
		System.out.println('a'+1); //98
		System.out.println(""+'a'+1); //a1
		System.out.println('a'+1+""); //98
	}

}













