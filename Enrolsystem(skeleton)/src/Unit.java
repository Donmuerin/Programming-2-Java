/* 
 * Task 3: Adding a Unit Class
 * 1. Each Unit object must know its unit code
 * 2. The Unit class should also have a getUnitDescription() method, 
 * 	  that RETURNS a string of the concatenated unit code and name
 */

import java.util.Scanner;

public class Unit {
	private String code, name, fullUnit;
	private static Scanner scan = new Scanner(System.in);//ask user input
	
	public String getUnitDescription() {
		
		
		System.out.println("Enter unit code: ");
		code = scan.nextLine(); //input string
		
		System.out.println("Enter unit name: ");
		name = scan.nextLine(); //input string
		fullUnit = (code + " " + name);
		System.out.println("Unit Description: " + fullUnit); //concatenate
		
		return fullUnit;
    }
}
