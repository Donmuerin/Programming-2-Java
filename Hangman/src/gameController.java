import java.util.Scanner;

public class gameController
{
	private player player1, player2;
	
	private static int tries = 10;
	private int currentWrong;
	
	private word theWord;
	private static Scanner scan = new Scanner(System.in);
	
	private String GetPlayerInput(String consoleLine)
	{
		String stringInput = "";
		
		while(stringInput.equals(""))
		{
			System.out.println(consoleLine);
			stringInput = scan.nextLine();
		}
		return stringInput;
	}
	
	public void PlayGame(){
		boolean exitGame = false;
		currentWrong = 0;
		player1 = new player(GetPlayerInput("PLAYER1 \nPlease enter your name: "));
		player1.setRole(player.gamePlayers.firstPlayer);
		
		player2 = new player(GetPlayerInput("PLAYER1 \nPlease enter your name: "));
		player2.setRole(player.gamePlayers.secondPlayer);
		
		System.out.println(player1.getName() + " is going to guess the word");
		
		while(!exitGame){
			
			player guesser; //public enum
			boolean guesserWon = false;
			
			if(player1.getRole() == player.gamePlayers.secondPlayer){
				theWord = new word((GetPlayerInput(player1.getName() + " please enter a word to guess")).toLowerCase());
				guesser = player2;
			}
			else{
				theWord = new word((GetPlayerInput(player2.getName() + " please enter a word to guess")).toLowerCase());
				guesser = player1;
			}
			
			while(currentWrong < tries && guesserWon == false){
				System.out.println("--------------------------------------------------------");
				System.out.println("Guesser: " + guesser.getName());
				System.out.println("Clue: " + theWord.getClue());
				System.out.println("Previous Guesses: " + theWord.displayAll());
				System.out.println("Incorrect Guesses: " + currentWrong + "/" + tries);
				System.out.println("--------------------------------------------------------");
				
				String currentGuess = ((GetPlayerInput("Please guess an alphabet: ")).toLowerCase());
				//convert to Char from String
				char charWord = currentGuess.charAt(0);
				
				if(theWord.checkCorrect(charWord) == false)
				{
					currentWrong++;
				}
				guesserWon = theWord.allCorrect();
			}
			
			if(guesserWon){
				guesser.addWin();
				System.out.println("Congratulations! You won!");
				
			}else{
				guesser.addLoss();
				System.out.println("Sorry! You lose!");
			}
			
			System.out.println("The word was " + theWord.getWord());
			System.out.println("YOUR GAME REPORT: \n" + guesser.getWins() + " wins and " + guesser.getLosses() + " losses");
			
			String playAgain = (GetPlayerInput("Do you wanna play again? To return to menu press 'N'")).toLowerCase();
			
			if(playAgain.contains("n")){
				exitGame = true;
				
			//continue playing
			}else{
				currentWrong = 0;
				if(guesser == player1){
					//swap
					player2.setRole(player.gamePlayers.firstPlayer);
					player1.setRole(player.gamePlayers.secondPlayer);
					System.out.println(player2.getName() + " turns!");
				}
				else{
					player1.setRole(player.gamePlayers.firstPlayer);
					player2.setRole(player.gamePlayers.secondPlayer);
					System.out.println(player1.getName() + " turns!");
					
				}
			}
		}
	}
	
	
}