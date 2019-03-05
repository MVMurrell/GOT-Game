package com.distillery.gotgame;

public class Heckler extends GameCharacter {

	public Heckler(int health, String name) {
		super(health, name);
	}

	@Override
	public int Attack(int attackMethod) {
		System.out.println();
		if (attackMethod == 1) {
			System.out.println("You are an ugly little imp!!(-5)");
			return 5;
		}
		if (attackMethod == 2) {
			System.out.println("Shouldn't you be at home kissing your sister(-5)");
			return 5;
		}
		if (attackMethod == 3) {
			System.out.println("I bet a half man like you gets mistaken for food by the smallest of beasts(-5)");
			return 5;
		}
		if (attackMethod == 4) {
			System.out.println("What is a wreched Lanister like you doing outside of the castle walls(-5)");
			return 5;
		} else {
			return 0;
		}

	}

}
