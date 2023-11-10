package Ex04_GRA_SabinoFLA;
import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
                int random;
                int input;
                int result;
                int computerPts = 0;
                int playerPts = 0;
                Move computerMove = null;
                Move playerMove = null;
                
                System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
                System.out.println("1. Start game" + '\n' + "2. Change number of rounds"
                + '\n' + "3. Exit application" + '\n');
                input = sc.nextInt();
                
                while (input != 3) {                
                    if (input == 1) {
                        System.out.println("This match will be first to " + roundsToWin + " wins." + '\n');

                    while ((playerPts < roundsToWin) && (computerPts < roundsToWin)){
                        random = (int) Math.floor(Math.random()*3) + 1;
                        switch (random) {
                            case 1:
                                computerMove = rock;
                                break;
                            case 2:
                                computerMove = paper;
                                break;
                            case 3:
                                computerMove = scissors;
                                break;
                        }

                        System.out.println("The computer has selected its move. Select your move: " + '\n'
                        + "1. Rock" + '\n' + "2. Paper" + '\n' + "3. Scissors" + '\n');
                        input = sc.nextInt();

                        switch (input) {
                            case 1:
                                playerMove = rock;
                                break;
                            case 2:
                                playerMove = paper;
                                break;
                            case 3:
                                playerMove = scissors;
                                break;
                        }

                        result = Move.compareMoves(computerMove, playerMove);

                        System.out.print("Player chooses " + playerMove.getName() + ". Computer chose " +
                                computerMove.getName() + ". " + '\n');

                        switch (result) {
                            case 0:
                                System.out.println("Computer wins round!" + '\n');
                                computerPts++;
                                break;
                            case 1:
                                System.out.println("Player wins round!" + '\n');
                                playerPts++;
                                break;
                            case 2:
                                System.out.println("Round is tied!" + '\n');
                                break;
                        }

                        System.out.println("Player: " + playerPts + " - Computer: " + computerPts + '\n');
                    }

                    if (computerPts == roundsToWin)
                        System.out.println("Computer wins!" + '\n');

                    else
                        System.out.println("Player wins!" + '\n');
                }
                    
                else if (input == 2) {
                    System.out.println("How many wins are needed to win a match?" + '\n');
                    roundsToWin = sc.nextInt();
                    System.out.println(roundsToWin + " rounds are needed to win! This setting is saved." + '\n');
                }
                
                input = 0;
                computerPts = 0;
                playerPts = 0;
                
                
                System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
                System.out.println("1. Start game" + '\n' + "2. Change number of rounds"
                + '\n' + "3. Exit application" + '\n');
                input = sc.nextInt();
            }
                
            System.out.println("Thank you for playing!");
        }
}