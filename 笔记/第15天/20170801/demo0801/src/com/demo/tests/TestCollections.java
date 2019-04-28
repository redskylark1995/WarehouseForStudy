package com.demo.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 使用集合的工具类
 * @author Teacher
 * @createTime 2017年8月1日 下午3:41:05
 * @version 1.0.0
 */
public class TestCollections {

	public static void main(String[] args) {
		//创建集合线性表
		/*List<Integer> list = Collections.emptyList(); //创建的集合是不可改变的
		list.add(100); //不能添加元素*/
		List<Integer> list = new ArrayList<>();
		//添加元素
		Collections.addAll(list, 100,88,20,50,45,30,60,73);
		System.out.println(list);
		//获得最大值与最小值
		System.out.println("最小元素："+Collections.min(list));
		System.out.println("最大元素："+Collections.max(list));
		//排序
		Collections.sort(list);
		System.out.println(list);
		//反向
		Collections.reverse(list);
		System.out.println(list);
	}

}
