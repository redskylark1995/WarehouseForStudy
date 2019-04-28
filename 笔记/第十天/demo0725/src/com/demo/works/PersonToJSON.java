package com.demo.works;

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

/**
 * 人员类的对象数组转换成JSON格式的数据
 * @author Teacher
 * @createTime 2017年7月25日 上午9:29:22
 * @version 1.0.0
 */
public class PersonToJSON {
	
	/**
	 * 数组转换成JSON格式
	 * @param personArray
	 * @return
	 */
	public static String parseJSONString(Person[] personArray) {
		//定义字符缓冲数组对象
		StringBuffer sbuff = new StringBuffer("[");
		//循环数组
		for(int i=0; i<personArray.length; i++) {
			//获得当前元素
			Person person = personArray[i];
			//拼接字符串
			sbuff.append("{");
			sbuff.append("name:\"");
			sbuff.append(person.getName());
			sbuff.append("\",");
			sbuff.append("gender:\"");
			sbuff.append(person.getGender());
			sbuff.append("\",");
			sbuff.append("age:");
			sbuff.append(person.getAge());
			sbuff.append("}");
			//判断是否追加“,”
			if(i<personArray.length-1) {
				sbuff.append(",");
			}
		}
		sbuff.append("]");
		return sbuff.toString();
	}

	public static void main(String[] args) {
		Person[] personArray = {
				new Person("Tom", "男", 20),
				new Person("Lily", "女", 20),
				new Person("Jack", "男", 20)
		};
		String json = parseJSONString(personArray);
		System.out.println(json);
	}

}
