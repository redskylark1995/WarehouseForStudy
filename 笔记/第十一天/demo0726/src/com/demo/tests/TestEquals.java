package com.demo.tests;

class Student {
	
}

/*class Employee{ //两个引用类型变量，使用==进行比较，必须是类型相同、存在is-a关系。
	
}*/

class Employee extends Student {
	
}

class Goods {
	
}

public class TestEquals {

	public static void main(String[] args) {
		//引用类型可以使用==与equals比较，均是按引用（对象地址）比较
        //==只能比较同类型或存在is-a关系的两个的引用类型
		//equals任意引用类型均可比较，equals是一个方法，通过对象来调用，所以“.”前面必须一个非空的引用类型变量或常量值。
		 //比如：String name = "Tom"; "Tom".equals(name);   不用name.equals("Tom")这种方式, 若name值为null，就会抛出异常
		Student stu = null;
		Employee emp = null;
		Goods goods = null;
		System.out.println(stu==emp);
		//System.out.println(stu.equals(goods)); //空指针异常：NullPointerException
		System.out.println("----------------------");
		stu = new Student();
		emp = new Employee();
		System.out.println(stu==emp); //按引用（对象的地址）进行比较
		System.out.println(stu.equals(emp)); //按引用（对象的地址）进行比较
		System.out.println(stu.equals(goods));
		goods = new Goods();
		System.out.println(stu.equals(goods)); 
		
		System.out.println("-----------------------");
		//比较字符串
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str1==str2); //true
		System.out.println(str1.equals(str2)); //true
		System.out.println(str2==str3); //false
		System.out.println(str2.equals(str3)); //true
		System.out.println(str3==str4); //false
		System.out.println(str3.equals(str4)); //true
	}

}
