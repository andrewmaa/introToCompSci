package two;
/*  
intro to computer science 
feb. 4, 2024
andrew ma
problem 3: vertices of a triangle
*/

// import appropriate classes
import java.util.Scanner; // Scanner for user input
import java.lang.Math; // Math for power and sqrt function

public class problem3 {
	public static void main(String[] args){

		// creating new scanner for taking user input
		Scanner input = new Scanner(System.in);

		// prompting the user to enter each point's x-value and y-value
		System.out.print("Enter first point x-value: ");
		double x1 = input.nextDouble();

		System.out.print("Enter first point y-value: ");
		double y1 = input.nextDouble();

		System.out.print("Enter second point x-value: ");
		double x2 = input.nextDouble();

		System.out.print("Enter second point y-value: ");
		double y2 = input.nextDouble();

		System.out.print("Enter third point x-value: ");
		double x3 = input.nextDouble();

		System.out.print("Enter third point y-value: ");
		double y3 = input.nextDouble();

		// calculating side lengths using distance formula
		double side1 = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
		double side2 = Math.sqrt(Math.pow(x2-x3,2)+ Math.pow(y2-y3,2));
		double side3 = Math.sqrt(Math.pow(x3-x1,2)+ Math.pow(y3-y1,2));

		// finding "s" and using it to compute the area of the triangle
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

		// printing final calculated area
		System.out.println("The area of the triangle is "+area+" units².");



	}
}