/*  
intro to computer science 
feb. 15, 2024
andrew ma
problem 1: compute pi
*/

// import modules
import java.lang.Math; // Math for power function

public class problem1 {
	public static void main(String[] args) {
		// create variable for pi approximation
		double pi = 0;
        for (int iter = 1; iter <= 100000; iter++) {

        	// Update pi with each term in the series using the formula
            pi += Math.pow(-1, iter + 1) / (2 * iter - 1); 

            // Print the value of pi at specified intervals
            if (iter % 10000 == 0) {
                System.out.println("pi at the " + iter + "th approximation: " + (pi * 4));
            }
        }
	}
}
