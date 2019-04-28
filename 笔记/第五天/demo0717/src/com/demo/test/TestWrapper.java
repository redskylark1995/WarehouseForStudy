package com.demo.test;

/**
 * 职员类
 * @author Teacher
 * @createTime 2017年7月17日 下午2:34:05
 * @version 1.0.0
 */
class Employee {
	
	/*String name;
	String gender;
	int age;*/
	
	private String name;
	private String gender;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		if(!"男".equals(gender)&&!"女".equals(gender)) {
			System.err.println("错误: 性别超出取值范围[男|女]!");
			return;
		}
		this.gender = gender;
	}

	public void setAge(int age) {
		if(age<0||age>130) {
			System.err.println("错误: 年龄超出取值范围[0~130]!");
			return;
		}
		this.age = age;
	}

	public void printInfo() {
		System.out.println(name+"\t"+gender+"\t"+age);
	}
}

/**
 * 封装性
 * @author Teacher
 * @createTime 2017年7月17日 下午2:32:14
 * @version 1.0.0
 */
public class TestWrapper {

	public static void main(String[] args) {
		Employee emp = new Employee();
		/*emp.name = "张龙";
		emp.gender = "非人类";
		emp.age = 2100;*/
		emp.setName("张龙");
		emp.setGender("男");
		emp.setAge(22);
		emp.printInfo();
	}

}
