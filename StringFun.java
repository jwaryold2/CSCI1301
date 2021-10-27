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
public class StringFun {
	//invalid numbers, more than one number and empty string
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    String inputString="",inputCommand="";
    int contain=0;
    
    String reverse="",replace="",remove="",removeAll="";
    System.out.println("Enter the string to be manipulated");
        inputString=input.nextLine();
    if(inputString.trim().length()==0) {
        System.out.println("You entered an invalid string.");
        System.out.println("Enter the string to be manipulated");
        inputString=input.nextLine();
    }
    if(inputString.trim().length()>0) {//using trim you can check and see if the length of the input is >0 because if it is 0 that means the input was only empty space
	    while(!inputCommand.equalsIgnoreCase("quit")){//if inputCommand = quit the while loop would exit
	        System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit");
	            inputCommand=input.nextLine();
	           //replace first 
	            if (inputCommand.equalsIgnoreCase("replace first")){
	                System.out.println("Enter the character to replace");
	                char userReplace = input.next().charAt(0);
	                
	                System.out.println("Enter the new character");
	                char userNew=input.next().charAt(0);
	                for(int i=0;i<inputString.length();i++) {
	                	if(userReplace==inputString.charAt(i)) {//checks to see if the inputString contains the old char and if it does it will run the if statement
	                		replace=inputString.substring(0,i)+userNew;//gets the string up until the first appearance of the char want to replace and adding the new wanted char
	                		replace=replace+inputString.substring(i+1);//gets the rest of the inputString skipping the old char
	                		inputString=replace;//overwrites inputString so it now is the replace string and has the first value replaced
	                		contain=1;//sets condition for later statement for if contain=1 the letter was found and replaced printing new result
	                		i=inputString.length()+1;//makes it so once it replaces the first apperance of userReplace i is set to inputString.length()+1 causing the for loop to end;
	                	}
	                }
	                if(contain==1) {//if the inputString contained the old char and successfully replaced it, it would result in contain = 1 causing this if statment to run and printing out the new replaced string
	                System.out.println("The new sentence is: "+inputString);
		            }else {
		            	System.out.println("The letter was not found in the word");
		            }
	            }
	            //replace last
	            if (inputCommand.equalsIgnoreCase("replace last")){
	            	 System.out.println("Enter the character to replace");
	                 char userReplace = input.next().charAt(0);
	                 System.out.println("Enter the new character");
	                 char userNew=input.next().charAt(0);
	                 for(int i=inputString.length()-1;i>0;i--) {
	                 	if(userReplace==inputString.charAt(i)) {
	                 		replace=inputString.substring(0,i)+userNew;
	                 		replace=replace+inputString.substring(i+1,inputString.length());
	                 		inputString=replace;
	                 		contain=1;
	                 		i=0;//sets i=0 so the for loop would end once it successfully replaces the last occurence of the old char userReplace
	                 	}
	                 }
	                 if(contain==1) {//if contain =1 that means it was successful at finding the letter otherwise it would give an error
	                 System.out.println("The new sentence is: "+inputString);
	 	            }else {
	 	            	System.out.println("The letter was not found in the word");
	 	            }
	            }
	            //remove all
	            if (inputCommand.equalsIgnoreCase("remove all")){
		            System.out.println("Enter the character to remove");
	            		char userRemove=input.nextLine().charAt(0);
	            		contain=0;
	            	for(int i=inputString.length()-1;i>=0;i--) {//by going backwards you can remove each character until you hit the first character
	            		if(userRemove==inputString.charAt(i)) {
	                 		removeAll=inputString.substring(0,i);
	                 		removeAll=removeAll+inputString.substring(i+1);
	                 		inputString=removeAll;
	                 		contain=1;
	                 		//i=0;//sets i=0 so the for loop would end once it successfully replaces the last occurence of the old char userReplace
	                 	}
	            	}
	            	if(contain==1) {//if the inputString contained the old char and successfully replaced it, it would result in contain = 1 causing this if statment to run and printing out the new replaced string
	            		System.out.println("The new sentence is: "+inputString);
	                	
		            }else{
		            	System.out.println("Error: the letter you are trying to remove does not exist");
		            } 

	            }
	            //reverse
	            if (inputCommand.equalsIgnoreCase("reverse")){
	            	String reversed="";
	        		for(int i = inputString.length()-1;i>=0;i--) {
	        			reversed=reversed+inputString.charAt(i);
	        		}
	        		inputString=reversed;
	        		System.out.println("The new sentence is: "+reversed);
	                  //inputString=reversed(inputString);//setting the user String equal to the newly reversed string allows for it to be reversed back to the original through another reverse command
	            }
	            //remove
	            if(inputCommand.equalsIgnoreCase("remove")) {
	            	System.out.println("Enter the character to remove");
	            		char userRemove=input.next().charAt(0);
	            	System.out.println("Enter the "+userRemove+" you would like to remove (Not the index-1=1st, 2=2nd, etc.):");
	            		int charRemoveSpace = input.nextInt();
	            		int check=0;
	            		
	            	for(int i=0;i<inputString.length();i++) {
	            		if(userRemove==inputString.charAt(i)) {
	            		check=check+1;
	            		if(check == charRemoveSpace) {
	            			remove=remove+inputString.substring(0,i);
	            			remove+=inputString.substring(i+1);
	            			inputString=remove;
	            			contain=1;
	            			}
	            		}
	                }
	            	if(contain==1) {//if the inputString contained the old char and successfully replaced it, it would result in contain = 1 causing this if statment to run and printing out the new replaced string
	            		System.out.println("The new sentence is: "+inputString);
	                	
		            }else{
		            	System.out.println("Error: the letter you are trying to remove does not exist");
		            } 
	            }
	            }
	        if(inputCommand.equalsIgnoreCase("quit")){
	            System.out.println("...Execution Ends...");
	        }
	    }
    }
    }