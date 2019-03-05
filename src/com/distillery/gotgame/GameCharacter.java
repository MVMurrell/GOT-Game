package com.distillery.gotgame;

public abstract class GameCharacter {
	
	private int health;
	final private String name;

	public GameCharacter(int health, String name) {
		super();
		
		this.health = health;
		this.name = name;
	}
	
	public void takedamage(int hitpoint) {
		health -= hitpoint;
		System.out.println();
		System.out.println(name + "'s health is " + health);
		
	}
	
//	public void setHitPoints(int weapon) {
//		hitpoints += weapon;
//		System.out.println(name + "'s new hitpoints are: " + hitpoints);
//	}
	
	public abstract int Attack (int attackMethod);
	
	public void getHealth() {
		System.out.println();
		System.out.println("Your health is " + health);
	}
	public int getHealthint() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
		

}
