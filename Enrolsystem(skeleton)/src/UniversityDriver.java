/* 
 * Task 2: Create a new UniversityDriver class
 * 1. Contain only a main method that creates a University object
 * 2. Calls its printStatus method
 */

public class UniversityDriver {
	public static void main(String[] args){ //main
		University uni = new University();//composition relationship
		uni.printStatus();
		
	}
}
