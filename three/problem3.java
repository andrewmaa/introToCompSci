/*  
intro to computer science 
feb. 7, 2024
andrew ma
problem 3: number of days in a month
*/

// import appropriate classes
import java.util.Scanner; // Scanner for user input

public class problem3 {
	public static void main(String[] args) {

		// create new Scanner for prompting the user
		Scanner input= new Scanner(System.in);
		
		// prompting the user for the year and first three letters of the month
		System.out.print("Enter year: ");
		int year = input.nextInt();

		System.out.print("Enter first three letters of month (first letter uppercase): ");
		String month = input.next();

		// checks if the month has 31 days
		if ((month.equals("Jan")) || (month.equals("Mar")) || (month.equals("May")) || (month.equals("Jul")) || (month.equals("Aug"))|| (month.equals("Oct"))|| (month.equals("Dec"))) {
			System.out.println("There are 31 days in "+month+" "+year);
		}

		// checks if the month if February, and if it has 29 or 28 days based on
		// whether the year is a leap year
		else if (month.equals("Feb")) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("There are 29 days in Feb "+ year);
			}
			else {
				System.out.println("There are 28 days in Feb "+ year);
			}
		}

		// checksif the month has 30 days
		else {
			System.out.println("There are 30 days in "+month+ " "+year);
			
		}
	}
}
