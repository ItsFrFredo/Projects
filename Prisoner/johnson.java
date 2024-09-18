package Prisoner;

public class johnson {
	public static int ROUNDS = 100;
	public static int COOPERATE = 1;
	public static int DEFECT = -1;
	int [] myMove = new int[ROUNDS];
	int[] opponentMoves = new int[ROUNDS];
	
	

	public void setOpponentMove(int round, int opponentMove) {
		this.opponentMoves[round] = opponentMove;
		
	}
	
	public int getNextMoveDefect(int round) {
		return DEFECT;
		
	}

	public int getNextMoveCooperate(int round) {
		return COOPERATE;
	}
	public int getNextMoveJohnsonA (int round) {
		if( round == 0) {
			return COOPERATE;
		}
		else {
			if (opponentMoves[round -1] == DEFECT) {
				return DEFECT;
			}
			else {
			return COOPERATE;
		}
	}
}
	public int getNextMoveRandom(int round) {
		int choice = (int) Math.round((Math.random() * 1) + 1);
		if (choice == 1) {
			return COOPERATE;
		}
		else if (choice == 2) {
			return DEFECT;
		}
		return choice;
	}
	public int getNextMoveJohnson(int round) {
		return DEFECT;
	}
}
