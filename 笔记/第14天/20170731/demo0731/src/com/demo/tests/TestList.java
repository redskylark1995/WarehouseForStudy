package com.demo.tests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;


/**
 * 应用线性表
 * @author Teacher
 * @createTime 2017年7月31日 上午11:42:05
 * @version 1.0.0
 */
public class TestList {

	public static void main(String[] args) {
		//数组线性表
		ArrayList<Object> arrayList = new ArrayList<>(); //jdk1.7+
		//尾部追加元素
		arrayList.add(100);
		arrayList.add('渝');
		arrayList.add(true);
		arrayList.add(100);
		arrayList.add("中软");
		//指定位置插入元素
		arrayList.add(1, 100.68);
		System.out.println("元素个数："+arrayList.size());
		System.out.println("元素："+arrayList);
		//循环提取元素
		for(int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i)+"\t");
		}
		System.out.println();
		//修改指定位置的元素
		arrayList.set(3, "真");
		//删除下标为1的元素
		arrayList.remove(1);
		//for each
		for(Object e: arrayList) {
			System.out.print(e+"\t");
		}
		System.out.println();
		//搜索元素返回下标，未找到返回-1
		System.out.println(arrayList.indexOf(true));
		
		System.out.println("--------------------------------------------------");
		//链表
		LinkedList<Object> linkedList = new LinkedList<>();
		linkedList.add(100);
		linkedList.add('渝');
		linkedList.add(true);
		linkedList.add(100);
		linkedList.add("中软");
		linkedList.add(1, 100.25);
		//遍历元素，即循环提取元素
		for(int i=0; i<linkedList.size(); i++) {
			System.out.print(linkedList.get(i)+"\t");
		}
		System.out.println();
		System.out.println("元素个数: "+linkedList.size());
		System.out.println(linkedList);
		System.out.println("元素\"中软\"的下标: "+linkedList.indexOf(100));
		System.out.println("元素\"中软\"的下标: "+linkedList.lastIndexOf(100));
		//LinkedList中的方法
		linkedList.addFirst(20);
		linkedList.addLast(20);
		System.out.println(linkedList);
		/*linkedList.remove(new Integer(20));
		linkedList.remove(Integer.valueOf(20));*/
		/*linkedList.remove(0);
		linkedList.remove(linkedList.size()-1);*/
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println(linkedList);
		
		System.out.println("--------------------------------------------------");
		//向量
		Vector<Object> vector = new Vector<>();
		vector.add(30);
		vector.addElement(30);
		vector.add(1, true);
		vector.insertElementAt(false, 1);
		System.out.println(vector);
		vector.add('渝');
		vector.add("中软");
		System.out.println(vector);
		vector.set(1, "假");
		vector.setElementAt("渝州", 4);
		System.out.println(vector);
		vector.remove(1);
		vector.removeElementAt(4);
		System.out.println(vector);
		System.out.println("元素的个数: "+vector.size());
		System.out.println("当前容量："+vector.capacity());
		System.out.println("第二个元素: "+vector.get(1));
		
		System.out.println("--------------------------------------------------");
		//栈表
		Stack<Object> stack = new Stack<>();
		//栈继承向量，可以当成向量使用
		stack.add(100);
		stack.addElement(200);
		stack.insertElementAt("中国", 1);
		stack.add(1, "重庆");
		System.out.println(stack);
		for(int i=0; i<stack.size(); i++) {
			System.out.print(stack.get(i)+"\t");
		}
		System.out.println();
		//使用栈后进先出
		stack.clear();
		System.out.println(stack);
		//压入栈顶元素
		stack.push("How");
		stack.push("are");
		stack.push("you");
		stack.push("!");
		System.out.println(stack);
		//获得栈顶元素
		System.out.println("栈顶元素："+stack.peek());
		System.out.println(stack);
		/*System.out.println("栈顶元素："+stack.pop());
		System.out.println(stack);*/
		//搜索元素, 返回元素距栈顶的距离，从1开始，栈顶元素为1
		System.out.println("搜索元素\"you\"："+stack.search("you")); //2
		System.out.println("搜索元素\"!\"："+stack.search("!")); //1
		//循环提取元素
		while(!stack.empty()) {
			System.out.print(stack.pop()+"\t");
		}
		System.out.println();
	}
	
}





















