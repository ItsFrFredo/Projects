package tictactoe;
import java.util.Scanner;
public class tictactoe{
	

	

	public static void main (String[] args) {
		char[][] TTTBoard = new char[3][3];
		int numMoves = 0;
		for (int i=0; i < 3; i++) {
			for (int j =0; j< 3; j++) {
				TTTBoard[i][j] = '-';
			}
		}
		board(TTTBoard);
		System.out.println("Welcome to tictactoe");
		System.out.println("Type in where you want to place your character");
		Scanner myInput = new Scanner(System.in);
		while ( numMoves < 9) {
			String moveLocation = myInput.next();
            char x0ro = (numMoves % 2 == 0) ? 'x' : 'o';
            TTTBoard = changeBoard(moveLocation, x0ro, TTTBoard);
            board(TTTBoard);
            char winner = checkWin(TTTBoard);
            if (winner != '-') {
                System.out.println("Player " + winner + " wins on " + getWinningLine(moveLocation));
                break;
            }
            numMoves++;
            if (numMoves == 9) {
                System.out.println("It's a draw!");
            }
		}
	
	}
	
	public static void board(char[][] TTTBoard) {
		System.out.println("      A     B    C");
		char rowLabel = '1';
		for(int i=0; i<3; i++) {
			System.out.print(rowLabel + "  ");
			for(int j=0; j<3; j++) {
				System.out.print("|  "+TTTBoard[i][j]+ " ");
				System.out.print("|");
			}
			
			System.out.println();
			System.out.println("   |----------------|");
			System.out.println();
			rowLabel++;
		}
		
	}

	 public static char checkWin(char[][] board) {
//checks the middle of the board
		 for (int i = 0; i < 3; i++) {
	            if ((board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) ||
	                (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i])) {
	                return board[i][0];
	            }
	        }
	        
	        // Check diagonals for a win
	        if ((board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
	            (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
	            return board[1][1];
	        }
	        
	        return '-';
	    }



	 public static char[][] changeBoard(String location, char xOrO, char[][] board) {
	        int row = -1;
	        int col = -1;
	        
	        char[] validRows = {'1', '2', '3'};
	        char[] validCols = {'A', 'B', 'C'};
	        
	        for (int i = 0; i < validRows.length; i++) {
	            if (location.charAt(1) == validRows[i]) {
	                row = i;
	                break;
	            }
	        }
	        
	        for (int j = 0; j < validCols.length; j++) {
	            if (location.charAt(0) == validCols[j]) {
	                col = j;
	                break;
	            }
	        }
	        
	        if (row != -1 && col != -1 && board[row][col] == '-') {
	            board[row][col] = xOrO;
	        } else {
	            System.out.println("Invalid move. Try again.");
	        }
	       
	        return board;
	 }  
	        
	        	public static String getWinningLine(String location) {
	                char row = location.charAt(1);
	                char col = location.charAt(0);
	                
	                
	                if (row == '1' || row == '2' || row == '3') {
	                    return "row " + row;
	                } else if (col == 'A' || col == 'B' || col == 'C') {
	                    return "column " + col;
	                } else if ((col == 'A' && row == '1') || (col == 'B' && row == '2') || (col == 'C' && row == '3')) {
	                    return "diagonal";
	                } else if ((col == 'C' && row == '1') || (col == 'B' && row == '2') || (col == 'A' && row == '3')) {
	                    return "diagonal";
	                }
	                
	                return "unknown";
	        }
	        
	 }


	   