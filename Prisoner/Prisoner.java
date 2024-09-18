package Prisoner;
public class Prisoner {
	public static int ROUNDS = 100;
	public static int COOPERATE = 1;
	public static int DEFECT = -1;
	int myMove = 0;
	int lastOpponentMove = 0;
	
	public static void main( String[] args){
		
		int prisonerAMove;
		int prisonerBMove;
		
		int[] prisonerARecord = new int[ROUNDS];
		int[] prisonerBRecord = new int[ROUNDS];
		int[][] roundScores = new int[2][ROUNDS];
		
		johnson a = new johnson(); //It would be your class instead of the the class Kumagai
		johnson b = new johnson();
		
		System.out.println("Testing Against COOPERATE Bot");
		
		for( int i = 0; i < 100; i++){
			prisonerAMove = a.getNextMoveJohnson(i );  //You would only need to implement getNextMove where it returns either a -1 or 1 depending on its choice
			prisonerBMove = b.getNextMoveRandom(i ); //You will be tested against 4 different bots. 
			/* Cooperate Bot
			 * Defect Bot
			 * Random Bot
			 * Johnson Bot*/
			a.setOpponentMove(i, prisonerBMove);
			b.setOpponentMove(i, prisonerAMove);
			
			if( prisonerAMove == DEFECT && prisonerBMove == DEFECT){
				roundScores[0][i] = 1;
				roundScores[1][i] = 1;
			}
			if( prisonerAMove == COOPERATE && prisonerBMove == COOPERATE){
				roundScores[0][i] = 3;
				roundScores[1][i] = 3;
			}
			if( prisonerAMove == DEFECT && prisonerBMove == COOPERATE){
				roundScores[0][i] = 5;
				roundScores[1][i] = 0;
			}
			if( prisonerAMove == COOPERATE && prisonerBMove == DEFECT){
				roundScores[0][i] = 0;
				roundScores[1][i] = 5;
			}
			System.out.println("Round "+ i );	
			System.out.println("Prisoner A: "+ prisonerAMove);
			System.out.println("Prisoner B:"+ prisonerBMove);
			
		}
		int AScore = 0;
		int BScore = 0;
		for( int i = 0; i < ROUNDS; i++){
			AScore = AScore + roundScores[0][i];
			BScore = BScore + roundScores[1][i];
		}
		System.out.println("Prisoner A Scored "+ AScore);
		System.out.println("Prisoner B Scored "+ BScore);
		
		
	}
}