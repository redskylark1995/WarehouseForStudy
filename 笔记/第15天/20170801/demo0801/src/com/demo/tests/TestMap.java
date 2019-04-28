package com.demo.tests;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * 使用Map图集合
 * @author Teacher
 * @createTime 2017年8月1日 上午11:10:31
 * @version 1.0.0
 */
public class TestMap {

	public static void main(String[] args) {
		//创建散列图对象
		HashMap<String,Object> map = new HashMap<>();
		//添加元素
		map.put("name", "联想笔记本");
		map.put("price", 4500);
		map.put("total", 20);
		/*//获得元素
		//根据元素的键获得元素的值
		System.out.println(map.get("name"));
		System.out.println(map.get("price"));
		System.out.println(map.get("total"));
		//添加一个key已存在的元素
		map.put("price", 5000); //替换元素的值
		System.out.println(map.get("price"));
		//获得元素个数，图的长度
		System.out.println("元素的个数："+map.size());
		//输出图中的元素
		System.out.println(map);
	    System.out.println("----------------------------------------");
		
		//遍历图
		//遍历Key
		Set<String> keySet = map.keySet();
		for(String key: keySet) {
			System.out.println(key);
		}
		System.out.println();
		//遍历value
		Collection<Object> values = map.values();
		for(Object value: values) {
			System.out.println(value);
		}
		System.out.println();*/
		//遍历键值对
		Set<Entry<String, Object>> entrySet = map.entrySet();
		for(Entry<String, Object> entry: entrySet) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		System.out.println("----------------------------------------");
		
		//链式散列图
		//元素有序，排序模式：插入顺序（默认的，false）、访问顺序（true，按最后一次访问的先后进行排序，）
		LinkedHashMap<String, Object> lmap = new LinkedHashMap<>(16, 0.75f, true);
		lmap.put("name", "联想笔记本");
		lmap.put("price", 4500);
		lmap.put("total", 20);
		System.out.println("单价："+lmap.get("price"));
		System.out.println("名称："+lmap.get("name"));
		Set<Entry<String, Object>> lentrySet = lmap.entrySet();
		for(Entry<String, Object> entry: lentrySet) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		System.out.println("----------------------------------------");
		
		//树集
		TreeMap<String, Object> tmap = new TreeMap<>();
		tmap.put("name", "联想笔记本");
		tmap.put("price", 4500);
		tmap.put("total", 20);
		Set<Entry<String, Object>> tentrySet = tmap.entrySet();
		for(Entry<String, Object> entry: tentrySet) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}

}























