/* 
* ParseTheTweet.java 
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
public class ParseTheTweet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String tweet=" ";
		System.out.println("Enter a tweet below");
		tweet = input.nextLine();
		String type=" ";
		String detail=" ";
		String location=" ";
		String latitude=" ";
		String longitude=" ";
		int typeIndex,typeEnding,detIndex,detEnding,locatIndex,locatEnding,latIndex,latEnding,longIndex,longEnding;
	
		//Below is String parsing + trimming + index
		typeIndex=tweet.indexOf('#');
		typeEnding=tweet.indexOf(';');
		type=tweet.substring(typeIndex+5,typeEnding);
		String typeTrim=type.trim();
		
		String detailTweet=tweet.substring(typeEnding+1,tweet.length());
		//Edits tweet so it removes the "type value;" and keeps the rest
		detIndex=detailTweet.indexOf('#');
		detEnding=detailTweet.indexOf(';');
		detail=detailTweet.substring(detIndex+5,detEnding);
		String detailTrim=detail.trim();
		
		String localTweet=detailTweet.substring(detEnding+1,detailTweet.length());
		//Edits tweet so it removes the "#det value;"and keeps the rest
		locatIndex=localTweet.indexOf('#');
		locatEnding=localTweet.indexOf(';');
		location=localTweet.substring(locatIndex+5,locatEnding);
		String locationTrim=location.trim();
		
		String latitudeTweet=localTweet.substring(locatEnding+1,localTweet.length());
		//Edits tweet so it removes the "#loc value;"and keeps the rest
		latIndex=latitudeTweet.indexOf('#');
		latEnding=latitudeTweet.indexOf(';');
		latitude=latitudeTweet.substring(latIndex+5,latEnding);
		String latTrim=latitude.trim();
		
		String longitudeTweet=latitudeTweet.substring(latEnding+1,latitudeTweet.length());
		longIndex=longitudeTweet.indexOf('#');
		longEnding=longitudeTweet.indexOf(';');
		longitude=longitudeTweet.substring(longIndex+5,longEnding);
		String longTrim=longitude.trim();

		//Bellow is Print + String values from Tweet
		System.out.println("\nType:\t\t "+typeTrim.toUpperCase());
		System.out.println("Detail:\t\t "+detailTrim.replace(',', '-'));
		System.out.println("Location:\t "+locationTrim.replace(',','-'));
		System.out.println("Latitude:\t "+latTrim);
		System.out.println("Longitude:\t "+longTrim);
				
	}
	
}
