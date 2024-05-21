/*  
intro to computer science 
feb. 19, 2024
andrew ma
problem 3: perfect numbers
*/

public class problem3 {
	public static void main(String[] args) {

		// define sum variable to calculate sum of divisors
		int sum = 0;

		// set up loop to test each number if it is perfect
		for (int num = 1; num < 10000; num++) {

			// find divisors of number and add to sum
			for (int i = 1; i <= (num - 1); i++) {
	            if (num % i == 0) {
	                sum = sum + i;
	            }
        	}

        	// prints if sum of divisiors = number
        	if (sum == num) {
            	System.out.println(num);
            }

            // reset sum to 0 for the next iteration
            sum = 0;
		}
	}
}