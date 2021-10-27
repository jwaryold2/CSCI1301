/* 
* ClassifyMessage.java 
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
public class ClassifyMessage {
	enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String catString =" ";
		String payLoad = " ";
		double latitude;
		double longitude;
		boolean isInRange=false;
		MessageCategory category;
		//Predecaled variables of georgraphic boundaries
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		System.out.println("Please enter a formatted message: ");
		catString = input.next();
		latitude = input.nextDouble();
		longitude = input.nextDouble();
		payLoad = input.nextLine();
		//trimming any extra spaces in the catString and payLoad
		catString=catString.trim();
		payLoad=payLoad.trim();
		//use IgnoreCase to avoid errors when getting Fire instead of fire!!
		if (catString.equalsIgnoreCase("fire")||catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}else if (catString.equalsIgnoreCase("structure")||catString.equalsIgnoreCase("road")||catString.equalsIgnoreCase("photo")||catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}else {
			category = MessageCategory.UNKNOWN;
		}
		// using a nested if statement I can save some extra lines of code to get the same result
		if (latitude>=south&&latitude<=north) {
			if(longitude>=west&&longitude<=east) {
				isInRange = true;
			}else {
				isInRange=false;
			}
		}
		//Prints out the values needed to show back to the user after obtaining the data and manipulating it to its final form which is then printed
		System.out.println("Category:\t"+category);
		System.out.println("Raw Cat:\t"+catString);
		System.out.println("Message:\t"+payLoad);
		System.out.println("Latitude:\t"+latitude);
		System.out.println("Longitude:\t"+longitude);
		System.out.println("In Range:\t"+isInRange);
	}
}
