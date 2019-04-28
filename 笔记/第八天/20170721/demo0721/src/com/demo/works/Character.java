package com.demo.works;

/**
 * 职业类
 * @author Teacher
 * @createTime 2017年7月21日 上午9:44:08
 * @version 1.0.0
 */
public abstract class Character {
	
	private String name; //昵称
	private String level; //等级
	private double HP; //血量
	private double defence; //防御力
	private Character enemy; //敌方对手
	
	public Character() {
		
	}
	
	public Character(String name, String level,
			double HP, double defence) {
		this.name = name;
		this.level = level;
		this.HP = HP;
		this.defence = defence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public double getHP() {
		return HP;
	}

	public void setHP(double hP) {
		HP = hP;
	}

	public double getDefence() {
		return defence;
	}

	public void setDefence(double defence) {
		this.defence = defence;
	}
	
	public Character getEnemy() {
		return enemy;
	}

	public void setEnemy(Character enemy) {
		this.enemy = enemy;
	}

	/**
	 * 攻击
	 */
	public abstract void attack();
	
	/**
	 * 受攻击
	 */
	public abstract void receive(double hurt);
	
}
