package com.demo.works;

/**
 * 设备类
 * @author Teacher
 * @createTime 2017年7月19日 上午9:42:32
 * @version 1.0.0
 */
public class Equipment {

	private String model; //型号
	private double price; //单价
	private String basicMessage; //基本形象
	
	public Equipment() {
		
	}
	
	public Equipment(String model, String basicMessage, double price) {
		this.model = model;
		this.basicMessage = basicMessage;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBasicMessage() {
		return basicMessage;
	}

	public void setBasicMessage(String basicMessage) {
		this.basicMessage = basicMessage;
	}
	
	public void printInfo() {
		System.out.println(model+"\t"+price+"\t"+basicMessage);
	}
	
}
