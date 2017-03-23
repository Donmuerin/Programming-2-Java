import java.util.Scanner;

public class mainDriver
{
	public static void main(String[] args){
		
		int option;
		Scanner scan = new Scanner(System.in);
						
		do{
			System.out.println("Welcome to Hangman game");
			System.out.println("1: Instructions / How To Play");
			System.out.println("2: Play Game");
			System.out.println("3: Quit");
			
			option = scan.nextInt();
			scan.nextLine();
			
			switch(option){
				case 1:
			 		System.out.println("--------------------------------------------------------");
			 		System.out.println("This is a guessing game for two players. One player ");
			 		System.out.println("thinks of a word, phrase or sentence and the other ");
			 		System.out.println("tries to guess it by suggesting letters or numbers, ");
			 		System.out.println("within a certain number of guesses.");
					System.out.println("--------------------------------------------------------");
					break;
					
			 	case 2:
			 		gameController game = new gameController();
			 		game.PlayGame();
			 		break;
			 	
			}
		}while (option != 3);
		
		scan.close();
	}
	
}