package com.demo.works;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 职员类
 * 
 * @author Teacher
 * @createTime 2017年8月2日 上午10:06:08
 * @version 1.0.0
 */
class Employee {

	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "{name:\"" + name + "\",salary:" + salary + "}";
	}

}

/**
 * 自定义比较器
 * @author Teacher
 * @createTime 2017年8月2日 上午10:11:30
 * @version 1.0.0
 */
class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int)(o1.getSalary()-o2.getSalary());
	}
	
}

/**
 * 线性表中职员对象按工资排序
 * 
 * @author Teacher
 * @createTime 2017年8月2日 上午10:05:29
 * @version 1.0.0
 */
public class EmployeeSort {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("张三", 4000));
		list.add(new Employee("李思", 4000));
		list.add(new Employee("王武", 3500));
		list.add(new Employee("赵露", 5000));
		System.out.println(list);
		//排序
		Collections.sort(list, new EmployeeComparator());
		System.out.println(list);
	}

}
