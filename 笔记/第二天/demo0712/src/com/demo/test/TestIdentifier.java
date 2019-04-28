package com.demo.test;

/**
 * 测试标识符
 * @author Teacher
 * @createTime 2017年7月12日 上午11:31:47
 * @version 1.0.0
 */
public class TestIdentifier {

	public static void main(String[] args) {
		int it;
		int ab123_ce_$;
		//int 1it; //编译失败       不能与数字开头
		//int class;  //编译失败     不能关键字相同
		//int it; //编译失败    变量名重复
		int It; //区分大小写
		int IT;
		char _c;
		boolean $bl;
		boolean ￥bl;
		//long ?l; //编译失败，只能使用下划线和钱币符号，不能使用其他符号
		float 浮点型; //中文可以作为标识符，一般不使用，中文容易出现乱码问题
	}

}
