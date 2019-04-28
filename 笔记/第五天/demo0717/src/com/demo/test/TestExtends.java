package com.demo.test;

class Animal {
	
	String food;
	
	public void eat() {
		System.out.println("吃的食物: "+food+"!");
	}
	
	private void sleep() {
		System.out.println("请勿打扰!");
	}
	
}

class Dog extends Animal {
	
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println(name+"吃的食物: "+food);
	}
}

class Cat extends Animal {
	
}

public class TestExtends {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.food = "骨头";
		cat.food = "鱼";
		
		dog.eat();
		cat.eat();
		
		//dog.sleep(); //没有访问权限，不能继承
		//cat.sleep();
		
		dog.setName("托里");
		dog.printInfo();
	}

}
