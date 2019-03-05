package com.distillery.gotgame;

public class Tyrion extends GameCharacter {
	private int lives;

	public void hecklerMenu() {
		System.out.println();
		System.out.println("****MENU****");
		System.out.println("1) talk smack");
		System.out.println("2) ignore and continue");
	}

	public void death() {
		if (super.getHealthint() <= 0 && lives >= 1) {
			lives -= 1;
			System.out.println("You have "+ lives + " lives left" );
			super.setHealth(100);
			System.out.println("Your health has been restored, lets try this again");
		}
		
		else if( super.getHealthint() <= 0 && lives == 0){
			System.out.println("You Dead fo good\n"
					+ "GAME OVER");
			System.exit(0);
		}
		
	}

	public void bossMenu() {
		System.out.println();
		System.out.println("****MENU****");
		System.out.println("1) Talk your way out of it");
		System.out.println("2) Fight");
	}

	public void fightWOBraun() {
		System.out.println();
		System.out.println("****MENU****");
		System.out.println("1) bite (5hp)");
		System.out.println("2) kick (7hp)");
		System.out.println("3) punch (7hp)");
	}

	public void fightWithBraun() {
		System.out.println();
		System.out.println("****MENU****");
		System.out.println("1) stab (20hp)");
		System.out.println("2) Slash (40hp)");
		System.out.println("3) super attack (60hp) (takes away 10 health from you)");
	}

	public void talkSmack() {
		System.out.println();
		String[] hecklerSpeach = new String[] { "What is a poor commoner like you doing out of your hole!?",
				"Yeah, beacause you must be getting all of the ladies!",
				"Perhaps a bath would suit you at least once in your life!",
				"I need more wine befor I can hear what you are saying!", "Were you born of pig or dog!" };
		System.out.println(hecklerSpeach[((int) Math.random() * 4)]);
	}

	public Tyrion(int health, String name, int lives) {
		super(health, name);
		this.lives = lives;
	}

	@Override
	public int Attack(int attackMethod) {
		if (attackMethod == 1) {
			System.out.println();
			System.out.println("You just bit your enemy");
			return 5;
		} else if (attackMethod == 2) {
			System.out.println();
			System.out.println("You just kicked your enemy");
			return 7;
		} else if (attackMethod == 3) {
			System.out.println();
			System.out.println("You just punched your enemy");
			return 7;
		} else {
			System.out.println();
			System.out.println("not a valid choice you lose your turn and gicve 0 damage");
			return 0;
		}
	}
	public int AttackWBraun(int attackMethod) {
		if (attackMethod == 1) {
			System.out.println();
			System.out.println("You just stabbed your enemy (-20)");
			return 20;
		} else if (attackMethod == 2) {
			System.out.println();
			System.out.println("You just slashed your enemy (-40)");
			return 40;
		} else if (attackMethod == 3) {
			System.out.println();
			System.out.println("You just super attacked your enemy (-60) and (-10 to you)");
			super.takedamage(10);
			return 60;
		} else {
			System.out.println();
			System.out.println("not a valid choice you lose your turn and gicve 0 damage");
			return 0;
		}
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}



}
