public class roleScissors extends role{
	
	public roleScissors(){
		theType = allRole.scissors;
	}
			
	
	@Override
	public String ToString(){
		String tempString = "scissors\n";
		tempString += "O O\n";
		tempString +=" x\n";
		tempString +="/ |\n";
		
		
		return tempString;
	}
}