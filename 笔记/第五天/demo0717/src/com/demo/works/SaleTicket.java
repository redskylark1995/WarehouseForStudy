package com.demo.works;

import java.nio.channels.NetworkChannel;

/**
 * 电影片类
 * @author Teacher
 * @createTime 2017年7月17日 上午10:04:16
 * @version 1.0.0
 */
class MovieTicket {
	
	String movieName; //电影名称
	String playTime; //播放时间
	float ticketPrice; //票价
	static int ticketTotal = 120; //票数
	static int maxSeatTotal = 120; //最大座位数
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public void setPlayTime(String playTime) {
		this.playTime = playTime;
	}
	
	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public void setTicketTotal(int ticketTotal) {
		this.ticketTotal = ticketTotal;
		this.maxSeatTotal = ticketTotal;
	}
	
	/**
	 * 售票
	 * @param total
	 */
	public void sale(int total) {
		//判断票数是否足够
		if(ticketTotal<total) {
			System.out.println("余票不足!");
			return; //中断方法的执行，下面的代码不再执行
		}
		for(int i=0; i<total; i++) {
			System.out.println("电影名称: "+movieName);
			System.out.println("票价: "+ticketPrice+"\t\t播放时间: "+playTime);
			System.out.println("座位号: "+(maxSeatTotal-ticketTotal+1));
			//票数减一
			ticketTotal--;
		}
	}
}

/**
 * 客户类
 * @author Teacher
 * @createTime 2017年7月17日 上午10:04:53
 * @version 1.0.0
 */
class Customer {
	
	String name; //姓名
	String telphone; //电话号码
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	
	/**
	 * 买票
	 * @param total
	 */
	public void buy(MovieTicket mt, int total) {
		System.out.println("客户："+name+"["+telphone+"]");
		mt.sale(total);
		System.out.println("------------------------------");
	}
	
}

/**
 * 售票小程序
 * @author Teacher
 * @createTime 2017年7月17日 上午10:02:53
 * @version 1.0.0
 */
public class SaleTicket {

	public static void main(String[] args) {
		//创建电影票对象
		MovieTicket mt = new MovieTicket();
		mt.setMovieName("速度与激情8");
		mt.setPlayTime("13:00");
		mt.setTicketPrice(1);
		//创建客户对象
		Customer cust = new Customer();
		cust.setName("Tom");
		cust.setTelphone("13504687195");
		cust.buy(mt, 2);
		//创建电影票对象
		MovieTicket mt2 = new MovieTicket();
		mt2.setMovieName("速度与激情8");
		mt2.setPlayTime("13:00");
		mt2.setTicketPrice(1);
		Customer cust2 = new Customer();
		cust.setName("Lily");
		cust.setTelphone("5864791");
		cust.buy(mt2, 2);
	}

}















