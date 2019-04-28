package com.demo.tests;

abstract class Component {
	
	public abstract void sum(int x, int y);
	
}

class Target extends Component {
	
	public void sum(int x, int y) {
		System.out.println("计算的和: "+(x+y));
	}
	
}

abstract class Decorator extends Component {
	
	protected Component component;

}

class TargetDecorator extends Decorator {
	
	public TargetDecorator(Component component) {
		this.component = component;
	}
	
	public void sum(int x, int y) {
		System.out.println("*******************************");
		component.sum(x, y);
		System.out.println("*******************************");
	}
	
}

/**
 * 使用装饰模式
 * @author Teacher
 * @createTime 2017年8月3日 上午11:43:01
 * @version 1.0.0
 */
public class TestDecorator {

	public static void main(String[] args) {
		Target target = new Target();
		target.sum(30, 50);
		/*TargetDecorator decorator = new TargetDecorator(target);
		decorator.sum(30, 50);*/
		Component decorator = new TargetDecorator(target);
		decorator.sum(30, 50);
	}

}
