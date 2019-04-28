package com.demo.works;

/**
 * 剑士类
 * @author Teacher
 * @createTime 2017年7月21日 上午9:55:51
 * @version 1.0.0
 */
public class Swordman extends Character {

	private String role; //角色
	private double defenceBouns; //防御加成
	
	public Swordman() {
		
	}
	
	public Swordman(String name, String level, String role,
			double HP, double defence, double defenceBouns) {
		super(name, level, HP, defence);
		this.role = role;
		this.defenceBouns = defenceBouns;
	}
	
	/**
	 * 技能：横扫千军
	 * @return
	 */
	public double skill() {
		//伤害
		double hurt = 1000;
		//技能[横扫千军]  伤害:800.0  加成:0%  总伤害:800.0
		System.out.println("  技能[横扫千军]  伤害:"+hurt+"  伤害加成:0%"
		        +"  总伤害:"+hurt);
		//返回总伤害
		return hurt;
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
		double realHurt = hurt-getDefence()*defenceBouns;
		//计算并重置剩余的血量
		setHP(getHP()-realHurt);
		//阿蒙[剑士]  LV:50  受到伤害:300.0  防御:120.0  防御加成:120%   实际伤害:156.0  HP:19844.0
		System.out.println(getName()+"["+role+"]  LV:"+getLevel()+"  受到伤害:"
		           +hurt+"  防御"+getDefence()+" 防御加成:"+defenceBouns*100+"%  实际伤害:"
				   +realHurt+"  HP:"+getHP());
	}

}





