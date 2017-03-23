import java.util.Scanner;

public class gameController
{	
	private player player1, player2;
	
	private static Scanner scan = new Scanner(System.in);
	
	public void PlayGame(){
		boolean exitGame = false;
		player1 = new player(inputName("Please enter your name"));
		player2 = new player("Computer");
		int option;
		
		while(!exitGame){
			System.out.println("Rock--Scissors: You vs. the Computer");
			System.out.println("Please enter your choice: ");
			System.out.println("1: Paper (Beats Rock)");
			System.out.println("2: Rock (Beats Scissors)");
			System.out.println("3: Scissors (Beats Paper)");
			System.out.println("4: Random");
			System.out.println("5: View player stats");
			System.out.println("0: Quit");
			
			option = scan.nextInt();
			scan.nextLine();
			
			switch(option){
				case 1:
					player1.createRole("paper");
					break;
				case 2:
					player1.createRole("rock");
					break;
				case 3:
					player1.createRole("scissors");
					break;
				case 4:
					player1.createRole("random");
					break;
				case 5:
					DisplayPlayerStats(player1);
					continue;
				case 0:
					exitGame = true;
					continue;
			}
			
			player2.createRole("random");
			
			role first = player1.getRole();
			role second = player2.getRole();
			
			System.out.println("Player 1 is a " + first.ToString());
			System.out.println("Player 2 is a " + second.ToString());
			
		
			if(first.getType() == second.getType()){
				System.out.println("Same! This round is a draw");
				continue;
			}
			
			if(first.getType() == role.allRole.scissors){
				if(second.getType() == role.allRole.paper){
					System.out.println("You have won this round.");
					player1.won();
				}else{
					System.out.println("Computer has won this round.");
					player1.lose();
				}
			}else if(first.getType() == role.allRole.paper){
				if(second.getType() == role.allRole.rock){
					System.out.println("You have won this round.");
					player1.won();
				}else{
					System.out.println("Computer has won this round.");
					player1.lose();
				}
			}else{
				if(second.getType() == role.allRole.scissors){
					System.out.println("You have won this round.");
					player1.won();
				}else{
					System.out.println("Computer has won this round.");
					player1.lose();
				}
			}
		}
	}

	
	private void DisplayPlayerStats(player currentPlayer){
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Player's name: " + currentPlayer.getName());
		System.out.println("Wins: " + currentPlayer.getWins());
		System.out.println("Losses: " + currentPlayer.getLosses());
		System.out.println("The current character is a " + currentPlayer.getRole().ToString());
		System.out.println("-----------------------------------------------------------------------");
	}
	
	private String inputName(String consoleLine){
		String stringInput = "";
		
		while(stringInput.equals("")){
			System.out.println(consoleLine);
			stringInput = scan.nextLine();
		}
		return stringInput;
	}
	
	
}