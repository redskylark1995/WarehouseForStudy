package com.demo.works;

/**
 * 对战平台
 * @author Teacher
 * @createTime 2017年7月21日 上午10:31:47
 * @version 1.0.0
 */
public class GamePVP {

	public static void main(String[] args) {
		//创建玩家对象
		Character magician = new Magician(
				"小圆", "60", "大魔导师", 5000, 50, 1.5);
		Character Swordman = new Swordman(
				"阿莫", "60", "骑士", 20000, 800, 1.2);
		//设置对手
		magician.setEnemy(Swordman);
		Swordman.setEnemy(magician);
		//循环，不断攻击对手，直到HP归0为止
		while(magician.getHP()>0&&Swordman.getHP()>0) {
			try {
				magician.attack();
				Thread.sleep(1000);
				Swordman.attack();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//游戏结束后，判断赢家，属性结束信息
		if(magician.getHP()>0) {
			System.out.println("游戏结束，恭喜"+magician.getName()+"获胜!");
		} else if(Swordman.getHP()>0) {
			System.out.println("游戏结束，恭喜"+Swordman.getName()+"获胜!");
		} else {
			System.out.println("游戏结束，平局!");
		}
	}

}
