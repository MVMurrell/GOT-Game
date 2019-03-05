package com.distillery.gotgame;

public class SnowCastleEnemy extends GameCharacter {

	

	public SnowCastleEnemy(int health, String name) {
		super(health, name);
	}
	
	public void Speech() {
		System.out.println();
		System.out.println("Prepare to die by the edge of my sword IMP!!");
	}
	@Override
	public int Attack( int attackMethod) {
		System.out.println();
		if (attackMethod == 1) {
			System.out.println("The Knight of the Snow Castle head butted you!(-10)");
			return 10;
		}
		else if (attackMethod == 2) {
			System.out.println("The Knight of the Snow Castle just stabbed you!(-15)");
			return 15;
		}
		else if (attackMethod == 3) {
			System.out.println("The Knight of the Snow Castle slashed you(-25)");
			return 25;
		}
		else {
			return 0;
		}
	}
	
}
