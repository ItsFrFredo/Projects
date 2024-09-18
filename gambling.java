package gambling;
import java.util.Random;
import java.util.Scanner;

public class gambling {
    static String[] playerNames;
    static int[] playerBalances;
    static int numPlayers;
    static int numRounds;
    static final int MIN_BET = 1;
    static final int MAX_BET = 100;

    public gambling(String name, int balance) {
        // Constructor to create players with names and initial balances
    }

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.println("How many players?");
        numPlayers = myInput.nextInt();
        myInput.nextLine(); // Consume newline

        playerNames = new String[numPlayers];
        playerBalances = new int[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Enter the name of Player " + (i + 1) + ": ");
            playerNames[i] = myInput.nextLine();
            System.out.println("Enter the initial balance for Player " + (i + 1) + ": ");
            playerBalances[i] = myInput.nextInt();
            myInput.nextLine(); // Consume newline
        }

        System.out.println("How many rounds?");
        numRounds = myInput.nextInt();

        for (int round = 1; round <= numRounds; round++) {
            System.out.println("Round " + round + " begins!");
            playRouletteRound();
        }
    }

    public static void playRouletteRound() {
        Random random = new Random();
        int winningNumber = random.nextInt(37); // Simulate the roulette wheel (0 to 36)

        System.out.println("The winning number is: " + winningNumber);

        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Player " + playerNames[i] + ", it's your turn.");
            int betAmount = getPlayerBet(playerNames[i], playerBalances[i]);
            int betNumber = getPlayerBetNumber();

            if (betNumber == winningNumber) {
                int winnings = betAmount * 36; // Winning on the exact number
                playerBalances[i] += winnings;
                System.out.println(playerNames[i] + " wins " + winnings + " chips!");
            } else if (isWinningColor(betNumber) == isWinningColor(winningNumber)) {
                int winnings = betAmount * 2; // Winning on the color
                playerBalances[i] += winnings;
                System.out.println(playerNames[i] + " wins " + winnings + " chips!");
            } else {
                playerBalances[i] -= betAmount;
                System.out.println(playerNames[i] + " lost " + betAmount + " chips.");
            }

            System.out.println(playerNames[i] + "'s balance: " + playerBalances[i] + " chips.");
        }
    }

    public static int getPlayerBet(String playerName, int balance) {
        Scanner input = new Scanner(System.in);
        int betAmount = 0;

        while (betAmount < MIN_BET || betAmount > MAX_BET || betAmount > balance) {
            System.out.println(playerName + ", enter your bet amount (between " + MIN_BET + " and " + Math.min(MAX_BET, balance) + "): ");
            betAmount = input.nextInt();
            if (betAmount < MIN_BET) {
                System.out.println("Minimum bet amount is " + MIN_BET);
            } else if (betAmount > Math.min(MAX_BET, balance)) {
                System.out.println("You don't have enough balance for that bet.");
            }
        }

        return betAmount;
    }

    public static int getPlayerBetNumber() {
        Scanner input = new Scanner(System.in);
        int betNumber = -1;

        while (betNumber < 0 || betNumber > 36) {
            System.out.println("Enter your bet number (0-36): ");
            betNumber = input.nextInt();
        }

        return betNumber;
    }

    public static boolean isWinningColor(int number) {
        return (number != 0 && (number % 2 == 0 && number <= 10 || number % 2 != 0 && number >= 11)) || (number == 0);
    }
}