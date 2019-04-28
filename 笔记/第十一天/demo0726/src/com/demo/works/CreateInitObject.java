package com.demo.works;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 人员类
 * @author Teacher
 * @createTime 2017年7月26日 上午9:52:59
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
	
	@Override
	public String toString() {
		return name+", "+gender+", "+age;
	}
	
}

/**
 * 使用反射机制创建并初始化对象
 * @author Teacher
 * @createTime 2017年7月26日 上午9:18:03
 * @version 1.0.0
 */
public class CreateInitObject {

	/**
	 * 使用反射机制
	 * 使用构造方法创建并初始化对象
	 * @param className
	 * @param types
	 * @param values
	 * @return
	 */
	public static Object getInstanceByConstructor(String className,
			Class[] types, Object[] values) {
		try {
			//加载类，获得类的信息对象
			Class classInfo = Class.forName(className);
			//获得构造器
			Constructor cons = classInfo.getConstructor(types);
			//创建并初始化对象
			return cons.newInstance(values);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 使用反射机制创建对象, 并使用属性初始化对象
	 * @param className
	 * @param keyValues
	 * @return
	 */
	public static Object getInstanceByField(String className,
			Object[][] keyValues) {
		try {
			//加载类，获得类的信息对象
			Class classInfo = Class.forName(className);
			//创建对象
			Object object = classInfo.newInstance();
			//获得属性数组
			Field[] fields = classInfo.getDeclaredFields();
			//循环属性数组，分别给每个属性赋值
			for(Field field: fields) {
				//获得属性名称
				String name = field.getName();
				//定义记录值的变量
				Object value = null;
				//循环查找值
				for(Object[] kv: keyValues) {
					//判断key（第一个元素）是否与属性名相同
					if(name.equals(kv[0])) {
						value = kv[1];
						break;
					}
				}
				//判断是否查找到值
				if(value!=null) {
					//取消访问权限检查
					field.setAccessible(true);
					//给属性设值
					field.set(object, value);
				}
			}
			return object;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 使用反射机制创建对象, 并使用方法初始化对象
	 * @param className
	 * @param keyValues
	 * @return
	 */
	public static Object getInstanceByMethod(String className,
			Object[][] keyValues) {
		try {
			//加载类，获得类信息对象
			Class classInfo = Class.forName(className);
			//创建对象
			Object object = classInfo.newInstance();
			//获得所有属性
			Field[] fields = classInfo.getDeclaredFields();
			//循环属性数组
			for(Field field: fields) {
				//获得属性名
				String name = field.getName();
				//定义记录值的变量
				Object value = null;
				//循环查找值
				for(Object[] kv: keyValues) {
					//判断key（第一个元素）是否与属性名相同
					if(name.equals(kv[0])) {
						value = kv[1];
						break;
					}
				}
				//判断是否查找到值
				if(value!=null) {
					//获得属性的setter方法
					Method method = classInfo.getMethod(
							"set"+name.replaceFirst(name.substring(0, 1),
									name.substring(0, 1).toUpperCase()), 
							field.getType());
					//调用方法，给属性设值
					method.invoke(object, value);
				}
			}
			return object;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		Person p = (Person) getInstanceByConstructor("com.demo.works.Person",
				new Class[]{String.class,String.class,int.class}, 
				new Object[]{"张三","男",21});
		System.out.println(p);
		p = (Person) getInstanceByField("com.demo.works.Person", 
				new Object[][]{{"name","小麦"},{"gender","女"},{"age",22}});
		System.out.println(p);
		p = (Person) getInstanceByMethod("com.demo.works.Person", 
				new Object[][]{{"name","小玲"},{"gender","女"},{"age",22}});
		System.out.println(p);
	}
	

}






