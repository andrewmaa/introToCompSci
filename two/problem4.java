package two;
/*  
intro to computer science 
feb. 4, 2024
andrew ma
problem 4: future investment value
*/

// import appropriate classes
import java.util.Scanner; // Scanner for user input
import java.lang.Math; // Math for power function

public class problem4 {
	public static void main(String[] args){

		// creating new scanner for taking user input
		Scanner input = new Scanner(System.in);

		// prompting the user for the initial investment amount,
		// the annual interest rate, and the number of years
		System.out.print("Enter the investment amount: ");
		double amount = input.nextDouble();

		// convert percent into decimal
		System.out.print("Enter the annual interest rate: ");
		double rate = input.nextDouble()/100;

		System.out.print("Enter the number of years:");
		int numYears = input.nextInt();

		// calculate and print future investment value using the formula
		double futureVal = amount*Math.pow(1+(rate/12),numYears*12);
		System.out.println("The future investment value is "+ futureVal);

	}
}