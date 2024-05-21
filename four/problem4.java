/*  
intro to computer science 
feb. 19, 2024
andrew ma
problem 4: perfect numbers
*/


// import appropriate classes
import java.util.Scanner; // Scanner for user input
import java.lang.Math; // Math for floor division

public class problem4 {
	public static void main(String[] args) {

		// create variable storing binary result
		String bi = "";

		// create input variable
		Scanner input = new Scanner(System.in);

		// prompt user for decimal integer
		System.out.print("Enter decimal integer: ");
		int num = input.nextInt();

		// converts inputted integer to binary by checking remainder after division by 2
		// and repeating the process if number is > 0 
		while (num > 0){
			if (num % 2 != 0) {
				bi = "1" + bi;
			}
			else {
				bi = "0" + bi;
			}
			num = Math.floorDiv(num,2);
		}

		// print final binary result
		System.out.println(bi);
	}
}