import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		int tieGames = 0;
		int computerWins = 0;
		int playerWins = 0;
		
		String usersMove;
		String computersMove;
		
		for(int round = 0; round < 10; round++) {
			usersMove = getUsersNextMove();
			computersMove = getComputersNextMove();
			
			System.out.println("\n" + usersMove + " vs " + computersMove);
			
			switch(playRockPaperScissors(usersMove, computersMove)) {
				case 0:
					System.out.println("TIE, no winner\n");
					tieGames += 1;
					break;
				case 1:
					System.out.println("COMPUTER wins\n");
					computerWins += 1;
					break;
				case 2:
					System.out.println("YOU win\n");
					playerWins += 1;
					break;
			}
		}
		
		System.out.println("----------------");
		System.out.println("Player wins: " + playerWins + "\nComputer wins: " + computerWins + "\nTie games: " + tieGames);
		System.out.println("----------------");
	}
	
	public static String correctUsersMoveSpelling(String usersMove) {
		switch(usersMove.substring(0,2)) {
		case "RO":
			usersMove = "ROCK";
			break;
		case "PA":
			usersMove = "PAPER";
			break;
		case "SC":
			usersMove = "SCISSORS";
			break;
		}
		
		return usersMove;
	}
	
	public static String getUsersNextMove() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type your move (Rock, Paper, or Scissors) >> ");
		String usersNextMove = input.nextLine().toUpperCase();
		
		while(!usersNextMove.startsWith("RO") && !usersNextMove.startsWith("PA") && !usersNextMove.startsWith("SC")) {
			System.out.println("INVALID INPUT ENTERED. Try again >> ");
			usersNextMove = input.nextLine().toUpperCase();
		}
		
		return correctUsersMoveSpelling(usersNextMove);

	}
	
	public static String getComputersNextMove() {
		Random randomMoveGenerator = new Random();
		int randomMove = randomMoveGenerator.nextInt(3) + 1;
		
		String computersNextMove = "";
		
		switch(randomMove) {
			case 1:
				computersNextMove = "ROCK";
				break;
			case 2:
				computersNextMove = "PAPER";
				break;
			case 3:
				computersNextMove = "SCISSORS";
				break;
		}
		
		return computersNextMove;
	}
	
	public static int playRockPaperScissors(String usersMove, String computersMove) {
		final int TIE = 0;
		final int COMPUTER_WINNER = 1;
		final int USER_WINNER = 2;
		
		int winner;
		
		if(usersMove.equals("ROCK") && computersMove.equals("SCISSORS")) {
			winner = USER_WINNER;
		}
		else if(usersMove.equals("SCISSORS") && computersMove.equals("PAPER")) {
			winner = USER_WINNER;
		}
		else if(usersMove.equals("PAPER") && computersMove.equals("ROCK")) {
			winner = USER_WINNER;
		}
		else if(computersMove.equals("ROCK") && usersMove.equals("SCISSORS")) {
			winner = COMPUTER_WINNER;
		}
		else if(computersMove.equals("SCISSORS") && usersMove.equals("PAPER")) {
			winner = COMPUTER_WINNER;
		}
		else if(computersMove.equals("PAPER") && usersMove.equals("ROCK")) {
			winner = COMPUTER_WINNER;
		}
		else {
			winner = TIE;
		}
		
		return winner;
		
	}
	
}
