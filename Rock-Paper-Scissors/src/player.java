import java.util.Random;

public class player {
	private String playerName;
	private role currentRole;
	private int wins;
	private int losses;
	
	public player(String name){
		wins = 0;
		losses = 0;
		createRole("random");
		
		playerName = name;
	}
	public void createRole(String roleName){
		
		switch(roleName){
			case "paper":
				currentRole = new rolePaper();
				break;
			case "rock":
				currentRole = new roleRock();
				break;
			case "scissors":
				currentRole = new roleScissors();
				break;
			case "random":
				Random randomno = new Random();
				int a = randomno.nextInt(3);
				if (a == 0)
					currentRole = new roleRock();
				else if (a == 1)
					currentRole = new rolePaper();
				else
					currentRole = new roleScissors();	
		}
		
	}
	public String getName() { 
		return playerName; 
	}
	
	public int getWins() { 
		return wins; 
	}
	
	public int getLosses() { 
		return losses; 
	}
	
	public role getRole() { 
		return currentRole; 
	}
	
	
	public void won(){
		wins++;
	}	
	
	public void lose(){
		losses++;
	}
}