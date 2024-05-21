/*  
intro to computer science 
feb. 7, 2024
andrew ma
problem 1: the discriminant
*/

// import appropriate classes
import java.util.Scanner; // Scanner for user input
import java.lang.Math; // Math for sqrt and power function

public class problem1 {
	public static void main(String[] args){

		// create new Scanner for prompting the user
		Scanner input = new Scanner(System.in);

		// prompting the user for a, b, and c values
		System.out.print("Enter a-value: ");
		int aVal = input.nextInt();

		System.out.print("Enter b-value: ");
		int bVal = input.nextInt();

		System.out.print("Enter c-value: ");
		int cVal = input.nextInt();

		// computing the answer as a double using the discriminant formula
		double answer = Math.pow(bVal, 2)-4*aVal*cVal;

		// using if-elseif-else statement structure to print out number of roots

		// case 1: if the result is positive
		if (answer > 0) {
			System.out.println("The equation has two roots.");
		}

		// case 2: if the result is 0
		else if (answer == 0) {
			System.out.println("The equation has one root.");
		}

		// case 3: if the result is negative
		else {
			System.out.println("The equation has no real roots.");
		}
	}
}