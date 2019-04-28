package com.demo.tests;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 使用Set规则集
 * @author Teacher
 * @createTime 2017年7月28日 下午4:50:19
 * @version 1.0.0
 */
public class TestSet {
	
	/**
	 * 循环输出集合中的元素
	 * @param set
	 */
	public static void printElement(Set set) {
		/*//获得集合的迭代器, 作用：遍历集合中的元素
		Iterator<Object> it = set.iterator();
		//遍历元素，输出元素的值
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.print("\t");
		}
		System.out.println();*/
		//使用for each循环遍历集合
		for(Object o: set) {
			System.out.print(o);
			System.out.print("\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//散列集，元素的存储无序
		HashSet<Object> set = new HashSet();
		set.add(100);
		set.add(50);
		set.add(30);
		set.add("Hello!");
		set.add('c');
		set.add(50);
		System.out.println(set);
		//遍历集合中的元素
		printElement(set);
		printElement(set);
		printElement(set);
		System.out.println("集合中元素的个数: "+set.size());
		
		System.out.println("-------------------------------");
		//链式散列集
		LinkedHashSet<Object> lset = new LinkedHashSet<>();
		lset.add(100);
		lset.add(50);
		lset.add(30);
		lset.add("Hello!");
		lset.add('c');
		lset.add(50);
		System.out.println(lset);
		printElement(lset);
		printElement(lset);
		printElement(lset);
		
		System.out.println("-------------------------------");
		//树形集
		TreeSet<Object> tset = new TreeSet();
		tset.add(100);
		tset.add(50);
		tset.add(30);
		tset.add(10);
		tset.add(5);
		tset.add(50);
		System.out.println(tset);
		printElement(tset);
		printElement(tset);
		printElement(tset);
	}

}

















