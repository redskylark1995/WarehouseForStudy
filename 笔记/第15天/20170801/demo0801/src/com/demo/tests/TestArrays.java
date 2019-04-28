package com.demo.tests;

import java.util.Arrays;
import java.util.List;

/**
 * 使用数组工具类Arrays
 * @author Teacher
 * @createTime 2017年8月1日 下午3:22:22
 * @version 1.0.0
 */
public class TestArrays {

	public static void main(String[] args) {
		//创建集合List
		List<Integer> list = Arrays.asList(10, 20, 50, 60, 70);
		System.out.println(list);
		//二分查找法
		int[] arr = {10, 20, 50, 60, 70};
		System.out.println("查找元素\"5\"的下标: "+Arrays.binarySearch(arr, 5));
		System.out.println("查找元素\"50\"的下标: "+Arrays.binarySearch(arr, 50));
		//比较俩个数组是否相等
		int[] arr1 = {10, 20, 50, 60, 80};
		System.out.println(Arrays.equals(arr, arr1));
		//排序
		int[] arr2 = {50, 35, 60, 25, 13, 80};
		Arrays.sort(arr2);
		for(int e: arr2) {
			System.out.print(e+", ");
		}
		System.out.println();
		//转换成字符串
		System.out.println(Arrays.toString(arr2));
	}

}
