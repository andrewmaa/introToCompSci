/*  
intro to computer science 
feb. 26, 2024
andrew ma
problem 4: converting milliseconds
*/

// import modules
import java.util.Scanner; // Scanner for user input

public class problem4 {
	public static String convertMillis (long millis) {

		long tsec = millis / 1000;
		long sec = tsec % 60; // remaining seconds after finding minutes
		long tmin = tsec / 60;
		long min = tmin % 60; // remaining minutes after finding hours
		long hrs = tmin / 60;

		// concatenates longs together into a string
		String str = hrs + ":" + min + ":" + sec;

		return str;
	}

	public static void main(String[] args) {

		// create user input
		Scanner input = new Scanner(System.in);

		// prompts user to enter # of milliseconds
		System.out.print("Enter number of milliseconds: ");
		long millis = input.nextLong();
		
		// converts milliseconds to HH:MM:SS format using the convertMillis method and
		// subsequently prints converted result
		System.out.println(convertMillis(millis));
	}
}