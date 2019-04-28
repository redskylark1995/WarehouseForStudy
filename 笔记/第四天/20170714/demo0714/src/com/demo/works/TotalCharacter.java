package com.demo.works;

/**
 * 已知一个字符数组{'b', 'a', 'e', 'c', 'a', 'c', 'c', 'b'}, 统计字符个数，输出结果如下：
 * 2a2b3c1e
 * @author Teacher
 * @createTime 2017年7月14日 上午9:29:34
 * @version 1.0.0
 */
public class TotalCharacter {

	public static void main(String[] args) {
		//定义字符数组
		char[] charArr = {'b', 'a', 'e', 'c', 'a', 'c', 'c', 'b'};
		//定义变量，记录统计出字符总数
		int total = 0;
		//循环统计字符的数量
		for(char i='a'; i<='z'&&total<charArr.length; i++) {
			//定义变量，记录单个字符的数量
			int count = 0;
			//统计单个字符
			for(int j=0; j<charArr.length; j++) {
				if(i==charArr[j]) {
					count++;
				}
			}
			//判断是否存在要统计的字符
			if(count>0) {
				//累加统计出的字符总数
				total += count;
				//输出本次统计结果
				System.out.print(""+count+i);
			}
		}
		System.out.println();
	}

}
