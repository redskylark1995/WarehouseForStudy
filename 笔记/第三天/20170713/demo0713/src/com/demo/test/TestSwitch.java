package com.demo.test;

/**
 * 分支语句
 * switch
 * @author Teacher
 * @createTime 2017年7月13日 上午11:43:59
 * @version 1.0.0
 */
public class TestSwitch {

	public static void main(String[] args) {
		int score = 110;
		switch(score/10) {
		default:
			System.out.println("不及格!");
			break;
		case 10:
		case 9:
			System.out.println("优秀!");
			break;
		case 8:
			System.out.println("良好!");
			break;
		case 7:
		case 6:
			System.out.println("及格!");
			break;
		/*default:
			System.out.println("不及格!");*/
		}
		System.out.println("程序执行完毕!");
	}

}
