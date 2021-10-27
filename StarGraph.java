/*
 * StarGraph.java
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
import java.lang.Math;
public class StarGraph {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float minXValue=0,xIncrements = 0;
		char star='*';
		System.out.print("Please enter the number of x values to process: ");
			int xvalues=input.nextInt();
			
		float xValList[] = new float[xvalues];//creates a float array named xValList~x value list with the size of xvalues (userinput)
		float yValList[]=new float[xvalues];//creates a float array named yValList~y value list with the size of xvalues(userinput)
		
		if (xvalues<=0) {
				System.out.print("The number of x values must be an integer greater than 0.");
		}else {
			System.out.print("Enter a minimum value of x: ");
				minXValue=input.nextFloat();
			System.out.print("Enter the amount to increment x: ");
				xIncrements=input.nextFloat();
				if (xIncrements <=0) {
					System.out.print("The increment must be a decimal number greater than 0.");
				}else {
					System.out.println("Values");
					for(int i =0; i<xValList.length;i++) {
						float yValues=(float)(20.0*Math.abs(Math.sin(minXValue)));//gets the yValues from the equation provided
						yValList[i]=(int)yValues;//sets the Y values calculated into the yValList array
						System.out.printf("x: %.3f", minXValue);//using %.3f you can print the minXValue to 3 decimal so 1.000
						System.out.printf(", y: %.3f", yValues);//using %.3f you can print the minXValue to 3 decimal so 1.000
						System.out.println(); 
						xValList[i]=minXValue;//sets the xValList[i] equal to the current minXValue so xValList[1]=first minXValue
						minXValue = (float)minXValue + (float)xIncrements;//increases or decreases the minimum x value based on the user entered increments and sets the minXValue = to the old minXValue added to the increments
					}
					System.out.println();
					System.out.println("Graph");
					for(int i=0;i<xValList.length;i++) {//using this for loop you can print the amount of : + new line for the entire length of x values in the xValList array
						System.out.print(":");
						for(int j=0;j<yValList[i];j++) {//using the yValList[i] you can print out stars per line based on the number assigned to the index of the current array so yValList[1] could equal 15 and print out 15 stars
							System.out.print(star);
						}
						System.out.println();
				}
			}
		}
	}
}
