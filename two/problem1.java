package two;
/*  
intro to computer science 
feb. 4, 2024
andrew ma
problem 1: distance formula problem
*/

// import appropriate classes
import java.util.Scanner; // Scanner for user input
import java.lang.Math; // Math for power and sqrt functions

public class problem1 {
	public static void main(String[] args){

		// create new Scanner for prompting the user
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

		// calculating and printing the distance between the two points
		System.out.println("The distance between the two points is "+Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2))+" units.");


	}
}