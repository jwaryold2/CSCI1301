/* 
* RockPaperScissors.java 
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
public class RockPaperScissors {
	/**
	 * This class gives you the computer's move in Rock, Paper, Scissors.
	 */
	public class ComputerOpponent {

	    private static boolean TESTING_MODE = false;
	    private static int cycler = 0;

	    public static String getMove() {
	        if (TESTING_MODE) {
	            switch (cycler++ % 3) {
	                case 0:
	                    return "rock";
	                case 1:
	                    return "paper";
	                default: // (case 2)
	                    return "scissors";
	            }
	        }

	        else {
	            switch ((int) (Math.random() * 3)) {
	                case 0:
	                    return "rock";
	                case 1:
	                    return "paper";
	                default: // (case 2)
	                    return "scissors";
	            }
	        }
	    }
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int computerP=0,userP=0,counter=0;
		String computerMove = ComputerOpponent.getMove(); //call getMove method and returns the computers move that willl be rock/paper/scissors
		System.out.print("Points to win: ");
		int points = input.nextInt();
		for(int i=0;i<points;) {
			System.out.print("Rock, paper, or scissors? ");
			String userMove = input.next();//tried using nextLine(); was printing it twice 
			computerMove=ComputerOpponent.getMove();
			//all the if options when the user picks rock
			if(userMove.equalsIgnoreCase("rock")&&computerMove.equals("scissors")) {
				userP++;
				System.out.println("The computer chose scissors, so you win!   ("+userP+"-"+computerP+")");
			}else if (userMove.equalsIgnoreCase("rock")&&computerMove.equals("paper")) {
				computerP++;
				System.out.println("The computer chose paper, so you lose.   ("+userP+"-"+computerP+")");
			}else if ((userMove.equalsIgnoreCase("rock")&&computerMove.equals("rock"))){
				System.out.println("The computer chose rock, so it's a tie.   ("+userP+"-"+computerP+")");
			}
			//all the if options when the user picks paper
			if(userMove.equalsIgnoreCase("paper")&&computerMove.equals("scissors")) {
				computerP++;
				System.out.println("The computer chose scissors, so you lose.   ("+userP+"-"+computerP+")");
			}else if(userMove.equalsIgnoreCase("paper")&&computerMove.equals("rock")) {
				userP++;
				System.out.println("The computer chose rock, so you win!   ("+userP+"-"+computerP+")");
			}else if ((userMove.equalsIgnoreCase("paper")&&computerMove.equals("paper"))){
				System.out.println("The computer chose paper, so it's a tie.   ("+userP+"-"+computerP+")");
			}
			//all the if options when the user picks scissors 
			if((userMove.equalsIgnoreCase("scissors")&&computerMove.equals("rock"))) {
				computerP++;
				System.out.println("The computer chose rock, so you lose.   ("+userP+"-"+computerP+")");
			}else if ((userMove.equalsIgnoreCase("scissors")&&computerMove.equals("paper"))) {
				userP++;
				System.out.println("The computer chose paper, so you win!   ("+userP+"-"+computerP+")");
			}else if ((userMove.equalsIgnoreCase("scissors")&&computerMove.equals("scissors"))){
				System.out.println("The computer chose scissor, so it's a tie.   ("+userP+"-"+computerP+")");
			}
			// takes in userP and computerP and will print out a statement when either reach the target points to win
			if (userP==points) {
				System.out.print("Congratulations! You won!");
				i=points;//having this line results in the exiting of the the for loop when the condition userP == points because the loops runs for when i<points but when i=points it exits
				//System.exit(0);
			}else if (computerP==points) {
				System.out.print("Sorry, you lost. Better luck next time!");
				i=points;//having this line results in the exiting of the the for loop when the condition computerP == points because the loops runs for when i<points but when i=points it exits
				//System.exit(0);
			}	
		}			
	}
}
