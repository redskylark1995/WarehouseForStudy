package com.demo.tests;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 人员类
 * @author Teacher
 * @createTime 2017年7月25日 上午11:54:29
 * @version 1.0.0
 */
class Person {
	
	private String name;
	private String gender;
	private int age;
	
	public Person() {
		
	}
	
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
	
}

class Student {
	
}

class Employee {
	
}

/**
 * 使用Class类
 * @author Teacher
 * @createTime 2017年7月25日 上午11:55:57
 * @version 1.0.0
 */
public class TestClass {
	
	public static Object getInstance(String className) {
		try {
			return Class.forName(className).newInstance(); //运行时，才确定要创建对象的类型； 动态的
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Object getInstance_2(String className) {
		try {
			if("Person".equals(className)) {
			    return Person.class.newInstance(); //编译时，确定要创建对象的类型； 固定的
			} else if("Student".equals(className)) {
			    return Student.class.newInstance();
			} else if("Employee".equals(className)) {
			    return Employee.class.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void method(int i) {
		System.out.println("基本数据类型!");
	}
	
	public static void method(Integer i) {
		System.out.println("封装类型!");
	}

	public static void main(String[] args) throws Exception {
		/*//创建对象
		Person p = new Person("张伟", "男", 25);
		//获得类信息对象
		System.out.println(p.getClass()+"  "+p.getClass().hashCode());
		p = new Person("李思", "男", 25);
		System.out.println(p.getClass()+"  "+p.getClass().hashCode()); //获得的是用一个类信息对象
		
		//加载类
		Class classInfo = Class.forName("com.demo.tests.Person");
		System.out.println(classInfo+"  "+classInfo.hashCode());
		//创建对象
		Person p2 = (Person) classInfo.newInstance();
		System.out.println(p2);
		
		System.out.println(Person.class);
		System.out.println(Person.class.newInstance());*/
		
		//加载类
		//Class classInfo = Person.class;
		Class classInfo = Class.forName("com.demo.tests.Person");
		/*//获得构造器
		System.out.println("构造方法:");
		Constructor<Person>[] cons = classInfo.getConstructors();
		for(int i=0; i<cons.length; i++) {
			System.out.println(cons[i]);
		}
		//获得属性, 属性均是私有的，所以使用getDeclaredFields()方法
		System.out.println("属性:");
		Field[] fields = classInfo.getDeclaredFields();
		for(Field field: fields) {
			System.out.println(field);
		}
		//获得方法
		System.out.println("方法:");
		Method[] methods = classInfo.getMethods();
		for(Method method: methods) {
			System.out.println(method);
		}*/
		
		/*method(100);
		int i = 10;
		method(i);
		Integer it = 10;
		method(it);
		method(null);*/
		
		//使用构造器初始化对象
		/*Constructor<Object> cons = classInfo.getConstructor(
				String.class, String.class, int.class);
		Object object = cons.newInstance("赵零", "男", 20);*/
		/*Constructor<Person> cons = classInfo.getConstructor(
				String.class, String.class, int.class);
		Person person = cons.newInstance("赵零", "男", 20);
		System.out.println(person.getName()+"\t"+person.getGender()+"\t"+person.getAge());*/
		
		//使用属性初始化对象
		/*//创建对象
		Object object = classInfo.newInstance();
		//获得所有属性
		Field[] fields = classInfo.getDeclaredFields();
		//定义值得数组
		Object[][] values = {{"name","张伟"}, {"gender","男"},{"age",21}};
		//循环给属性设置
		for(Field field: fields) {
			//获得属性名
			String name = field.getName();
			//循环到二维数组中查询值
			Object value = null;
			for(int i=0; i<values.length; i++) {
				if(name.equals(values[i][0])) {
					value = values[i][1];
					break;
				}
			}
			//判断是否查找到值，未找到，结束本次循环，即不赋值
			if(value==null) {
				continue;
			}
			//取消 Java 语言访问检查，即可访问
			field.setAccessible(true);
			//设置属性的值
			field.set(object, value);
		}
		Person person = (Person) object;
		System.out.println(person.getName()+"\t"+person.getGender()+"\t"+person.getAge());*/
		//使用方法初始化对象
		//创建对象
		Object object = classInfo.newInstance();
		//获得所有属性
		Field[] fields = classInfo.getDeclaredFields();
		//定义值得数组
		Object[][] values = {{"name","张莉莉"}, {"gender","女"},{"age",21}};
		//循环给属性设置
		for(Field field: fields) {
			//获得属性名
			String name = field.getName();
			//循环到二维数组中查询值
			Object value = null;
			for(int i=0; i<values.length; i++) {
				if(name.equals(values[i][0])) {
					value = values[i][1];
					break;
				}
			}
			//判断是否查找到值，未找到，结束本次循环，即不赋值
			if(value==null) {
				continue;
			}
			//获得属性对应的set方法
			Method method = classInfo.getMethod("set"
			    +name.replaceFirst(name.substring(0, 1),
			    		name.substring(0, 1).toUpperCase()), field.getType());
			//通过方法给属性设值
			method.invoke(object, value);
		}
		Person person = (Person) object;
		System.out.println(person.getName()+"\t"+person.getGender()+"\t"+person.getAge());
	}

}
















