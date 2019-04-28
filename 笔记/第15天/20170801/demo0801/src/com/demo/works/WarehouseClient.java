package com.demo.works;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品类
 * @author Teacher
 * @createTime 2017年8月1日 上午9:25:54
 * @version 1.0.0
 */
class Goods {
	
	private String number;
	private String name;
	private double price;
	private int total;
	
	public Goods() {
		
	}
	
	public Goods(String number, String name,
			double price, int total) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.total = total;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}

/**
 * 仓库类
 * @author Teacher
 * @createTime 2017年8月1日 上午9:23:06
 * @version 1.0.0
 */
class Warehouse {
	
	private static List<Goods> goodsList = new ArrayList<>(); 
	
	/**
	 * 输出商品的基本信息
	 */
	public void printInfo() {
		System.out.println("商品编号\t商品名称\t单价\t数量");
		for(Goods goods: goodsList) {
			System.out.println(goods.getNumber()+"\t"+goods.getName()+"\t"
		                 +goods.getPrice()+"\t"+goods.getTotal());
		}
		System.out.println("----------------------------------------------");
	}
	
	/**
	 * 入库
	 * @param goods
	 */
	public void inWarehouse(Goods goods) {
		//判断仓库中是否已存在该类商品
		Goods existGoods = null;
		for(Goods temp: goodsList) {
			if(temp.getNumber().equals(goods.getNumber())) {
				existGoods = temp;
				break;
			}
		}
		if(existGoods!=null) { //已存在
			existGoods.setTotal(existGoods.getTotal()+goods.getTotal());
		} else { //不存在
			//判断编号是否为空
			if(goods.getNumber()==null) {
				throw new RuntimeException("商品编号不能为空!");
			}
			//System.out.println("++++++++++");
			goodsList.add(goods);
		}
	}
	
	/**
	 * 出库
	 * @param number
	 * @param total
	 */
	public void outWarehouse(String number, int total) {
		//查找商品
		Goods goods = null;
		for(Goods temp: goodsList) {
			if(temp.getNumber().equals(number)) {
				goods = temp;
				break;
			}
		}
		//判断是否查找到商品 
		if(goods==null) {
			System.out.println("未查找到商品!");
			return;
		}
		//判断数量是否足够
		if(goods.getTotal()<total) {
			System.out.println("商品库存不足!");
			return;
		}
		//出库，减去出库的数量
		goods.setTotal(goods.getTotal()-total);
	}
}

/**
 * 使用仓库，进销存
 * @author Teacher
 * @createTime 2017年8月1日 上午9:21:59
 * @version 1.0.0
 */
public class WarehouseClient {

	public static void main(String[] args) {
		Warehouse wh = new Warehouse();
		//添加商品
		wh.inWarehouse(new Goods("00001","辣条",2,1000));
		wh.inWarehouse(new Goods("00002","联想笔记本",4500,100));
		//输出商品信息
		wh.printInfo();
		//添加已存在的商品
		wh.inWarehouse(new Goods("00001","泡椒凤爪",3,1000));
		//输出商品
		wh.printInfo();
		//商品出库
		wh.outWarehouse("00001", 500);
		wh.outWarehouse("00002", 2);
		//输出商品信息
		wh.printInfo();
		
		//wh.inWarehouse(new Goods(null,"泡椒凤爪",3,1000));
		/*wh.outWarehouse("00003", 10);
		wh.printInfo();*/
		wh.outWarehouse("00002", 100);
		wh.printInfo();
	}

}
