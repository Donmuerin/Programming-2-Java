public abstract class role
{
	public enum allRole {paper, rock, scissors, invalid}
	protected String theName;
	protected allRole theType;
	
	public role(){
		theName = "Mr Example";
		theType = allRole.invalid;
	}
	
	public abstract String ToString();
	
	public String getName() { 
		return theName; 
	}
	
	public void setName(String newName) { 
		theName = newName; 
	}
	
	public allRole getType() { 
		return theType; 
	}
	
}