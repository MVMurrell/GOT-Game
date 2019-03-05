package com.distillery.gotgame;

import java.util.Scanner;

public class GOTGameApp {

	public static void main(String[] args) {
		int damage;
		int choice;
		Scanner input = new Scanner(System.in);
		Tyrion tyrion = new Tyrion(100, "Tyrion", 2);
		SnowCastleEnemy snowcastleenemy = new SnowCastleEnemy(100, "SnowCastleEnemy");
		WhiteWalker whitewalker = new WhiteWalker(100, "WhiteWalker");
		Cersei cersei = new Cersei(100, "THE MOUNTAIN");
		Heckler heckler = new Heckler(100, "Heckler");
		System.out.println("****Welcome to The Adventure of Tyrion Lannister****");
		System.out
				.println("Tyrion has grown tired of King's Landing.\n" + "His sister Cersie has become mad with power\n"
						+ " and his nephew is a tyrant King. Tyrion(You) must\n"
						+ "make your way through the land of Westeros and\n" + "not die.\n\n\n" + ""
						+ "You're on your way north to go visit The Wall to speak with\n"
						+ "John Snow when you encounter a heckler along the way...");
		System.out.println();
		do {
			tyrion.death();
			damage = heckler.Attack(((int)(1+ Math.random())* 4));
			tyrion.takedamage(damage);

			tyrion.hecklerMenu();
			choice = input.nextInt();
			if (choice == 1) {
				tyrion.talkSmack();
			}
		} while (choice != 2);

		System.out.println("That guy was a loser don't worry about him.\n"
				+ "As you are walking a long the path you are captured by\n"
				+ "by patrolmen of the Snow Castle. They take you back to the Castle\n"
				+ "and put you on trial for being an imp. You are being sentenced to death!\n");
		do {
			tyrion.death();
			tyrion.bossMenu();
			choice = input.nextInt();
			if (choice == 1) {
				tyrion.talkSmack();
				tyrion.setHealth(0);
				System.out.println("You were thrown out the MoonDoor");
			}

		} while (choice != 2);
		do {
			tyrion.death();
			System.out.println("You have choosen trial by battle, do you want\n"
					+ "fight for your self (type 1) or try to find a champion (option 2)?");
			choice = input.nextInt();

			if (choice == 1) {
				tyrion.death();
				System.out.println("You have chosen to fight for yourself");
				do {
					tyrion.fightWOBraun();
					choice = input.nextInt();
					damage = tyrion.Attack(choice);
					snowcastleenemy.takedamage(damage);
					damage = snowcastleenemy.Attack((int) ((1 + Math.random() * 3)));
					tyrion.takedamage(damage);
				} while (snowcastleenemy.getHealthint() > 0 && tyrion.getHealthint() > 0);
			} else {
				do {
					System.out.println(
							"Braun has choosen to fight for you and now will continue to fight for you forever,\n"
									+ "he just loves imps ;)");
					tyrion.fightWithBraun();
					choice = input.nextInt();
					damage = tyrion.AttackWBraun(choice);
					snowcastleenemy.takedamage(damage);
					if(snowcastleenemy.getHealthint()<=0) {
						break;
					}
					damage = snowcastleenemy.Attack((int)((1 + Math.random() * 3)));
					tyrion.takedamage(damage);
				} while (snowcastleenemy.getHealthint() > 0 && tyrion.getHealthint() > 0);

			}

		} while (snowcastleenemy.getHealthint() > 0);

		System.out.println("Congrats you are set free and your health is restored with plenty of wine.");
		tyrion.setHealth(100);
		tyrion.getHealth();
		System.out.println(
				"you are on your way again to the wall. But WAIT! there is another country man on the road that waves your over.");
		do {
			tyrion.death();
			damage = heckler.Attack(((int)(1+ Math.random())* 4));
			tyrion.takedamage(damage);

			tyrion.hecklerMenu();
			choice = input.nextInt();
			if (choice == 1) {
				tyrion.talkSmack();
			}
		} while (choice != 2);
		System.out.println(
				"What an A**hole, okay so you make it to the wall and the dudes there tell you he is beyond the wall\n"
						+ "and the peeps there tell you to venture off, \"its totally safe dude\" they say. So you go.\n"
						+ "Next thing you know its stupid cold and this pasty looking bloak is in your way....");

		whitewalker.Speech();
		System.out.println("Whoa, that is like a zoombie white walker dude or something, what will you do?");
		do {
			tyrion.death();

			tyrion.bossMenu();
			choice = input.nextInt();
			if (choice == 1) {
				tyrion.talkSmack();
				damage = whitewalker.Attack((int) ((1 + Math.random() * 3)));
				tyrion.takedamage(damage);
			}
			if (choice == 2) {
				do {
					tyrion.fightWithBraun();
					choice = input.nextInt();
					damage = tyrion.AttackWBraun(choice);
					whitewalker.takedamage(damage);
					if(whitewalker.getHealthint()<=0) {
						break;
					}
					damage = whitewalker.Attack((int) ((1 + Math.random() * 3)));
					tyrion.takedamage(damage);
				} while (whitewalker.getHealthint() > 0 && tyrion.getHealthint() > 0);
			}
		} while (whitewalker.getHealthint() > 0);
		
		System.out.println("Wow, I cant beleive you actually killed that thing! forget Jon Snow it is too cold, lets get back to Kings Landing where it is warm.\n"
				+ "you are walking, and walking.........\n"
				+ "after 3 fortnights you are finally back. However, the king has been poisoned shortly after\n"
				+ "your arrival. You are blamed by your sister and are put on trial for MURDER!!!");
		do {
			tyrion.death();
			tyrion.bossMenu();
			choice = input.nextInt();
			if (choice == 1) {
				tyrion.talkSmack();
				tyrion.setHealth(0);
				System.out.println("You have been beheaded!!!");
			}

		} while (choice != 2);
		do {
			tyrion.death();
			System.out.println("You have choosen trial by battle, do you want\n"
					+ "fight for your self (type 1) or try to find a champion (option 2)?");
			choice = input.nextInt();

			if (choice == 1) {
				tyrion.death();
				System.out.println("You have chosen to fight for yourself");
				do {
					tyrion.fightWOBraun();
					choice = input.nextInt();
					damage = tyrion.Attack(choice);
					cersei.takedamage(damage);
					damage = cersei.Attack((int) ((1 + Math.random() * 3)));
					tyrion.takedamage(damage);
				} while (cersei.getHealthint() > 0 && tyrion.getHealthint() > 0);
			} else {
				do {
					System.out.println(
							"Braun has choosen to fight for you again!!");
					tyrion.fightWithBraun();
					choice = input.nextInt();
					damage = tyrion.AttackWBraun(choice);
					cersei.takedamage(damage);
					if(cersei.getHealthint()<=0) {
						break;
					}
					damage = cersei.Attack((int) ((1 + Math.random() * 3)));
					tyrion.takedamage(damage);
				} while (cersei.getHealthint() > 0 && tyrion.getHealthint() > 0);

			}

		} while (cersei.getHealthint() > 0);

		System.out.println("WOW you won, congrats!!!!!\n"
				+ "*****!!!!@@@@@###$$$$$$$$$$$%%%%^^&&&&&***");
		input.close();
	}
}