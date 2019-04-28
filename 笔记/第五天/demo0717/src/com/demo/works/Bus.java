package com.demo.works;

/**
 * 公交车类
 * @author Teacher
 * @createTime 2017年7月17日 上午9:37:45
 * @version 1.0.0
 */
public class Bus {
	
	String number; //车牌号
	String shifts; //班次
	float ticketPrice; //票价
	int maxCount; //最大乘客数量
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setShifts(String shifts) {
		this.shifts = shifts;
	}
	
	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	
	/**
	 * 获得公交车的基本信息
	 * @return
	 */
	public String getMessage() {
		return shifts+"\t"+number+"\t￥"+ticketPrice+"\t"+maxCount;
	}
	
	/**
	 * 计算一次出车的最大毛利润
	 * @return
	 */
	public float getOneMaxProfit() {
		return ticketPrice*maxCount;
	}
	
	/**
	 * 计算一天的最大毛利润
	 * 1小时1班
	 * @param start 开班时间
	 * @param end 收班时间
	 * @return
	 */
	public float getMaxProfitInDay(int start, int end) {
		return ticketPrice*maxCount*(end-start+1);
	}

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.setNumber("渝ACB12");
		bus.setShifts("256");
		bus.setTicketPrice(3);
		bus.setMaxCount(60);
		System.out.println(bus.getMessage());
		System.out.println("一次出车的最大盈利："+bus.getOneMaxProfit());
		System.out.println("一天的最大盈利："+bus.getMaxProfitInDay(8, 20));
	}

}
