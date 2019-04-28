package com.demo.works;

/**
 * 创建二维数组，用于存放学员的信息。
 * @author Teacher
 * @createTime 2017年7月17日 上午9:29:50
 * @version 1.0.0
 */
public class StudentMessage {

	public static void main(String[] args) {
		String[][] students = new String[3][5];
		students[0][0] = "140256";
		students[0][1] = "计算机系";
		students[0][2] = "张丽";
		students[0][3] = "女";
		students[0][4] = "20";
		students[1][0] = "140257";
		students[1][1] = "计算机系";
		students[1][2] = "张武";
		students[1][3] = "男";
		students[1][4] = "20";
		students[2][0] = "140258";
		students[2][1] = "计算机系";
		students[2][2] = "李丽";
		students[2][3] = "女";
		students[2][4] = "20";
		for(int i=0; i<students.length; i++) {
			for(int j=0; j<students[i].length; j++) {
				System.out.print(students[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
