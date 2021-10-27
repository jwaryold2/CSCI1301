/* 
* GradeCalculator.java 
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
public class GradeCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int exam1Score=0,exam2Score=0;
		double currentScore=0;
		int quizScore=0,participationScore = 0,projectScore=0,labScore=0,finalEScore=0;
		//initilization of all the variables that were thought to be needed beginning the lab some variables may be initialized later on based on when/if they are needed
		System.out.print("Grading Scale:\r\n"
				+ "A 90 - 100\r\n"
				+ "B 80 - 89\r\n"
				+ "C 70 - 79\r\n"
				+ "D 60 - 69\r\n"
				+ "F below 60\r\n");
		System.out.print("What letter grade do you want to achieve for the course? ");
			String letterGrade=input.next(); //gets the next char entered after the print in the line above
				if(!((letterGrade.equalsIgnoreCase("A"))||(letterGrade.equalsIgnoreCase("B"))||(letterGrade.equalsIgnoreCase("C"))||(letterGrade.equalsIgnoreCase("D"))||(letterGrade.equalsIgnoreCase("F")))){
					System.out.print("Invalid Letter Grade input.");
					System.exit(0);
				}
		System.out.println("Enter percentage weights below.");
		int exam1,exam2,finalE,lab,projects,participation,quiz;
		System.out.print("Exam 1:\t");
			exam1=input.nextInt();
		System.out.print("Exam 2:\t");
			exam2=input.nextInt();			
		System.out.print("Final Exam:\t");
			finalE=input.nextInt();
		System.out.print("Labs:\t");	
			lab=input.nextInt();
		System.out.print("Projects:\t");
			projects=input.nextInt();
		System.out.print("Participation:\t");
			participation=input.nextInt();
		System.out.print("Quizzes:\t");
			quiz=input.nextInt();
		int sumPercent= exam1+exam2+finalE+lab+projects+participation+quiz;
		if (sumPercent < 100||sumPercent >100) {
			System.out.print("Weights don't add up to 100, program exiting...");
		}else {
			//the if statement for exam 1 2 and the final is a bit different you need one large if for exam1 while 2 and the final will be nested inside the exam1 if because if you don't know exam one you won't know the other two
		System.out.print("Do you know your exam 1 score?");
			String know = input.next();
		if (know.equalsIgnoreCase("yes")||know.equalsIgnoreCase("Y")) {
			System.out.print("Score received on exam1:");
			 	exam1Score=input.nextInt();
			 System.out.print("Do you know your exam 2 score?");
			 	know = input.next();
			if (know.equalsIgnoreCase("yes")||know.equalsIgnoreCase("Y")) {
				System.out.print("Score received on exam 2:");
				 	exam2Score=input.nextInt();
				 	
			System.out.print("Do you know your final exam score?");
			 		know = input.next();
				if (know.equalsIgnoreCase("yes")||know.equalsIgnoreCase("Y")) {
					System.out.print("Score received on final exam:");
					finalEScore=input.nextInt();
				}else {
					finalE=0;
				}	
			}else {
				exam2=0;
				finalE=0;
			}
		}else {
			//since the user/student doesn't know their scores the percentage values for each is set to zero so they can be used for futureu calculations
			exam1=0;
			exam2=0;
			finalE=0;
		}
		
		System.out.print("Do you know your lab average?");
		 	know = input.next();
		if (know.equalsIgnoreCase("yes")||know.equalsIgnoreCase("Y")) {
			System.out.print("Average lab grade:");
			labScore=input.nextInt();
		}else {
			lab=0;//since the user/student doesn't know their scores the percentage values for each is set to zero so they can be used for futureu calculations

		}
		
		System.out.print("Do you know your project average?");
		 	know = input.next();
		if (know.equalsIgnoreCase("yes")||know.equalsIgnoreCase("Y")) {
			System.out.print("Average project grade:");
			projectScore=input.nextInt();
		}else {
			projects=0;//since the user/student doesn't know their scores the percentage values for each is set to zero so they can be used for futureu calculations
		}
		
		System.out.print("Do you know your participation average?");
		 	know = input.next();
		if (know.equalsIgnoreCase("yes")||know.equalsIgnoreCase("Y")) {
			System.out.print("Average participation grade:");
			 participationScore=input.nextInt();
		}else {
			participation=0;//since the user/student doesn't know their scores the percentage values for each is set to zero so they can be used for futureu calculations
		}
		
		System.out.print("Do you know your quiz average?");
		 	know = input.next();
		if (know.equalsIgnoreCase("yes")||know.equalsIgnoreCase("Y")) {
			System.out.print("Average quiz grade:");
			 quizScore=input.nextInt();
		}else {
			quiz=0;//since the user/student doesn't know their scores the percentage values for each is set to zero so they can be used for futureu calculations
		}
		
		//currentScore=currentScore/(double)currentScoreWeight;
		currentScore = ((double)(exam1*exam1Score)+(double)(exam2*exam2Score)+(double)(quiz*quizScore)+(double)(participation*participationScore)+(double)(lab*labScore)+(double)(finalE*finalEScore)+(double)(projects*projectScore))/(double)(quiz+projects+lab+participation+finalE+exam1+exam2);
		//below is used to round the currentScore to which it would print out to a value with two decimals rather than more than 2
		double currentScoreRound=(double)(Math.round(currentScore*100.0)/100.0);
		System.out.println("Curret grade score: "+currentScoreRound);
		//using currentScore the if statements below then print out a letter grade based on the current score calculated above
		if(currentScore>=90&&currentScore<=100) {
			System.out.println("Your current letter grade:A");
		}
		if(currentScore>=80&&currentScore<90) {
			System.out.println("Your current letter grade:B");
		}
		if(currentScore>=70&&currentScore<80) {
			System.out.println("Your current letter grade:C");
		}
		if(currentScore>=60&&currentScore<70) {
			System.out.println("Your current letter grade:D");
		}
		if(currentScore>=0&&currentScore<60) {
			System.out.println("Your current letter grade:F");
		}
		//sumpercent is rewritten below to show the sum of percentages obtained based on user input so now if the user said no to a score it was recorded as 0 instead of the orignal percentage 
		sumPercent= exam1+exam2+finalE+lab+projects+participation+quiz;
		int finalOverallScore=0;//initializing finalOverallScore for the if statements to overwrite it which can then be used for future steps
		if (letterGrade.equalsIgnoreCase("a")) {
			 finalOverallScore=90;
		}
		if (letterGrade.equalsIgnoreCase("b")) {
			finalOverallScore=80;
		}
		if (letterGrade.equalsIgnoreCase("c")) {
			finalOverallScore=70;
		}
		if (letterGrade.equalsIgnoreCase("d")) {
			finalOverallScore=60;
		}
		//currentScoreTop is used as a variable to hold the numerator of the currentScore equation and then using currentScoreTop in the equation for average to Final Grade
		double currentScoreTop=((double)(exam1*exam1Score)+(double)(exam2*exam2Score)+(double)(quiz*quizScore)+(double)(participation*participationScore)+(double)(lab*labScore)+(double)(finalE*finalEScore)+(double)(projects*projectScore));
		double averageToFinalGrade = ((100*finalOverallScore)-currentScoreTop)/(100-(sumPercent));
		//rounds to two decimal points i.e. 101.12 for example instead of 101.1212421
		double averageToFinalGradeRound=(double)(Math.round(averageToFinalGrade*100.0)/100.0);
		if(averageToFinalGrade <=100&&averageToFinalGrade>0) {
			System.out.print("In order to receive a grade of "+letterGrade+",you need to score an average greater than or equal to "+averageToFinalGradeRound+" in the rest of the grade items.");
		}else if (averageToFinalGrade >100) {
			System.out.print("Unfortunately, a grade of "+letterGrade+" is not possible.");
		}
		else if (averageToFinalGrade<0) {
			System.out.print("Congratulations! You receieved the "+letterGrade+" you wanted!");
		}else {
			System.out.print("You will receive at least a grade of "+letterGrade+".");
		}
		}
	}

}