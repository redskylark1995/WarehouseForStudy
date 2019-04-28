package com.demo.works;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Properties;

/**
 * 人员类
 * @author Teacher
 * @createTime 2017年7月27日 上午10:01:34
 * @version 1.0.0
 */
class Person {
	
	private String number;
	private String name;
	private String gender;
	private Date birthday;
	
	public Person() {
		
	}
	
    public Person(String number, String name,
    		String gender, Date birthday) {
    	this.number = number;
    	this.name = name;
    	this.gender = gender;
    	this.birthday = birthday;
    }
    
    @Override
    public String toString() {
    	return number+", "+name+", "+gender+", "+birthday;
    }
}

/**
 * 反射+工厂模式 创建并初始化对象，使用简单工厂模式
 * 工厂模式：统一创建对象的一种设计模式
 * 理解：一般创建对象的方式，new 构造方法(参数); 创建对象，任何地方均可创建；工厂模式，一个类或多个类的对象的创建交给一个工厂类来完成。
 * 工厂模式的分类：
 *    简单工厂模式（又称为静态工厂模式）
 *    抽象工厂模式                   创建多种不同类的对象
 *    抽象工厂方法模型           创建同一类的对象 
 * @author Teacher
 * @createTime 2017年7月27日 上午9:45:42
 * @version 1.0.0
 */
class SimpleFactory {
	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat();
	
	public static Object create(String propFileName) {
		try {
			//加载属性文件
			Properties prop = new Properties();
			prop.load(new FileInputStream("src/"+propFileName));
			//获得类名
			String className = prop.getProperty("className");
			//加载类，获得类的信息对象
			Class classInfo = Class.forName(className);
			//创建对象
			Object object = classInfo.newInstance();
			//获得属性数组
			Field[] fields = classInfo.getDeclaredFields();
			//遍历数组
			for(Field field: fields) {
				//获得属性名称
				String fieldName = field.getName();
				//获得属性的值
				String value = prop.getProperty(fieldName);
				//判断是否获得值
				if(value!=null) {
					//取消访问权限检测
					field.setAccessible(true);
					//判断是否是日期类型
					if(field.getType()==Date.class) {
						//设置格式化的日期格式
						dateFormat.applyPattern("yyyy-MM-dd");
						//字符串格式化成日期型
						Date date = new Date(dateFormat.parse(value).getTime());
						field.set(object, date);
					} /*else if(field.getType()==Timestamp.class) {
						
					}*/ else {
						field.set(object, value);
					}
				}
			}
			return object;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}
	
}


/**
 * 使用 "反射+工厂模式"创建对象
 * @author Teacher
 * @createTime 2017年7月27日 上午10:03:19
 * @version 1.0.0
 */
public class SimpleFactoryClient {

	public static void main(String[] args) {
		//创建人员对象
		Person p = (Person) SimpleFactory.create("person.properties");
		System.out.println(p);
	}

}
