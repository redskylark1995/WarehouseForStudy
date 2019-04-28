package com.demo.works;

import java.util.LinkedHashSet;

/**
 * 人员类
 * 
 * @author Teacher
 * @createTime 2017年7月31日 下午5:04:20
 * @version 1.0.0
 */
class Person {

	private String name;
	private String gender;
	private int age;

	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "{" + name + "," + gender + "," + age + "}";
	}

}

/**
 * 封装人员信息的集合
 * 
 * @author Teacher
 * @createTime 2017年7月31日 下午5:03:23
 * @version 1.0.0
 */
public class PersonCollection {

	public static void main(String[] args) {
		//创建链式散列集
		LinkedHashSet<Person> personSet = new LinkedHashSet<>();
		//泛型在集合中的作用，限定集合中元素的类型，只能是泛型指定的类型或其子类类型
		personSet.add(new Person("张莉","女", 21));
		personSet.add(new Person("张龙","男", 21));
		personSet.add(new Person("张虎","男", 21));
		personSet.add(new Person("张凤","女", 21));
		System.out.println(personSet);
	}

}
