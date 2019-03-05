package com.distillery.gotgame;

public class WhiteWalker extends GameCharacter {

	

	public WhiteWalker(int health, String name) {
		super(health, name);
	}
	
	public void Speech() {
		System.out.println("ARRRGGGRRRRRR");
	}
	@Override
	public int Attack(int attackMethod) {
		if (attackMethod == 1) {
			System.out.println("The WhiteWalker just used his Ice Claw on you!(-15)");
			return 15;
		}
		else if (attackMethod == 2) {
			System.out.println("The WhiteWalker just used his Ice sword on you!(-25)");
			return 25;
		}
		else if (attackMethod == 3) {
			System.out.println("You just got iced slapped! (-35)");
			return 35;
		}
		else {
			return 0;
		}
	}
	
}
