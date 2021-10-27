/* 
* NetPay.java 
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
public class NetPay {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int hourPerWeek;
	//Variables below are the decimal values of the percentages of taxes
	double federalTaxPercent=.1,stateTaxPercent=.045,socialSecurityPercent=.062,medicarePercent=.0145;
	double grossPay,netPay;
	double payPH =7.25;
	
	System.out.print("Hours per Week:\t ");
	hourPerWeek = input.nextInt();
	grossPay=(double)hourPerWeek*payPH;
	System.out.println("Gross Pay:\t "+(grossPay));	
	netPay=grossPay-((grossPay*federalTaxPercent)+(grossPay*stateTaxPercent)+(grossPay*socialSecurityPercent)+(grossPay*medicarePercent));
	System.out.println("Net Pay:\t "+netPay);
	
	System.out.println();	
	
	System.out.println("Deductions");
	System.out.println("Federal:\t "+((float)(grossPay*federalTaxPercent)));
	System.out.println("State:\t\t "+((float)(grossPay*stateTaxPercent)));
	System.out.println("Social Security: "+((float)(grossPay*socialSecurityPercent)));
	System.out.println("Medicare:\t "+((float)(grossPay*medicarePercent)));
	}

}
