package com.demo.test;

/**
 * 人员类
 * @author Teacher
 * @createTime 2017年7月14日 下午3:02:15
 * @version 1.0.0
 */
class Person {
	
	//定义属性，即成员变量
	//实例变量
	String name;
	String gender = "男";
	int age;
	
	//类变量
	static String country = "中国";
}

/**
 * 实例变量与类变量
 * @author Teacher
 * @createTime 2017年7月14日 下午3:01:28
 * @version 1.0.0
 */
public class TestVariable {

	public static void main(String[] args) {
		//创建两个对象
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.name+"\t"+p1.gender+"\t"+p1.age+"\t"+p1.country);
		System.out.println(p2.name+"\t"+p2.gender+"\t"+p2.age+"\t"+p2.country);
		//修改对象的属性
		p1.name = "张三";
		p1.age = 20;
		System.out.println(p1.name+"\t"+p1.gender+"\t"+p1.age+"\t"+p1.country);
		p2.name = "李丽";
	    p2.gender = "女";
	    p2.age = 22;
	    //p2.country = "英国";
	    Person.country = "英国";
	    System.out.println();
	    System.out.println(p1.name+"\t"+p1.gender+"\t"+p1.age+"\t"+p1.country);
		System.out.println(p2.name+"\t"+p2.gender+"\t"+p2.age+"\t"+p2.country);
	}

}
