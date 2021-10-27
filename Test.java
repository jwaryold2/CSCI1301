/* 
* StringFun.java 
* Author: Jason Waryold 
* Statement of Academic Honesty: 
*  
* The following code represents my own work. I have neither 
* received nor given inappropriate assistance. I have not copied 
* or modified code from anywhere other than the authorized 
* sources. I recognize that any unauthorized sharing, assistance, 
* or plagiarism will be handled in accordance with both the  
* University of Georgia's Academic Honesty Policy and the  
* policies of this course. I recognize that my work is based on  
* an assignment created by the Department of Computer 
* Science at the University of Georgia. Any publishing or posting 
* of source code at any time for this project is prohibited. 
*/ 
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userString=" ",stringCommand =" ";
		String reverseString="";
		char reverse;
		int userIndexStart;
		System.out.println("Enter the string to be manipulated");
			userString=input.nextLine();
		while(!stringCommand.equalsIgnoreCase("quit")) {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			stringCommand=input.nextLine();
			if(stringCommand.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
					char userReplace = input.next().charAt(0);
					userIndexStart=userString.indexOf(userReplace);
				System.out.println("Enter the new character");
					char userNew=input.next().charAt(0);
					userString=userString.substring(0,userIndexStart)+userNew+userString.substring(userIndexStart+1);
				System.out.println("The new sentence is: "+userString);
			}
			
			if(stringCommand.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace");
					char userReplace = input.next().charAt(0);
					userIndexStart=userString.indexOf(userReplace,2);//finds the second occurence
				System.out.println("Enter the new character");
					char userNew=input.next().charAt(0);
					userString=userString.substring(0,userIndexStart)+userNew+userString.substring(userIndexStart+1);
				System.out.println("The new sentence is: "+userString);
			}
			
			if(stringCommand.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
					char userRemove=input.next().charAt(0);
					String userStringRemoveA=" ";
					
				System.out.print("The new sentence is: "+userStringRemoveA);
			}
			if (stringCommand.equalsIgnoreCase("quit")) {
				System.out.print("...Execution Ends...");
			}
		}
		
	}
}
