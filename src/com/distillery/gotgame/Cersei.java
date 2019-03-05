package com.distillery.gotgame;

public class Cersei extends GameCharacter {

	

	public Cersei(int health, String name) {
		super(health, name);
	}
	
	public void Speech() {
		System.out.println("Prepare yourself to fight the Mountain, General of the Queen's Guard");
	}
	@Override
	public int Attack(int attackMethod) {
		System.out.println();
		if (attackMethod == 1) {
			System.out.println("The Mountain just punted you accross the room!(-30)");
			return 30;
		}
		if (attackMethod == 2) {
			System.out.println("The Mountain just impaled you with a spear!(-40)");
			return 40;
		}
		if (attackMethod == 3) {
			System.out.println("The Mountain just ripped off a limb (-60)");
			return 60;
		}
		else {
			return 0;
		}
		
	}
	
}
