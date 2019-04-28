package com.demo.test;

/**
 * 跳转语句
 * @author Teacher
 * @createTime 2017年7月13日 下午2:12:47
 * @version 1.0.0
 */
public class TestBreak {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//continue
		for(int i=0; i<10; i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		
		//break
		for(int i=0; i<10; i++) {
			if(i==5) {
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		
		//break 标记
		a:for(int i=0; i<10; i++) {
			if(i==5) {
				break a;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		
		//嵌套循环结构，内循环结束外循环
		a:for(int i=0; i<5; i++) {
			for(char j='A'; j<'A'+10; j++) {
				System.out.print(j+" ");
				if(j=='F') {
					break a;
				}
			}
			System.out.println();
		}
	}

}
