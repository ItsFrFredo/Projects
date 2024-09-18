package dateGame;
import java.util.Scanner;
public class dateSim {

	public static void main(String[] args) {
	Scanner myInput= new Scanner(System.in);
	System.out.println("What is your name");
	String yourName = myInput.nextLine();
	System.out.println("You finally arrive at school");
	System.out.println("You're running a bit late but you really need to use the bathroom");
	System.out.println("Do you:");
	System.out.println(" 1. Go straight to class \n 2. go to the bathroom");
	int choice1 = myInput.nextInt();

	if (choice1 == 1) {
		System.out.println("You head straight to class. You start to run noticing that the bell for homeroom is about to ring. You start moving too fast and bump right into someone");
		System.out.println(" 1. Apologize and move to class \n 2. take time to help the person get up \n 3. yell at them for not paying attention");
		int choice2 =  myInput.nextInt();
		if (choice2 == 1) {
			System.out.println("You quickly apologize and go straight to class without taking the time to see who the person was. Now that you're in class, your teacher scolds you for being late.");
			System.out.println(" 1. Curse the teacher out \n 2. Go to your desk and do your work");
			int choice3 = myInput.nextInt();
			if (choice3 == 1) {
				System.out.println("You curse the teacher out and get sent to the principals office... never to be seen again");
			}
			if (choice3 == 2) {
				System.out.println("You do your work and live out the rest of your days alone... missing the oppurtunity of a lifetime");
			}
		}
		if(choice2 == 2) {
			System.out.println("\"OH MY GOODNESS I'm so sorry\". You take her hand, lock eyes and realize that she is actually gorjus \n after taking some time to help her up, you wonder if you should talk to her");
			System.out.println(" 1. Start a conversation with her \n 2. Go straight to class");
			int choice3 = myInput.nextInt();
			if (choice3 == 1) {
				System.out.println("\"H-h-h-h-h-h-hi my name is " + yourName + " and Wowzers you're really pretty\"");
				System.out.println("\"t-t-t-thank you. Youre not half bad yourself\"");
				System.out.println("You see that she is blushing and decide to make a move");
				System.out.println(" 1. Ask her out \n 2. Walk her to class");
				int choice4 = myInput.nextInt();
				if (choice4 == 1) {
					System.out.println("\"Do you wanna go out with me... or whatever??\"");
					System.out.println("\"OF COURSE LETS GETS MARRIED\"");
					System.out.println("You guys get married and live happily ever after");
				}
				if (choice4 == 2) {
					System.out.println("\"Let me walk you to class");
					System.out.println("You walk her to class");
					System.out.println(" 1. get  her number \n 2. run away like  a girl");
					int choice5 = myInput.nextInt();
					if (choice5 == 1) {
						System.out.println("\"lemme get ya digits gurl\"");
						System.out.println("\"ABSOLUTELY, LETS HAVE BABIES\"");
					}
					if (choice5 == 2) {
						System.out.println("You run away like a little girl and live out the rest of your days alone... missing the oppurtunity of a lifetime");
					}
					}
				}
			if (choice3 == 2) {
				System.out.println("You were late to class and the teacher yells at you");
				System.out.println(" 1. Curse the teacher out \n 2. Go to your desk and do your work");
				int choice4 = myInput.nextInt();
				if (choice4 == 1) {
					System.out.println("You curse the teacher out and get sent to the principals office... never to be seen again");
				}
				if (choice4 == 2) {
					System.out.println("You do your work and live out the rest of your days alone... missing the oppurtunity of a lifetime");
				}
			}
		}
		 if (choice2 == 3) {
			 System.out.println("\"WATCH WHERE YOURE GOING DUMDUM!\" You yelled at her for no apparent reason and now you realize that she was actually beautiful");
			 System.out.println("\"No need to be so mean about it\"");
			 System.out.println(" 1. Apologize \n 2. Play it off \n 3. Follow through with the rudeness");
			 int choice3 = myInput.nextInt();
			 if (choice3 == 1) {
				 System.out.println("You apologize but she is already upset and walks off... never seeing a woman again");
			 }
			 if (choice3 == 2) {
				 System.out.println("\" haha just kidding lol let me help you  out\" \n You help her and wonder if it would be a bad time to ask her out");
				 System.out.println(" 1. ask her out \n 2. go to class");
				 int choice4 = myInput.nextInt();
				 if (choice4 == 1) {
					 System.out.println("\"h-h-h-hey would you like to go out with me \" \n \" get away from me loser\"");
					 System.out.println("You are now a loser who will never get a girlfriend");
				 }
				 if (choice4 == 2) {
					 System.out.println("You go to class and do your work... never taling to a girl again");
				 }
			 }
			 if (choice3 == 3) {
				 System.out.println("You continue bullying her... but shes into that??? \n You realize that she is starting to blush and wonder what to do next");
				 System.out.println("1. Continue being mean \n 2. Walk away");
				 int choice4 = myInput.nextInt();
				 if (choice4 == 1) {
					 System.out.println("\"You should go out with me... loser\"");
					 System.out.println("Somehow it works and she falls in love... living happily ever after");
				 }
				 if (choice4 == 2) {
					 System.out.println("You walk away missing out on the oppurtunity of a lifetime... continuing to be alone for the rest of your life");
				 }
			 }
		 }
		
	}
	 if (choice1 == 2) {
		System.out.println("You take the sacrifice and go to relieve yourself. As you run towards the bathroom you go inside. But something is strange. There are no urinals??");
		System.out.println(" 1. Just go into a stall and dont worry about it. \n 2. Quickly run back outside to go to the mens bathroom");
		int choice2 = myInput.nextInt();
		if (choice2 == 1) {
			System.out.println("You can't resist the urge to poo, so you just hope no one comes in");
			System.out.println("*feminine voices* \"Hey do you smell that\"");
			System.out.println(" 1. mimic a girls voice and tell them its occupied \n 2. be quiet \n 3. wipe and quickly run out");
			int choice3 = myInput.nextInt();
			if (choice3 == 1) {
				System.out.println("*feminine voice* \"Sorry there's someone in this stall teehee");
				System.out.println("Your voice crack halfway through and you get caught \n on of the girls grabs you and pins you against the toilet inside the stall");
				System.out.println(" 1. fight back \n 2. cry");
				int choice4 = myInput.nextInt();
				if (choice4 == 1) {
					System.out.println("You attempt to fight back but she is massively stronger than you \n For some reason you see a smile on her face as if she enjoys it \n The girl tells you that she is into this kind of stuff");
					System.out.println( "1. let her keep going \n 2. fight back again");
					int choice5 = myInput.nextInt();
					if (choice5 == 1) {
						System.out.println(" She grabs you by the neck and pulls you closer, she whispers something in your ear \n \"Be a good little boy\"");
						System.out.println("1. bust");
						int choice6 = myInput.nextInt();
						if (choice6 == 1) {
							System.out.print("...nasty");
						}
					}
					if(choice5 == 2) {
						System.out.println("You make one final attempt to fight back but once again she is far too strong \n she grabs your neck harder and you black out");
						String choice6 = myInput.nextLine();
						if (choice6 == "") {
							System.out.println("You wake up in a dark room \n only able to hear her voice \n the only voice you will ever hear again");
						}
					}
				}
				if (choice4 == 2) {
					System.out.println("you cry like a lil girl... but she's into that???");
					System.out.println("There is absolutely nothing you can do \n you black out.");
					String choice5 = myInput.nextLine();
					if (choice5 == "") {
						System.out.println("You wake up in a dark room \n only able to hear her voice \n the only voice you will ever hear again");
					}
					
				}
			}
			if (choice3 == 2) {
				System.out.println("You stay quiet and wait for them to go outside \n After wating for a few minutes you take your first steps outside \n You thought it was okay but the two girls were still outside waiting for you. \n you get dragged to the prinicipals office... never to be seen again");
			}
			if (choice3 == 3) {
				System.out.println("You attempt to run away but they trip you while you get out the door");
				System.out.println("One of them jumps on top of you and pins you against the floor");
				System.out.println("1. fight back \n 2. cry");
				int choice4 = myInput.nextInt();
				if (choice4 == 1) {
					System.out.println("You attempt to fight back but she is massively stronger than you \n For some reason you see a smile on her face as if she enjoys it \n The girl tells you that she is into this kind of stuff");
					System.out.println( "1. let her keep going \n 2. fight back again");
					int choice5 = myInput.nextInt();
					if (choice5 == 1) {
						System.out.println(" She grabs you by the neck and pulls you closer, she whispers something in your ear \n \"Be a good little boy\"");
						System.out.println("1. bust");
						int choice6 = myInput.nextInt();
						if (choice6 == 1) {
							System.out.print("...nasty");
						}
					}
					if(choice5 == 2) {
						System.out.println("You make one final attempt to fight back but once again she is far too strong \n she grabs your neck harder and you black out");
						String choice6 = myInput.nextLine();
						if (choice6 == "") {
							System.out.println("You wake up in a dark room \n only able to hear her voice \n the only voice you will ever hear again");
						}
					}
				}
				if (choice4 == 2) {
					System.out.println("you cry like a lil girl... but she's into that???");
					System.out.println("There is absolutely nothing you can do \n you black out.");
					String choice5 = myInput.nextLine();
					if (choice5 == "") {
						System.out.println("You wake up in a dark room \n only able to hear her voice \n the only voice you will ever hear again");
					}
					
				}
				
			}
			
		}
	 
		if (choice2 == 2) {
			System.out.println("You quickly run out towards the mens bathroom and see a couple of girls staring at you with disgust in their eyes \n You successfully use the bathroom, and since youre already late, you might as well go to your locker");
			System.out.println(" 1. Go to your locker \n 2. Go to class");
			int choice3 = myInput.nextInt();
			if (choice3 == 1) {
				System.out.println("You go to your locker and see someone unfamiliar in the distance");
				System.out.println("1. approach them \n 2. dont worry about it");
				int choice4 = myInput.nextInt();
				if (choice4 == 1) {
					System.out.println("You go up to her and realize how beautiful she is. \n you strike up a conversation with her");
					System.out.println(" 1. \"Hey, youre pretty cute not gonna lie\" \n 2. \"Youre in my way, move.\"");
					int choice5 = myInput.nextInt();
					if (choice5 == 1) {
						System.out.println("You call her cute and she blushes. You work up the courage to ask her out. \n She says yes and you live happily evr after");
					}
					if (choice5 == 2) {
						System.out.println("Your'e rude to her... but she starts to blush");
						 System.out.println(" 1. Apologize \n 2. Play it off \n 3. Follow through with the rudeness");
						 int choice6 = myInput.nextInt();
						 if (choice6 == 1) {
							 System.out.println("You apologize but she is upset and walks off... never seeing a woman again");
						 }
						 if (choice6 == 2) {
							 System.out.println("\" haha just kidding lol let me help you  out\" \n You help her and wonder if it would be a bad time to ask her out");
							 System.out.println(" 1. ask her out \n 2. go to class");
							 int choice7 = myInput.nextInt();
							 if (choice7 == 1) {
								 System.out.println("\"h-h-h-hey would you like to go out with me \" \n \" get away from me loser\"");
								 System.out.println("You are now a loser who will never get a girlfriend");
							 }
							 if (choice7 == 2) {
								 System.out.println("You go to class and do your work... never taling to a girl again");
							 }
						 }
						 if (choice6 == 3) {
							 System.out.println("You continue bullying her... but shes into that??? \n You realize that she is starting to blush and wonder what to do next");
							 System.out.println("1. Continue being mean \n 2. Walk away");
							 int choice7 = myInput.nextInt();
							 if (choice7 == 1) {
								 System.out.println("\"You should go out with me... loser\"");
								 System.out.println("Somehow it works and she falls in love... living happily ever after");
							 }
							 if (choice7 == 2) {
								 System.out.println("You walk away missing out on the oppurtunity of a lifetime... continuing to be alone for the rest of your life");
							 }
						 }
					 
					}
					
				}
				if (choice4 == 2) {
					System.out.println(" Now that you're in class, your teacher scolds you for being late.");
					System.out.println(" 1. Curse the teacher out \n 2. Go to your desk and do your work");
					int choice5 = myInput.nextInt();
					if (choice5 == 1) {
						System.out.println("You curse the teacher out and get sent to the principals office... never to be seen again");
					}
					if (choice5 == 2) {
						System.out.println("You do your work and live out the rest of your days alone... missing the oppurtunity of a lifetime");
					}
				}
			}
			if (choice3 == 3) {
				System.out.println(" Now that you're in class, your teacher scolds you for being late.");
				System.out.println(" 1. Curse the teacher out \n 2. Go to your desk and do your work");
				int choice4 = myInput.nextInt();
				if (choice4 == 1) {
					System.out.println("You curse the teacher out and get sent to the principals office... never to be seen again");
				}
				if (choice4 == 2) {
					System.out.println("You do your work and live out the rest of your days alone... missing the oppurtunity of a lifetime");
				}
			}
		}
	 }
	}
	
}

