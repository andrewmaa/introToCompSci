/*  
intro to computer science 
march 4, 2024
andrew ma
problem 4: sorting method
*/

// import modules
import java.util.*; // Scanner for reading input, Arrays for conversion to a string

public class problem4 {
	public static int[] bsort(int[] a) {

		boolean swapped;

		// iterates 9 times
        for (int i = 0; i < a.length - 1; i++) {
        	// iterates multiple times to swap elements
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // swap elements
                    int temp = a[j]; // create temporary variable storing first number
                    a[j] = a[j + 1]; // update number in first position to be number in second position
                    a[j + 1] = temp; // update number in second position to be number in first position
                }
            }
        }

		// returns updated array
		return a;
	}

	public static void main(String[] args) {

		// create scanner for input
		Scanner input = new Scanner(System.in);

		// asks for 10 numbers
		System.out.print("Enter 10 numbers: ");
		System.out.println();

		int[] numbers = new int[10];
		// take the input of all 10 numbers and store them in the array
		for (int num = 0; num < 10; num++) {
			System.out.println();
			System.out.print("Number #"+(num+1)+ ": ");
			numbers[num] = input.nextInt();
			
		}
		// sort the array, then convert the Array to a string to display the contents inside
		System.out.println(Arrays.toString(bsort(numbers)));
	}
}