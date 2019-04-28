package com.demo.tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 人员类
 * @author Teacher
 * @createTime 2017年8月3日 下午4:03:18
 * @version 1.0.0
 */
class Person implements Serializable {
	
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

/**
 * 对象输入输出流
 * @author Teacher
 * @createTime 2017年8月3日 下午4:01:23
 * @version 1.0.0
 */
public class TestObjectStream {

	public static void main(String[] args) {
		try {
			//创建对象输出流
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("src/com/demo/tests/object.txt"));
			//输出对象到文件中
			oos.writeObject(new Person("张三", 25));
			oos.writeObject(new Person("李思", 24));
			oos.writeObject(null); //相当于设置结束符，指定结束位置
			//关闭流
			oos.close();
			//创建对象输入流
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("src/com/demo/tests/object.txt")); 
			/*//读取对象
			Person p = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			//输出人员信息
			System.out.println(p.getName()+"\t"+p.getAge());*/
			//循环读取对象
			Person p;
			while((p=(Person)ois.readObject())!=null) {
				System.out.println(p.getName()+"\t"+p.getAge());
			}
			//关闭流
			ois.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
