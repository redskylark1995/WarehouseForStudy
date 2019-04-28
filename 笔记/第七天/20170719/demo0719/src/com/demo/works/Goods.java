package com.demo.works;

/**
 * 商品类
 * 
 * @author Teacher
 * @createTime 2017年7月19日 上午9:21:16
 * @version 1.0.0
 */
public class Goods {

	private String name; // 商品名称
	private double price; // 单价
	private int total; // 总数
	private String createTime; // 生产日期
	private String shelfLife; // 保质期

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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(String shelfLife) {
		this.shelfLife = shelfLife;
	}
	
	/**
	 * 输出基本信息
	 */
	public void printInfo() {
	
	}
	
	/**
	 * 计算商品的总价值
	 */
	public void getSelfTotalAssets() {
		
	}

}
