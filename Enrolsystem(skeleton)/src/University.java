/* 
 * Task 4: Adding a University Class
 * 1. Add two new methods, createUnits() and displayUnits(), to University
 * 2. Modify the printStatus() method to display: 
 * 	  the welcome message -> createUnits() -> displayUnits() -> goodbye message.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class University {
	private ArrayList<String> unitNames;
	private String fullUnit2;
	private static Scanner scan = new Scanner(System.in);//ask user input
	
	Unit u1 = new Unit(); //aggregation
	
    public void printStatus() { //use void
        System.out.println("Welcome to Java University");
        createUnits();
        System.out.println(displayUnits());
        System.out.println("Thank you for using Java University");
    }
    public void createUnits() { //use void
    	unitNames = new ArrayList<String>();
    	String number = "";
    	boolean exit = false;
    	
    	while(!exit){
    	System.out.println("Enter the number of units(or Type n to quit): ");
		number = scan.nextLine(); //input string
		
		if (number.isEmpty()){ //if user didn't input anything by default is 3 units (as Tute- Task 4)
			for(int i = 0; i < 3; i++){
			fullUnit2 = u1.getUnitDescription();
			unitNames.add(fullUnit2);
			System.out.println("Total units: " + unitNames.size() +'\n');
			}
		}else if(number.toLowerCase().contains("n")){
			exit = true;
		}else{
			for(int i = 0; i < Double.parseDouble(number); i++){//convert back to number(string -> number)
				fullUnit2 = u1.getUnitDescription();
				unitNames.add(fullUnit2);
				System.out.println("Total units	: " + unitNames.size() +'\n');
				}		
			}
    	}
    	
 
    } 
    public String displayUnits(){ //when you need to return something; TYPE: String
		String getUnits = "Current enrolled units: \n";
		for(int i = 0; i < unitNames.size(); i++){
			getUnits += (i+1) + ". " + unitNames.get(i) + "\n";
		}
		return getUnits;
	}
    
}