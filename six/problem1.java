/*  
intro to computer science 
feb. 28, 2024
andrew ma
problem 1: occurrence of numbers
*/

// import modules
import java.util.Scanner; // Scanner for user input

public class problem1 {
	public static void main(String[] args) {

		// create scanner for input
		Scanner input = new Scanner(System.in);

		// create array with 100 possible different integers
		int[] values = new int[100];

		// set first integer to be checked through loop
		int value = 1;

		// asks for integers
		System.out.println("Enter integers between 1 and 100 (enter 0 to stop): ");
		
		// if 0 is entered, stop asking for numbers
		while (true) {
			value = input.nextInt();
			if (value == 0) {
				break;
			}

			// add 1 (for 1 occurrence) to the integer's 
			// associated numbered item in the array
			values[value] = values[value] + 1;

		}

		// for every value in the array that is NOT 0, 
		// print the position in the array (which would be the integer) 
		// and the number at that position (the # of occurrence) 
		for (int i = 0; i <= 100; i++) {
			if (values[i] != 0) {
				if (values[i] > 1) {
					System.out.println(i+" occurs "+values[i]+ " times");
				}
				else {
					System.out.println(i+" occurs "+values[i]+ " time");
				}
			}
		}
	}
}