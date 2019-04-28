package com.demo.works;

/**
 * 已知整型数组{60, 78, 55, 43, 80, 21, 96, 15, 18}，搜索元素值为80的元素，输出元素的下标。
 * @author Teacher
 * @createTime 2017年7月14日 上午9:18:15
 * @version 1.0.0
 */
public class FindElement {

	public static void main(String[] args) {
		int[] intArr = {60, 78, 55, 43, 80, 21, 96, 15, 18};
		//定义查找的变量
		int target = 80;
		//查找元素，依次比较每一个元素，若相对，输出下标
		int i;
		for(i=0; i<intArr.length; i++) {
			if(target==intArr[i]) {
				System.out.println(target+"元素的下标: "+i);
				break;
			}
		}
		//判断是否是未找到元素
		if(i==intArr.length) {
			System.out.println("未查找到元素!");
		}
	}

}
