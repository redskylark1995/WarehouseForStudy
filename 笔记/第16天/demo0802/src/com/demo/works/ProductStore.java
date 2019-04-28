package com.demo.works;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 使用集合封装商品数据
 * @author Teacher
 * @createTime 2017年8月2日 上午9:35:57
 * @version 1.0.0
 */
public class ProductStore {

	public static void main(String[] args) {
		//创建按类型封装产品数据的图集合
		Map<String, List> productMap = new HashMap<>();
		//创建食物类的线性表集合
		List<Map<String, Object>> foodList = new ArrayList<>();
		//创建产品的图集合
		Map<String, Object> food = new HashMap<>();
		//封装产品数据
		food.put("name", "酱肉包");
		food.put("price", 1);
		food.put("total", 100);
		//添加食物集合中
		foodList.add(food);
		food = new HashMap<>();
		food.put("name", "豆浆");
		food.put("price", 2);
		food.put("total", 50);
		foodList.add(food);
		//添加到产品图集合中
		productMap.put("食物", foodList);
		//创建书籍类的线性表集合
		List<Map<String, Object>> bookList = new ArrayList<>();
		//创建书籍产品的图集合
		Map<String, Object> book = new HashMap<>();
		//封装书籍产品的数据
		book.put("name", "Java核心技术");
		book.put("price", 50);
		book.put("total", 200);
		//添加书籍集合中
		bookList.add(book);
		//添加到产品图集合中
		productMap.put("书籍", bookList);
		
		//遍历集合中产品数据
		for(String type: productMap.keySet()) {
			System.out.println(type+":");
			List<Map<String, Object>> list = productMap.get(type);
			for(Map<String, Object> product: list) {
				System.out.print("\t");
				System.out.print(product.get("name")+"\t\t");
				System.out.print(product.get("price")+"\t\t");
				System.out.print(product.get("total")+"\t\t");
				System.out.println();
			}
		}
	}

}








