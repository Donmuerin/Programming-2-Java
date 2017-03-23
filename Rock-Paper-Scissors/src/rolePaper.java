public class rolePaper extends role{
	
	public rolePaper(){
		theType = allRole.paper;
	}
			
	
	@Override
	public String ToString(){
		String tempString = "paper\n";
		tempString += " -----\n";
		tempString +="|    |\n";
		tempString +=" -----\n";
		
		return tempString;
	}
}