package com.myStudy.security.test;

import java.util.HashMap;
import java.util.Map;

import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;
import jdk.nashorn.internal.runtime.JSONFunctions;
import jdk.nashorn.internal.runtime.JSONListAdapter;

public class Test {
	static int k[] = { 1,8,4,7,5};
	public static void main(String[] args) {
		
		d();
		
	}
	public static void m() {

		for(int j=0;j<k.length-1;j++) {
			for(int i=0;i<k.length-1;i++) {
				if(k[i+1]<k[i]) {
					int tem =k[i+1];
					k[i+1]=k[i];
					k[i]=tem;
				}
			}
		}
		
		for(int a:k) {
			System.out.print(""+a);
		}
	}
	
	public static void c() {
		for(int j=0;j<k.length-1;j++) {
			for(int i = j; i <k.length-1;i++) {
				if(k[i]<k[i+1]) {
					break;
				}
				int tem =k[i+1];
				k[i+1]=k[i];
				k[i]=tem;
			}
		}
		for(int a:k) {
			System.out.print(""+a);
		}
	}
	public static void d() {
		String a ="123";
		Object b =a;
		Map<String, Object>  map = new HashMap<>();
		Map<String, Object> map1 = new HashMap<>();
		map1.put("123", a);
		map.put("map", map1);
		Object x = map;
//		JSON.stringify(x);

	}
	
	
}
