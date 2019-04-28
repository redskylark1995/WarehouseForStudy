package com.demo.test;

/**
 * 使用二维数组
 * @author Teacher
 * @createTime 2017年7月14日 上午11:37:46
 * @version 1.0.0
 */
public class TestTwoArray {

	public static void main(String[] args) {
		//声明二维数组
		int[][] itArray1;
		int itArray2[][];
		int[] itArray3[];
		int []itArray4[];
		//静态初始化
		//int[][] intArr = {};  //定义一个空数组
		int[][] intArr1 = {{10},{20,50,55,15},{46,78}};  //二维数组中的第二维的长度可以不一致
		
		//动态初始化
		int[][] intArr2 = new int[2][3]; //指定第二维的长度
		//添加新元素
		intArr2[0][0] = 10;
		intArr2[1][0] = 25;
		//获得元素
		System.out.println(intArr2[0][0]);
		System.out.println(intArr2[1][0]);
		System.out.println(intArr2[1][2]);
		
		int[][] intArr3 = new int[2][];  //未指定第二维的长度
		//创建第一个“第二维”数组
		intArr3[0] = new int[2];
		//添加新元素
	    intArr3[0][0] = 10;
	    intArr3[0][1] = 15;
	    //获得元素
	    System.out.println(intArr3[0][0]);
	    //输出第二个“第二维”数组
	    System.out.println(intArr3[1]);
	    
	    
	    //创建一个二维数组，添加所有元素，循环输出所有元素。
	    int[][] intArray = new int[3][2];
	    intArray[0][0] = 15;
	    intArray[0][1] = 25;
	    intArray[1][0] = 35;
	    intArray[1][1] = 45;
	    intArray[2][0] = 66;
	    intArray[2][1] = 88;
	    for(int i=0; i<intArray.length; i++) {
	    	for(int j=0; j<intArray[i].length; j++) {
	    		System.out.print(intArray[i][j]);
	    		System.out.print("  ");
	    	}
	    	System.out.println();
	    }
	}

}








