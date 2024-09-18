package gambling;
import java.util.Scanner;

public class gamblingGameRedo {
    
    String playerName;  // These are the variables that make up the player Objects
    int playerNumber;
    int playerScore = 0;
    
    gamblingGameRedo(String name, int number) { // This is a constructor that sets the name and the ID Number
        this.playerName = name;
        this.playerNumber = number;
    }
    
    public static void main(String[] args) {
        gamblingGameRedo[] listOfPlayers; // Stores all the info about the player Objects
        Scanner myInput = new Scanner(System.in); // Scanner to receive input
        String tempName;   // Used to store the usernames as they get inputed
        int tempInt;       // Used to store how many points a player scored
        int numRounds;     // number of rounds
        int highScore = 0;
        
        System.out.println("How many rounds?");
        numRounds = myInput.nextInt();
        System.out.println("How many players?");
        int numPlayers = myInput.nextInt();
        
        listOfPlayers = new gamblingGameRedo[numPlayers]; // Initializing an array of player objects (gamblingGame)
        
        for (int i = 0; i < numPlayers; i++) {  // Initializing player objects for each player input
            System.out.println("Enter player " + (i + 1));
            tempName = myInput.next();
            
            listOfPlayers[i] = new gamblingGameRedo(tempName, i);
            System.out.println("Welcome " + tempName + "! You are player #" + (i + 1));
        }
        
        for (int j = 0; j < numRounds; j++) { // For each round
            for (int i = 0; i < numPlayers; i++) { // For each player
                tempInt = (int) (Math.random() * 6 + 1); // Generate a random int 1-6, i.e., roll a 6-sided die
                System.out.println(listOfPlayers[i].playerName + " just rolled a " + tempInt);
                listOfPlayers[i].playerScore += tempInt; // Adds the roll to the previous score
            }
            for (int i = 0; i < numPlayers; i++) {
                System.out.print(listOfPlayers[i].playerName + " has " + listOfPlayers[i].playerScore + " points...");
            }
            System.out.println();
            System.out.println("End of Round " + (j + 1));
        }
        
        int winnerNumber = -1; // Initialize with a value that doesn't correspond to any player
        for (int i = 0; i < numPlayers; i++) {
            tempInt = listOfPlayers[i].playerScore;
            if (tempInt > highScore) {
                highScore = tempInt;
                winnerNumber = i;
            } else if (tempInt == highScore) {
                // If a player has the same score as the current winner, announce them as well
                System.out.println(listOfPlayers[i].playerName + " also has " + tempInt + " points and is tied for the lead.");
            }
        }
        
        if (winnerNumber != -1) {
            System.out.println(listOfPlayers[winnerNumber].playerName + " is the winner with " + highScore + " points.");
        } else {
            System.out.println("The game ended in a tie!");
        }
        
        myInput.close();
    }
}
