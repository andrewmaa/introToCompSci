/*  
intro to computer science 
feb. 26, 2024
andrew ma
problem 3: num of occurrences (non-case sensitive)
*/

// import modules
import java.util.Scanner; // Scanner for user input

public class problem3 {
	public static int count(String str, char a) {

		// convert string to all lowercase
		String newstr = str.toLowerCase();

		int count = 0;
		
		// sets uppercase character to lowercase to match all lowercase string
		if (a < 97) {
			a += 32;
		}

		// iterates over string characters and adds 1 to the count if the characters match
		for (int i = 0; i < newstr.length(); i++) {
			if (a == newstr.charAt(i)) {
				count += 1;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// prompts user for string
		System.out.print("Enter a string: ");
		String str = input.nextLine();

		// prompts user for character
		System.out.print("Enter a character: ");
		char a = input.next().charAt(0); // there is no .nextChar() so the Scanner reads only the first character inputted
	

		// checks how many times character appears in string using the created count() method
		// and prints output based on result
		int count = count(str, a);
		if (count != 0) {
			System.out.println("The character \'" + a + "\' appears in the string \"" + str + "\" " + count + " times.");
		}
		else {
			System.out.println("The character \'" + a + "\' does not appear in the string.");
		}
	}
}