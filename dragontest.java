package apsca;
import java.util.Scanner;
public class dragontest {

	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Welcome to the Dragon battle!");
		System.out.println("What is thou name?");
		String name = scanner.nextLine();
		System.out.println("What is it thou wields");
		String weapon = scanner.nextLine();
		
		double dragonHp = Math.random() * 101 + 50;
		double yourHp = Math.random()* 51+50;
		
		System.out.println("A dragon with "+ (int)dragonHp+ " health has appeared!!");
		System.out.println(name+", armed with "+weapon+ " has " +(int)yourHp+ " health");
		
		while (dragonHp > 0 && yourHp > 0) {
			double yourDmg = Math.random() + 20;
			dragonHp -= (int)yourDmg;
			System.out.println("you have attcked the dragon and dealt " +(int)yourDmg+ " damage");
			
			if (dragonHp <= 0) {
				System.out.println("You have bested the dragon");
				break;
			}
			double dragonDmg = Math.random()* 10 +11;
			yourHp -= (int)dragonDmg;
			System.out.println("Your have been hit by the dragon for "+(int)dragonDmg+ " damage");
			
			if (yourHp <=0) {
				System.out.println("you died LLL");
				break;
			}
			if (Math.random() < 0.2) {
				double healing = Math.random()*5+10;
				yourHp += (int)healing;
				System.out.println("You have dodged the dragon and gained " +(int)healing+ " health");
			}
			if (Math.random() < 0.2) {
				double parry = Math.random() + 10; 
				yourDmg += (int)parry;
				System.out.println("You have parried the attack and dealt an extra "+(int)yourDmg+ " damage");
			}
			
		}
	}
}
