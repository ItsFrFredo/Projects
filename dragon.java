package apsca;
import java.util.Random;
import java.util.Scanner;

public class dragon {

	
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println("Welcome to the Dragon Battle!");
	        System.out.print("Enter your name: ");
	        String yourName = scanner.nextLine();
	        System.out.print("Enter your weapon: ");
	        String weapon = scanner.nextLine();

	        int dragonHP = random.nextInt(51) + 50; // Random HP between 50 and 100
	        int yourHP = random.nextInt(51) + 50;   // Random HP between 50 and 100

	        System.out.println("A fearsome dragon with " + dragonHP + " HP appears before you!");
	        System.out.println(yourName + ", armed with " + weapon + ", has " + yourHP + " HP.");

	        while (dragonHP > 0 && yourHP > 0) {
	            // Simulate your attack
	            int yourDamage = random.nextInt(11) + 10; // Random damage between 10 and 20
	            dragonHP -= yourDamage;
	            System.out.println(yourName + " attacks the dragon with " + weapon + " for " + yourDamage + " damage.");

	            if (dragonHP <= 0) {
	                System.out.println("The dragon has been defeated! " + yourName + " is victorious!");
	                break;
	            }

	            // Simulate dragon's attack
	            int dragonDamage = random.nextInt(11) + 10; // Random damage between 10 and 20
	            yourHP -= dragonDamage;
	            System.out.println("The dragon counterattacks and deals " + dragonDamage + " damage to " + yourName + ".");

	            if (yourHP <= 0) {
	                System.out.println("The dragon has slain " + yourName + "! The battle is lost.");
	                break;
	            }

	            // Add a chance for dodging or healing (20% chance)
	            if (random.nextDouble() < 0.2) {
	                int healing = random.nextInt(11) + 5; // Random healing between 5 and 15
	                yourHP += healing;
	                System.out.println(yourName + " dodges the dragon's attack and heals " + healing + " HP!");
	            }
	        }

	}

}
