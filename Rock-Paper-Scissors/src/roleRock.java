public class roleRock extends role{
	
	public roleRock(){
		theType = allRole.rock;
	}
	
	
	@Override
	public String ToString(){
		String tempString = "rock\n";
		tempString += " 0000\n";
		tempString +="000000\n";
		tempString +=" 0000\n";
		
		return tempString;
	}
}