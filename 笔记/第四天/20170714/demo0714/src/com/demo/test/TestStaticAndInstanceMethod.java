package com.demo.test;

/**
 * 员工类
 * @author Teacher
 * @createTime 2017年7月14日 下午4:43:13
 * @version 1.0.0
 */
class Employee {
	
	String name;
	static String company;
	
	public void setName(String name) {
		this.name = name;
	}
	
	/*public static void setCompany(String company) {
		Employee.company = company;  //类方法中不能使用this关键字
	}*/
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public static String getMessage(Employee emp) { //不能直接访问实例成员，只能通过“对象.***”的形式访问
		//Employee emp = new Employee();
		return emp.name+", "+company;
	}
	
}

/**
 * 静态方法与实例方法
 * @author Teacher
 * @createTime 2017年7月14日 下午4:41:54
 * @version 1.0.0
 */
public class TestStaticAndInstanceMethod {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("力帆");
		emp.setCompany("中软国际");
		//String message = emp.getMessage(emp); //合法
		String message = Employee.getMessage(emp);
		System.out.println("员工信息: "+message);
	}
	
}







