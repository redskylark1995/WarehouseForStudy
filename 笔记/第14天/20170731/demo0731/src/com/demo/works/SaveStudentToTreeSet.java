package com.demo.works;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 学生
 * @author Teacher
 * @createTime 2017年7月31日 下午5:18:49
 * @version 1.0.0
 */
/*class Student implements Comparable<Student> {
	
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return "{"+name+","+score+"}";
	}

	*//**
	 * 重写比较方法
	 *//*
	@Override
	public int compareTo(Student o) {
		if(o.score==score) {
			return name.compareTo(o.name);
		}
		return o.score-score;
	}
	
}*/

class Student {
	
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return "{"+name+","+score+"}";
	}

}

/**
 * 自定义比较器
 * @author Teacher
 * @createTime 2017年7月31日 下午5:38:52
 * @version 1.0.0
 */
class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getScore()==o2.getScore()) {
			return o1.getName().compareTo(o2.getName());
		}
		return o2.getScore()-o1.getScore();
	}
	
}

public class SaveStudentToTreeSet {

	public static void main(String[] args) {
		/*//创建树集对象
		TreeSet<Student> set = new TreeSet<>();
		set.add(new Student("张三", 81));
		set.add(new Student("李思", 81));
		set.add(new Student("李思", 82));
		set.add(new Student("李思", 60));
		//输出元素
		System.out.println(set);*/
		//创建树集对象
		TreeSet<Student> set = new TreeSet<>(new StudentComparator());
		set.add(new Student("张三", 81));
		set.add(new Student("李思", 81));
		set.add(new Student("李思", 82));
		set.add(new Student("李思", 60));
		//输出元素
		System.out.println(set);
	}

}







