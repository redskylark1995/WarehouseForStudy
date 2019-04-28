package com.demo.test;

/**
 * 使用数组
 * @author Teacher
 * @createTime 2017年7月13日 下午3:00:08
 * @version 1.0.0
 */
public class TestArray {

	public static void main(String[] args) {
		//数组的声明
		int[] itArr;
		String strArr[];
		
		//定义数组，两种方式初始化数组元素
		//静态初始化
		double[] dbArr = {10, 10.53, 52.14, 30.14};
		//获得数组的第一个元素
		System.out.println(dbArr[0]);
		System.out.println(dbArr[3]);
		System.out.println(dbArr[dbArr.length-1]);
		//修改第三个元素
		dbArr[2] = 666666;
		System.out.println(dbArr[2]);
		
		//动态初始化
		int[] intArr = new int[5];
		//循环输出每个元素的值
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i]+"  ");
		}
		System.out.println();
		//设置下标为2的元素，即第三个元素
		intArr[2] = 60;
		//循环输出每个元素的值
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i]+"  ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		
		//练习
		//创建用于存放姓名的长度为5的字符串数组
		String[] nameArr = new String[5];
		//添加姓名
		nameArr[0] = "Jack";
		nameArr[1] = "Rose";
		nameArr[2] = "张三";
		nameArr[3] = "李思";
		nameArr[4] = "王武";
		//输出第四个姓名
		System.out.println("第四个姓名: "+nameArr[3]);
		//输出其他姓名
		System.out.println("其他的姓名: ");
		System.out.print("   ");
		for(int i=0; i<nameArr.length; i++) {
			if(i!=3) {
				System.out.print(nameArr[i]+"  ");
			}
		}
		System.out.println();
		
		System.out.println("--------------------------------------------");
		//将数组中元素反向
		//创建数组
		int[] intArray = {10, 20, 50, 30, 100, 40};
		//循环依次交换数组元素
		for(int i=0; i<intArray.length/2; i++) {
			int temp = intArray[i];
			intArray[i] = intArray[intArray.length-1-i];
			intArray[intArray.length-1-i] = temp;
		}
		//循环输出数组中元素
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+"  ");
		}
		System.out.println();
		
		System.out.println("--------------------------------------------");
		//筛选出数组中元素值最大元素
		int[] intArrs = {60, 78, 55, 43, 80, 21, 96, 15, 18};
		//选择比较法，获得数组中第一个元素
		int maxValue = intArrs[0];
		//循环与数组中元素比较
		for(int i=1; i<intArrs.length; i++) {
			//判断：选择元素的值比数组中小，就交换
			if(maxValue<intArrs[i]) {
				maxValue = intArrs[i];
			}
		}
		System.out.println("数组中值最大的元素: "+maxValue);
	}

}
















