package debugging;
import java.util.Scanner;

public class gamblingGame {
	
	String playerName;  //These are the variables that make up the player Objects 
	int playerNumber;    
	int playerScore =0;
	
	gamblingGame(String name, int number){ //This is a constructor that sets the name and the ID Number
		this.playerName = name;
		this.playerNumber = number;
	}
	
	public static void main( String[] arg){

		gamblingGame[] listOfPlayers; //Stores all the info about the player Objects
		Scanner myInput = new Scanner(System.in); //Scanner to receive input
		String tempName;   // Used to store the usernames as they get inputed 
		int tempInt;       // Used to store how many points a player scored
		int numRounds;     // number of rounds
		int winnerNumber=0; //The id number of the winner of the whole game
		int highScore=0;

		System.out.println("How many rounds?");
		numRounds = myInput.nextInt();	
		System.out.println("How many players?");
		int numPlayers = myInput.nextInt();
		
		listOfPlayers = new gamblingGame[numPlayers]; //initializing an array of player object (gamblingGame)
		
		for(int i = 0; i<numPlayers; i++){  // initializing player objects for each player input
			System.out.println("Enter player "+(i+1));
			tempName = myInput.next();
			
			listOfPlayers[i]= new gamblingGame(tempName, i);
			System.out.println("Welcome "+tempName+"! You are player #"+ (i+1));
			}
		for( int j = 0; j< numRounds; j++){ //for each round
			for( int i = 0; i<numPlayers;i++){ //for each player
				tempInt = (int) (Math.random()*6+1); //generate and random int 1-6 ie roll a 6 sided die
				System.out.println(listOfPlayers[i].playerName+ " just rolled a "+tempInt);
				listOfPlayers[i].playerScore += tempInt; //adds the roll to the previous score
			}	
		for( int i = 0;i<numPlayers;i++){
				System.out.print(listOfPlayers[i].playerName+ " has "+ listOfPlayers[i].playerScore + " points...");
		}
			System.out.println();
			System.out.println("End of Round "+ (j+1));
		
		for( int i = 0; i< numPlayers; i++){
			
			tempInt = listOfPlayers[i].playerScore;
			if(tempInt > highScore){
				highScore = tempInt;
				winnerNumber = i;
			
			} 
		}
		System.out.println();
		System.out.println(listOfPlayers[winnerNumber].playerName + " is the winner with "+ listOfPlayers[winnerNumber].playerScore + " points" );
		}
		myInput.close();
		
	}

	
	
	
}