/*  
intro to computer science 
feb. 28, 2024
andrew ma
problem 2: print distinct numbers
*/

// import modules
import java.util.Scanner; // Scanner for reading input

public class problem2 {
	public static void main(String[] args) {

		// create scanner for input
		Scanner input = new Scanner(System.in);

		// create array for 10 possible distinct numbers
		int[] numbers = new int[10];

		// prompt for user to enter ten numbers
		System.out.print("Enter ten numbers: ");

		// creating variables to count numbers and compare
		int numcount = 0;
		int i = 0, j;

		// while loop to allow for the input of only 10 numbers
		while (numcount < 10) {

			// saving the input as a variable
			int num = input.nextInt();
			numcount++;

			// if the number exists in the array already, break out of while loop
			for (j = 0; j <= i; j++){
				if (num == numbers[j]) {
					break;
				}	
			}

			// if the number does not exist in the array, 
			// place it in the next available index position in the array
			if (j-i == 1) {
				numbers[i] = num;
				i++;
			}
		}

		// count number of distinct numbers
		int count = 0;
		int k = 0;

		do {
			if (numbers[k] != 0) {
				count += 1;
			}
			k++;
		}
		while (k < 10);

		// print number of distinct numbers
		System.out.println("The number of distinct numbers is "+ count);

		// list out all distinct numbers
		System.out.print("The distinct numbers are: ");
		for (k = 0; k < 10; k++) {
			if (numbers[k] != 0) {
				System.out.print(numbers[k] + " ");

				// add line break if reached last distinct number in array
				if (numbers[k] == 0) {
				System.out.println();
				}
			}	
		}
	}
}

