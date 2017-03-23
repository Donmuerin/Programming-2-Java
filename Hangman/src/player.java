public class player
{
	public enum gamePlayers { firstPlayer, secondPlayer, NONE }
	private gamePlayers current;
	
	private String currentName;
	private int wins;
	private int losses;
	
	public player(String name){
		current = gamePlayers.NONE;
		currentName = name;
		wins = 0;
		losses = 0;
	}
	
	public String getName(){
		return currentName;
	}
	
	public void addWin(){ 
		wins++; 
	}
	
	public int getWins(){
		return wins;
	}
	
	public void addLoss(){ 
		losses++; 
	}
	
	public int getLosses(){
		return losses;
	}
	
	public gamePlayers getRole(){
		return current;
	}
	
	public void setRole(gamePlayers newRole){
		current = newRole;
	}
	
}