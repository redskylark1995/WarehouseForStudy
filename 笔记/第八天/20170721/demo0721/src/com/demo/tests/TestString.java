package com.demo.tests;

/**
 * 字符串操作
 * @author Teacher
 * @createTime 2017年7月21日 下午3:19:39
 * @version 1.0.0
 */
public class TestString {

	public static void main(String[] args) {
		/*String str = "abc";
		str = "ABC";
		str = str+"efg"; //字符串相加，会创建一个新的字符串对象
		System.out.println("".hashCode());
		String str1 = null;
		String str2 = "";
		System.out.println(str1);
		System.out.println(str2);*/
		
		String str = "abcefgabkhefx";
		System.out.println("字符串长度："+str.length());
		System.out.println("获得下标为4的字符："+str.charAt(4));
		System.out.println(str.concat("hello"));
		System.out.println("搜索字符子串\"ef\"："+str.indexOf("ef"));
		System.out.println("反向搜索字符子串\"ef\"："+str.lastIndexOf("ef"));
		System.out.println(str.substring(4));
		System.out.println(str.substring(4, 10));
		
		str = "How are you! nice to meet you! nice to meet you too!";
		System.out.println(str.replace("you", "您们"));
		System.out.println(str.replaceFirst("you", "您们"));
		str = "abc123efg456hi789"; 
		//删除所有的数字
		System.out.println(str.replaceAll("\\d", ""));
		//删除所有字母
		System.out.println(str.replaceAll("\\D", "#"));
		
		str = "Jack,Tom,Rose,Lily";
		String[] names = str.split(",");
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		str = "  Tom   ";
		System.out.println(str);
		System.out.println(str.length());
		str = str.trim();
		System.out.println(str);
		System.out.println(str.length());
		
		String str1 = "abc";
		String str2 = "ABC";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		str = "https://www.baidu.com/index.html";
		System.out.println(str.startsWith("https"));
		System.out.println(str.endsWith("html"));
		System.out.println(str.contains("www.baidu.com"));
		
		str = "ABCefg";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println("-----------------------------------------");
		String url = "http://www.gov.cn/premier/2017-07/20/content_5212081.htm";
		System.out.println("文件类型："+url.substring(url.lastIndexOf(".")));
		System.out.println("文件名："+url.substring(
				url.lastIndexOf("/")+1, url.lastIndexOf(".")));
		
		if(url.startsWith("https://")) {
			System.out.println("使用安全协议访问!");
		} else {
			System.out.println("未使用安全协议访问!");
		}
		
		String[] dirs = url.split("//")[1].split("/");
		String space = "";
		for(int i=1; i<dirs.length; i++) {
			System.out.println(space+dirs[i]);
			space += "    ";
		}
	}
}





