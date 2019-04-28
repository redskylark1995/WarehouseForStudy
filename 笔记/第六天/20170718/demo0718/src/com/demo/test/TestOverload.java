package com.demo.test;

/**
 * 重载
 * @author Teacher
 * @createTime 2017年7月18日 下午2:31:48
 * @version 1.0.0
 */
public class TestOverload {

	public void method() {
		
	}
	
	public int method(int x) {
		return 0;
	}
	
	public void method(float y) {
		
	}
	
	public void method(int x, int y) {
		
	}
	
	//重载方法参数的区分度要足够
	public void method(Object o) {
		System.out.println("-------根父类-------");
	}
	
	public void method(Person p) {
		System.out.println("-------人员类-------");
	}
	
	public void method(Student s) {
		System.out.println("-------学生类-------");
	}
	
	/*public void method(String s) {
		System.out.println("-------字符串类-------");
	}*/
	
	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		Student stu = new Student();
		Person p = stu;
		to.method(stu);
		to.method(p); //判断要访问的方法，根据参数变量的类型来区分。
		to.method(null); //多个方法参数均可赋为null，若参数存在is-a关系，访问的方法是参数为子类的方法。
		                 //若参数不存在或不完全存在is-a关系，错误：编译不通过，不能确定要访问的方法。
	}

}








