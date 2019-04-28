package com.demo.works;

/**
 * 动态数组
 * @author Teacher
 * @createTime 2017年7月31日 下午4:47:10
 * @version 1.0.0
 */
class DynamicArray {
	
	private Object[] data = new Object[5];
	private int size;
	
	/**
	 * 添加元素
	 * @param e
	 */
	public void add(Object e) {
		if(size>data.length-1) {
			Object[] newData  = new Object[data.length*2];
			for(int i=0; i<data.length; i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
		data[size] = e;
		size++;
	}
	
	/**
	 * 获得指定下标的元素
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		return data[index];
	}
	
	/**
	 * 返回元素的个数
	 * @return
	 */
	public int size() {
		return this.size;
	}
	
	/**
	 * 返回容量
	 * @return
	 */
	public int capacity() {
		return this.data.length;
	}
	
}

/**
 * 使用动态数组
 * @author Teacher
 * @createTime 2017年7月31日 下午4:46:41
 * @version 1.0.0
 */
public class DynamicArrayClient {

	public static void main(String[] args) {
		//创建动态数组的对象
		DynamicArray arr = new DynamicArray();
		arr.add(10);
		arr.add(20);
		arr.add(10);
		arr.add(30);
		arr.add(40);
		System.out.println("当前容量: "+arr.capacity());
		arr.add(50);
		System.out.println("当前容量: "+arr.capacity());
		arr.add("中软");
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i)+"\t");
		}
		System.out.println();
		System.out.println("元素个数: "+arr.size());
	}

}










