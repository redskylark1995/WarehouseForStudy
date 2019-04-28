package com.demo.works;

/**
 * 已知整型数组{60, 78, 55, 43, 80, 21, 96, 15, 18}，对数组中元素进行升序排序。
 * @author Teacher
 * @createTime 2017年7月14日 上午9:47:54
 * @version 1.0.0
 */
public class ArraySort {

	public static void main(String[] args) {
		//定义整型数组
        int[] intArr = {60, 78, 55, 43, 80, 21, 96, 15, 18};
        //冒泡排序
        /*for(int i=0; i<intArr.length-1; i++) { //外循环控制比较的次数
        	for(int j=0; j<intArr.length-1-i; j++) { //内循环依次比较元素
        		//当前元素与下一个元素进行比较，若>下一个元素，交换元素
        		if(intArr[j]>intArr[j+1]) {
        			int temp = intArr[j];
        			intArr[j] = intArr[j+1];
        			intArr[j+1] = temp;
        		}
        	}
        }*/
        
        //选择排序
        /*//定义记录最小元素下标的变量
        int minIndex;
        //循环，对数组中元素进行排序
        for(int i=0; i<intArr.length-1; i++) {
        	minIndex = i;
        	//依次比较后面的元素（包括当前的），选出最小的，并记录它的下标
        	for(int j=i+1; j<intArr.length; j++) {
        		if(intArr[minIndex]>intArr[j]) {
        			minIndex = j;
        		}
        	}
        	//选出最小元素与当前元素进行交换
        	int temp = intArr[i];
        	intArr[i] = intArr[minIndex];
        	intArr[minIndex] = temp;
        }*/
        
        //插入排序
        //定义记录最小元素值得变量
        int minValue;
        //定义记录开始后移元素的下标
        int startIndex;
        //循环，对数组元素进行排序
        for(int i=0; i<intArr.length-1; i++) {
        	minValue = intArr[i];
        	startIndex = -1;
        	//从当前元素开始，依次与后面元素进行比较，选出最小的
        	for(int j=i+1; j<intArr.length; j++) {
        		if(minValue>intArr[j]) {
        			minValue = intArr[j];
        			startIndex = j-1;
        		}
        	}
        	//判断是否插入元素
        	if(startIndex!=-1) {
        		//后移元素
        		for(int j=startIndex; j>=i; j--) {
        			intArr[j+1] = intArr[j];
        		}
        		//记录最小值，插入当前位置
        		intArr[i] = minValue;
        	}
        	/* //循环输出数组中元素
            for(int j=0; j<intArr.length; j++) {
            	System.out.print(intArr[j]+"  ");
            }
            System.out.println();*/
        }
        
        //循环输出数组中元素
        for(int i=0; i<intArr.length; i++) {
        	System.out.print(intArr[i]+"  ");
        }
        System.out.println();
	}

}
