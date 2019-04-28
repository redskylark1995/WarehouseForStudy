package com.demo.works;

/**
 * 魔法师类
 * @author Teacher
 * @createTime 2017年7月21日 上午9:55:11
 * @version 1.0.0
 */
public class Magician extends Character {

	private String role; //角色
	private double attackBonus; //伤害加成

	public Magician() {

	}

	public Magician(String name, String level, String role,
			double HP, double defence, double attackBouns) {
		super(name, level, HP, defence);
		this.role = role;
		this.attackBonus = attackBouns;
	}

	/**
	 * 技能：大火球
	 * @return
	 */
	public double skill() {
		//伤害
		double hurt = 3000;
		//技能[火球术]  伤害:200.0  加成:150%  总伤害:300.0
		System.out.println("  技能[大火球]  伤害:"+hurt+"  伤害加成:"
				+attackBonus*100+"%  总伤害:"+hurt*attackBonus);
		//返回总伤害
		return hurt*attackBonus;
	}

	@Override
	public void attack() {
		System.out.println(getName()+"["+role+"]  LV"+getLevel()+"  开始攻击");
		//使用技能
		double hurt = skill();
		//获得“对方对手”对象
		Character enemy = getEnemy();
		//访问受攻击的方法
		enemy.receive(hurt);
	}

	@Override
	public void receive(double hurt) {
		//计算实际伤害
		double realHurt = hurt-getDefence();
		//计算并重置剩余的血量
		setHP(getHP()-realHurt);
		//阿蒙[剑士]  LV:50  受到伤害:300.0  防御:120.0  防御加成:0%    实际伤害:156.0  HP:19844.0
		System.out.println(getName()+"["+role+"]  LV:"+getLevel()+"  受到伤害:"
				+hurt+"  防御"+getDefence()+" 防御加成:0%    实际伤害:"
				+realHurt+"  HP:"+getHP());
	}

}
