package com.demo.test;

/**
 * 测试位运算符
 * @author Teacher
 * @createTime 2017年7月13日 上午11:09:10
 * @version 1.0.0
 */
public class TestBitOperator {

	public static void main(String[] args) {
		//常量之间可以进行位运算
		System.out.println(~1);
        byte x = 3; //00000011
        byte y = 5; //00000101
        //按位取反
        System.out.println(~x); //11111100     10000011 + 1   10000100   -4
        //按位与
        System.out.println(x&y); //00000001    1
        //按位或
        System.out.println(x|y); //00000111    7
        //按位异或
        System.out.println(x^y); //00000110    6
        
        //移位运算, 在计算机中运算效率最高
        byte z = 2; //00000010
        //左移位
        System.out.println(z<<2);  //00001000
        z = 8;
        //带符号右移位
        System.out.println(z>>3);
        //无符号右移位
        System.out.println(z>>>3);
        
        z = -8;
        //带符号右移位, 符号位（最高位）不移动
        System.out.println(z>>3);
        //无符号右移位, 符号位（最高位）移动
        System.out.println(z>>>3);
	}

}
