import java.util.Scanner;

public class mainDriver{
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		boolean exitSystem = false;
		int option;
						
		while(!exitSystem){
			System.out.println("----------------------------------------------------");
			System.out.println("1: How To Play?");
			System.out.println("2: Play Game");
			System.out.println("3: Quit");
			System.out.println("----------------------------------------------------");
			
			option = scan.nextInt();
			scan.nextLine();
						
			switch(option){
			 	
			 	case 1:
			 		System.out.println("---------------------------------------------------------------------");
					System.out.println("Rock–paper–scissors is a zero-sum hand game usually played ");
					System.out.println("between two people, in which each player simultaneously forms");
					System.out.println("one of three shapes with an outstretched hand. In here, you ");
					System.out.println("will play against a computer simulated opponent. Rock beats ");
					System.out.println("Scissors. Scissors beats Paper. Paper beats Rock\n");
					System.out.println("----------------------------------------------------------------------");
				
			 		break;
			 	case 2:
			 		gameController newGame = new gameController();
			 		newGame.PlayGame();
			 		break;
			 	case 3:
			 		exitSystem = true;
			 		break;
			}
		}
		
		scan.close();
	}
	
}