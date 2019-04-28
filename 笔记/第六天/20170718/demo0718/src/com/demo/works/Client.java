package com.demo.works;

/**
 * 使用者程序
 * @author Teacher
 * @createTime 2017年7月18日 上午9:42:19
 * @version 1.0.0
 */
public class Client {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("张三");
		emp.setGender("男");
		emp.setBirthday("1995-05-05");
		emp.setWorkInTime("2017-02-03");
		emp.setBasicSalary(3000);
		emp.setPerforSalary(2000);
		emp.printBasicInfo();
		emp.printSalaryInfo();
		
		emp = new Employee("李思", "女", "1995-08-16", "2017-03-12", 3000, 1800);
		emp.printBasicInfo();
		emp.printSalaryInfo();
		
		Manager manager = new Manager("王武", "男", "1994-07-21", "2016-09-06", 5000, 3000);
		manager.printBasicInfo();
		
		//设置职员的绩效工资
		manager.setEmployeePerfor(emp, 1000);
		//再输出资源的基本信息
		emp.printBasicInfo();
		emp.printSalaryInfo();
	}

}
