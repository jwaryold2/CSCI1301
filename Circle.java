/*
 * Circle.java
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
// Circle.java
//
// 
//*******************************************************
import java.lang.Math;
public class Circle {
	
	private String name= " ";       // declare the private String instance  name
	private double radius=0.0;       // declare the private double instance  radius
	private double x=0.0;      // declare the private double instance  x
	private double y=0.0;       // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		return name;
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		
		return x;
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		
		return y;
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		return radius;
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String name) {
		
		this.name=name;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
		
		this.x=x;	
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		
		this.y=y;	
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		if(radius>0.0)
		this.radius=radius;
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		double area = Math.PI*radius*radius;
		return area;
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		double perimeter = 2*Math.PI*radius;
		return perimeter;	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		double diameter = 2*radius;
		return diameter;	
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		boolean isUnitCircle = false;
		if(radius==1) {
			if(x==0.0) {
				if(y==0.0) {
					isUnitCircle=true;
				}
			}
		}
		
		return isUnitCircle;
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		String toString = " ";
		
		String name1="name: "+name;
		String center = "center: ("+x+","+y+")";
		String radius1="radius: "+radius;
		toString=name1+"\n"+center+"\n"+radius1;
		
		
		return toString;	
	}
	public boolean equals(Circle anotherCircle) {
		boolean equals=false;
		
		if((Math.abs(this.radius-anotherCircle.radius)<THRESHOLD)&&(Math.abs(this.x-anotherCircle.x)<THRESHOLD)&&(Math.abs(this.y-anotherCircle.y)<THRESHOLD)){
			equals=true;
		}
		
		return equals;
	}
	public double distance(Circle anotherCircle) {
		double distance=0.0;
		double xDistance= this.getX()-anotherCircle.x;
		xDistance=Math.pow(xDistance, 2);
		double yDistance=this.getY()-anotherCircle.y;
		yDistance=Math.pow(yDistance,2);
		distance=Math.sqrt(xDistance+yDistance);
		
		return distance;
	}
	public boolean isSmaller(Circle anotherCircle) {
		boolean isSmaller=false;
		if(this.diameter()<anotherCircle.diameter()) {
			isSmaller=true;
		}
		return isSmaller;
	}
	public boolean intersects(Circle anotherCircle) {
		boolean intersects=false;
		if (this.distance(anotherCircle) <(this.radius+anotherCircle.radius)) {
		intersects=true;	
		}
		return intersects;
	}
	public int compareTo(Circle anotherCircle) {
		int compareTo=0;
		if(this.radius>anotherCircle.radius) {
			compareTo=1;
		}else if(this.radius<anotherCircle.radius) {
			compareTo=-1;
		}else {
			compareTo=0;
		}
		return compareTo;
	}
}
