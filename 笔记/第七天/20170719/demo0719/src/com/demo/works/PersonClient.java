package com.demo.works;

/**
 * 人员类的使用者程序
 * @author Teacher
 * @createTime 2017年7月19日 上午11:05:28
 * @version 1.0.0
 */
public class PersonClient {
	
	/**
	 * 访问人员类型的对象
	 * 区分不同子类
	 * @param p
	 */
	public void visit(Person p) {
		if(p instanceof Student) { //学生类的实例
			Student stu = (Student) p;
			System.out.println(stu.getName()+"的成绩: "+stu.getTotalScore());
		} else if(p instanceof Employee) { //职员类的实例
			Employee emp = (Employee) p;
			System.out.println(emp.getName()+"的本月工资: "+emp.getCurrentSalary()
			       +", 年度工资: "+emp.getYearSalary());
		}
	}

	public static void main(String[] args) {
		PersonClient pc = new PersonClient();
		//创建学生对象
		Student stu = new Student(
				"张三", "男", "1997-02-18", "重庆大学", 80, 80, 60);
		pc.visit(stu);
		
		//创建职员对象
		Employee emp = new Employee(
				"李思思", "女", "1997-05-16", "2017-02-18", 3000, 1700);
		pc.visit(emp);
	}

}
