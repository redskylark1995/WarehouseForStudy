package com.demo.works;

/**
 * 人员类
 * @author Teacher
 * @createTime 2017年7月24日 上午10:30:26
 * @version 1.0.0
 */
class Person {
	
	private String number;
	private String name;
	private String gender;
	private String birthday;
	
	public Person() {
		
	}
	
	public Person(String number, String name, 
			String gender, String birthday) {
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
}

/**
 * 解析字符串，并封装成一个对象
 * @author Teacher
 * @createTime 2017年7月24日 上午10:29:01
 * @version 1.0.0
 */
public class StringSplitTOPerson {
	
	public Person splitString(String data) {
		String[] dataArr = data.split("&");
		Person p = new Person(
				dataArr[0].split("=")[1],
				dataArr[1].split("=")[1],
				dataArr[2].split("=")[1],
				dataArr[3].split("=")[1]);
		return p;
	}

	public static void main(String[] args) {
		StringSplitTOPerson sstp = new StringSplitTOPerson();
		Person p = sstp.splitString(
				"number=01201&name=Tom&gender=男&birthday=1997-07-21");
		System.out.println(p.getNumber()+"\t"+p.getName()+"\t"
				+p.getGender()+"\t"+p.getBirthday());
	}

}
