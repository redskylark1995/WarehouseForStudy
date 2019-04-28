package com.demo.test;

class Person {
	
	String number = "0001";
	String name = "张三";
	String gender = "男";
	int age = 20;
	
	/*public Person() {
		
	}*/
	
	public Person(String number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Person(String number, String name, String gender, int age) {
		this(number, name); //访问其他构造方法，必须是第一行代码
		this.gender = gender;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(number+"\t"+name+"\t"+gender+"\t"+age);
	}
}

class Employee extends Person {
	
	private String name = "李思";
	private double salary = 4200;
	
	public Employee() {
		super("0001", "李思");
	}
	
	public Employee(String name, double salary) {
		super("0001", "李思");
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String number, String name, String gender, int age, double salary) {
		super(number, name, gender, age); //访问父类的构造方法，必须是第一行代码
		//this(name, salary);
		this.salary = salary;
	}
	
	@Override
	public void printInfo() {
		System.out.println(number+"\t"+name+"\t"+gender+"\t"+age+"\t"+salary);
	}
	
	public void printVar() {
		System.out.println(number+"\t"+name+"\t"
		         +gender+"\t"+age+"\t"+salary);
		//通过this获得本类的属性值
		System.out.println(this.number+"\t"+this.name+"\t"
		         +this.gender+"\t"+this.age+"\t"+this.salary);
		//通过super获得父类的属性值
		System.out.println(super.number+"\t"+super.name+"\t"
		         +super.gender+"\t"+super.age+"\t");
	}
	
	public void visitMethod() {
		//通过this访问本类的方法
		this.printInfo();
		//通过super访问父类的方法
		super.printInfo();
	}
	
}


/**
 * this关键字的使用
 * @author Teacher
 * @createTime 2017年7月19日 下午2:08:16
 * @version 1.0.0
 */
public class TestThis {

	public static void main(String[] args) {
		Employee emp = new Employee();
		//emp.printVar();
		//emp.visitMethod();
		
		Employee emp2 = new Employee("0002", "王武", "男", 20, 3600);
		emp2.printInfo();
	}

}
