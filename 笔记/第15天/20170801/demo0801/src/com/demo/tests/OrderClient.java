package com.demo.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 使用集合封装订单数据
 * @author Teacher
 * @createTime 2017年8月1日 下午5:01:21
 * @version 1.0.0
 */
public class OrderClient {

	public static void main(String[] args) {
		//创建订单图集合
		Map<String, Object> order = new HashMap<>();
		//封装订单数据
		order.put("orderNumber", "2017080100021");
		order.put("shopName", "重庆大百货");
		order.put("shopTelphone", "023-52894126");
		Map<String, Object> customer = new HashMap<>();
		customer.put("name", "张丽");
		customer.put("telphone", "13652451678");
		customer.put("address", "重庆西永微电园");
		order.put("customer", customer);
		List<Map<String, Object>> goodsList = new ArrayList<>();
		Map<String, Object> goods = new HashMap<>();
		goods.put("name", "金U盘");
		goods.put("price", 60);
		goods.put("total", 1);
		goodsList.add(goods);
		goods = new HashMap<>();
		goods.put("name", "鼠标");
		goods.put("price", 50);
		goods.put("total", 1);
		goodsList.add(goods);
		goods = new HashMap<>();
		goods.put("name", "键盘");
		goods.put("price", 70);
		goods.put("total", 1);
		goodsList.add(goods);
		order.put("goodsList", goodsList);
		
		System.out.println("订单号:"+order.get("orderNumber"));
		System.out.println("商店:"+order.get("shopName")+"\t\t\t电话:"+order.get("shopTelphone"));
		System.out.println("客户信息:");
		Map<String, Object> cust = (Map<String, Object>)order.get("customer");
		System.out.println("        姓名:"+cust.get("name")+"\t\t\t联系电话:"+cust.get("telphone"));
		System.out.println("        地址:"+cust.get("address"));
		System.out.println("商品列表:");
		System.out.println("        商品名称\t\t单价\t\t数量");
		List<Map<String, Object>> list = (List<Map<String, Object>>)order.get("goodsList");
		for(Map<String, Object> g: list) {
			System.out.println("        "+g.get("name")+"\t\t\t"+g.get("price")+"\t\t"+g.get("total"));
		}
	}

}










