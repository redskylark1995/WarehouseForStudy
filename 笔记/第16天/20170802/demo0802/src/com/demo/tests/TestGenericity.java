package com.demo.tests;

import java.util.Arrays;

/**
 * 自定义数组线性表
 * @author Teacher
 * @createTime 2017年8月2日 上午11:16:49
 * @version 1.0.0
 */
/*class MyArrayList<T, E extends Exception> { //泛型参数"T", 满足标识符命名规划即可
	
	//声明泛型变量
	private T var;
	
	//泛型方法与异常
	public T method() throws E {
		//泛型局部变量
		T var = null;
		return var;
	}
	
	//泛型参数
	public void method(T var) {
		
	}
	
}*/

class MyArrayList<E> {
	
	private int size;
	private Object[] data = new Object[10];
	
	/**
	 * 添加元素
	 * @param e
	 */
	public void add(E e) {
		if(size>data.length-1) {
			data = Arrays.copyOf(data, data.length*2);
		}
		data[size] = e;
		size++;
	}
	
	public E get(int index) {
		return (E) data[index];
	}
	
	public int size() {
		return size;
	}
	
}

/**
 * 使用泛型，定义类成员的类型
 * @author Teacher
 * @createTime 2017年8月2日 上午11:15:23
 * @version 1.0.0
 */
public class TestGenericity {

	public static void main(String[] args) {
		//MyArrayList<Integer, Exception> list;
		MyArrayList<Integer> list = new MyArrayList<>();
		list.add(100);
		list.add(50);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		MyArrayList<String> list2 = new MyArrayList<>();
		list2.add("Tom");
		list2.add("张三");
		list2.add("李思");
		list2.add("王武");
		list2.add("张丽");
		list2.add("Tom");
		list2.add("张三");
		list2.add("李思");
		list2.add("王武");
		list2.add("张丽");
		list2.add("Tom");
		list2.add("张三");
		list2.add("李思");
		list2.add("王武");
		list2.add("张丽");
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
	}

}
