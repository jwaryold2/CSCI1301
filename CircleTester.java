/*
 * CircleTester.java
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
//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
import java.lang.Math;
public class CircleTester{
	public static final double THRESHOLD = 0.000000001;
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		System.out.println(circle1);
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println(circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Circle1 Diameter: "+circle1.diameter());
		System.out.println("Circle1 Area: "+circle1.area());
		System.out.println("Circle1 Perimeter: "+circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Circle2 Diameter: "+circle2.diameter());
		System.out.println("Circle2 Area: "+circle2.area());
		System.out.println("Circle2 Perimeter: "+circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle1 is a unit circle: "+circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle2 is a unit circle: "+circle2.isUnitCircle());
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		//b
		if(circle1.distance(circle2)<0)//checks the distance method to make sure the output of distance is positive otherwise it would fail to get distance
			System.out.println("FAILED: Get distance");
		else if(circle2.distance(circle1)<0)
			System.out.println("FAILED: Get distance");
		else 
			System.out.println("PASSED: Get distance");
		//a
		if ((circle1.getRadius()<0)||(circle2.getRadius()<0))
			System.out.println("FAILED: Get equals");
		else
			System.out.println("PASSED: Get equals");
		//c
		if((circle1.diameter()<0)||(circle2.diameter()<0))
			System.out.println("FAILED: Get isSmaller");
		else
			System.out.println("PASSED: Get isSmaller");
		//d
		if ((circle1.compareTo(circle2)!=1)||(circle1.compareTo(circle2)!=-1)||(circle1.compareTo(circle2)!=0))
			System.out.println("FAILED: Get compareTo");
		else if ((circle2.compareTo(circle1)!=1)||(circle2.compareTo(circle1)!=-1)||(circle2.compareTo(circle1)!=0))
			System.out.println("FAILED: Get compareTo");
		else
			System.out.println("PASSED: Get compareTo");
		//e
		
		
		
	}	
}

