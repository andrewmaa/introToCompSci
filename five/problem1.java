/*  
intro to computer science 
feb. 25, 2024
andrew ma
problem 1: palindrome integer
*/

// import modules
import java.util.Scanner; // Scanner for user input

public class problem1 {

	// creating method to reverse a number
	// returns an integer
	public static int reverse (int number) {
		int reversed = 0;
		while (number != 0) {
			int digit = number % 10;
		    reversed = reversed * 10 + digit;

		     // remove the last digit from num
		    number /= 10;
		}
		return reversed;
	}

	// creating method to identify if number is palindrome
	// returns a boolean (true/false)
	public static boolean isPalindrome (int number) {
		if (reverse(number) == number){
			return true;
		}
		else {
			return false;
		}
	}

	// main method
	public static void main(String[] args) {

		// create Scanner to prompt user
		Scanner input = new Scanner(System.in);

		// prompts user for integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		// checks if the inputted number is a palindrome using the methods created earlier
		// and prints whether it is based on the boolean result
		if (isPalindrome(number)) {
			System.out.println("The integer "+ number+" is a palindrome.");
		}
		else {
			System.out.println("The integer "+ number+" is not a palindrome.");
		}

	}
}

