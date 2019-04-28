package com.demo.tests;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Parent {
	
	public Parent() throws IOException {
		
	}
	
	public void method() throws IOException {
		/*try {
			
		} catch(IOException e) {
			
		}*/
	}
	
}

class Sub extends Parent {
	
	//必须创建这个构造方法，原因：父类的构造方法抛出了异常，而子类构造方法是父类构造方法的调用者，调用的方法抛出异常，作为方法的调用者必须捕获处理或抛出异常
	public Sub() throws IOException {

	}

	@Override
	public void method() {
		
	}
}

class MyObjectOutputStream extends ObjectOutputStream {
	
	private static File file;

	private MyObjectOutputStream(String path, boolean append) throws IOException {
		super(new FileOutputStream(path, append));
		
	}
	
	public static ObjectOutputStream getIntance(String path, boolean append) throws IOException {
		file = new File(path);
		return new MyObjectOutputStream(path, append);
	}
	
	@Override
	public void writeStreamHeader() throws IOException {
		if(!file.exists()||file.length()==0) {
			super.writeStreamHeader();
		} else {
			super.reset();
		}
	}

}

/**
 * 使用自定义对象输出流
 * @author Teacher
 * @createTime 2017年8月3日 下午4:47:28
 * @version 1.0.0
 */
public class TestMyObjectOutputStream {

	public static void main(String[] args) {
		try {
			//创建对象输出流
			ObjectOutputStream oos = MyObjectOutputStream.getIntance(
					"src/com/demo/tests/object.txt", true);
			//输出对象到文件中
			oos.writeObject(new Person("张三", 25));
			oos.writeObject(new Person("李思", 24));
			//关闭流
			oos.close();
			//创建对象输入流
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("src/com/demo/tests/object.txt")); 
			try {
				while(true) {
					Person p = (Person) ois.readObject();
					System.out.println(p.getName()+"\t"+p.getAge());
				}
			} catch(EOFException e) {

			}
			//关闭流
			ois.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
