package two;
/*  
intro to computer science 
feb. 4, 2024
andrew ma
problem 2: wind chill temperature
*/

// import appropriate classes
import java.util.Scanner; // Scanner for user input
import java.lang.Math; // Math for power function

public class problem2 {
	public static void main(String[] args) {

		// create new Scanner for prompting the user
		Scanner input = new Scanner(System.in);

		// asking the user for the temperature
		System.out.print("Enter a temperature between -58°F and 41°F: ");
		double temperature = input.nextDouble();

		// reprompts the user if the previously inputted value is invalid (<-58 or >41)
		while ((temperature < -58) || (temperature > 41)) {
			System.out.println("Invalid temperature, try again");
			System.out.print("Enter a temperature between -58°F and 41°F: ");
			temperature = input.nextDouble();
		}

		// asking the user for the windspeed
		System.out.print("Enter a windspeed greater than 2mph: ");
		double windspeed = input.nextDouble();
		
		// reprompts the user if the previously inputted value is invalid (<2)
		while (windspeed < 2) {
			System.out.println("Invalid windspeed, try again");
			System.out.print("Enter a windspeed greater than 2mph: ");
			windspeed = input.nextDouble();
		}

		// calculates the wind chill temp using the formula
		double windchilltemp = 35.74+0.6215*temperature-35.75*Math.pow(windspeed,0.16)+0.4275*temperature*Math.pow(windspeed,0.16);
		
		// printing final result
		System.out.println("The wind-chill temperature is: "+ windchilltemp);
	}
}