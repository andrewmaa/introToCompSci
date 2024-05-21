/*  
intro to computer science 
feb. 7, 2024
andrew ma
problem 2: perimeter of a triangle
*/

// import appropriate classes
import java.util.Scanner; // Scanner for user input

public class problem2 {
	public static void main(String[] args) {

		// create new Scanner for prompting the user
		Scanner input = new Scanner(System.in);

		// prompting the user for the length of each triangle edge
		System.out.print("First edge: ");
		int edge1 = input.nextInt();

		System.out.print("Second edge: ");
		int edge2 = input.nextInt();

		System.out.print("Third edge: ");
		int edge3 = input.nextInt();

		// checks if the sum of two edges is greater than the remaining edge for each combination
		// and computes the perimeter if the input is valid
		if ((edge1+edge2) > edge3) {
			if ((edge1+edge3) > edge2) {
				if ((edge2+edge3) > edge1) {
					System.out.println("Input is valid – perimeter is "+(edge1+edge2+edge3)+" units");
				}
				else {
					System.out.println("Invalid input");
				}
			}
			else {
				System.out.println("Invalid input");
			}
		}
		else {
			System.out.println("Invalid input");
		}

	}
}