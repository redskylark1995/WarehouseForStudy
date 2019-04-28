package com.demo.works;

/**
 * 计算机类
 * @author Teacher
 * @createTime 2017年7月19日 上午9:48:52
 * @version 1.0.0
 */
public class Computer extends Goods {
	
	private String model; //型号
	private Equipment hardDisk; //硬盘
	private Equipment memory; //内存
	private Equipment cpu; //中央处理器
	private Equipment videoCard; //显卡
	
	public Computer() {
		
	}
	
	public Computer(String name, int total,
			String createTime, String shelfLife, String model,
			Equipment hardDisk, Equipment memory, Equipment cpu,
			Equipment videoCard) {
		this.setName(name);
		this.setTotal(total);
		this.setCreateTime(createTime);
		this.setShelfLife(shelfLife);
		this.model = model;
		this.hardDisk = hardDisk;
		this.memory = memory;
		this.cpu = cpu;
		this.videoCard = videoCard;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Equipment getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(Equipment hardDisk) {
		this.hardDisk = hardDisk;
	}

	public Equipment getMemory() {
		return memory;
	}

	public void setMemory(Equipment memory) {
		this.memory = memory;
	}

	public Equipment getCpu() {
		return cpu;
	}

	public void setCpu(Equipment cpu) {
		this.cpu = cpu;
	}

	public Equipment getVideoCard() {
		return videoCard;
	}

	public void setVideoCard(Equipment videoCard) {
		this.videoCard = videoCard;
	}
	
	/**
	 * 输出基本信息
	 */
	public void printInfo() {
		System.out.println(getName()+"\t"+getTotal()+"\t"+getCreateTime()+"\t"
	            +getShelfLife()+"\t"+getModel());
		System.out.println("设备基本信息: ");
		hardDisk.printInfo();
		memory.printInfo();
		cpu.printInfo();
		videoCard.printInfo();
		//计算计算机的单价
		double price = hardDisk.getPrice()+memory.getPrice()
			  +cpu.getPrice()+videoCard.getPrice();
		System.out.println("单价："+price);
	}
	
	/**
	 * 计算商品的总价值
	 */
	public void getSelfTotalAssets() {
		//计算计算机的单价
		double price = hardDisk.getPrice()+memory.getPrice()
		      +cpu.getPrice()+videoCard.getPrice();
		//计算总价值
		double totalPrice = price*getTotal();
		System.out.println("商品\""+getName()+" "+getModel()+"\"的总价值: "+totalPrice);
	}
}
















