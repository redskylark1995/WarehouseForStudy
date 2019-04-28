package com.demo.works;

/**
 * 服装类
 * @author Teacher
 * @createTime 2017年7月19日 上午9:29:33
 * @version 1.0.0
 */
public class Clothing extends Goods {

	private String size; //型号
	private String color; //颜色
	private double discount; //打折率
	
	public Clothing() {
		
	}
	
	public Clothing(String name, double price, int total,
			String createTime, String size, String color,
			double discount) {
		this.setName(name);
		this.setPrice(price);
		this.setTotal(total);
		this.setCreateTime(createTime);
		this.size = size;
		this.color = color;
		this.discount = discount;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	/**
	 * 输出基本信息
	 */
	@Override
	public void printInfo() {
		System.out.println(getName()+"\t￥"+getPrice()+"\t"+getTotal()+"\t"
	            +getCreateTime()+"\t"+getSize()+"\t"+getColor()+"\t"+getDiscount());
	}
	
	/**
	 * 计算商品的总价值
	 */
	@Override
	public void getSelfTotalAssets() {
		System.out.println("商品\""+getName()+"\"的总价值: "
	         +(getPrice()*getTotal()*getDiscount()));
	}
	
}
