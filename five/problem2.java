/*  
intro to computer science 
feb. 25, 2024
andrew ma
problem 2: triangle validity and area
*/

// import modules
import java.util.Scanner; // Scanner for user input
import java.lang.Math; // Math for sqrt function

public class problem2 {

	// creating method for determining if a triangle can be made from the three sides
	public static boolean isValid(double side1, double side2, double side3) {
		if ((side1+side2 < side3) || (side1+side3 < side2) || (side2+side3 < side1)){
			return false;
		}
		else {
			return true;
		}
	}

	// creating method 
	public static double area (double side1, double side2, double side3) {
		
		// taken from H2P3
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

		return area;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompts user for three sides
		System.out.print("Enter first side: ");
		double side1 = input.nextDouble();

		System.out.print("Enter second side: ");
		double side2 = input.nextDouble();

		System.out.print("Enter third side: ");
		double side3 = input.nextDouble();

		// calculates and prints area if sides make up a valid triangle
		if (isValid(side1, side2, side3)) {
			System.out.println("The area of the triangle is "+ area(side1, side2, side3) + " units²");
		}
		else {
			System.out.println("Not a valid triangle, try again");
		}
	}
}