/*  
intro to computer science 
feb. 7, 2024
andrew ma
problem 4: sort cities in alphabetical order
*/


// NOTE: Used an array list with the sort method
// https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/


// import appropriate classes
import java.util.Scanner; // Scanner for user input
import java.util.Arrays; // Arrays
public class problem4 {
	public static void main(String[] args) {

		// create new Scanner for prompting the user
		Scanner input= new Scanner(System.in);
		
		// prompting the user to enter three cities
		System.out.print("Enter first city: ");
		String city1 = input.next();

		System.out.print("Enter second city: ");
		String city2 = input.next();

		System.out.print("Enter third city: ");
		String city3 = input.next();

		// creating an array to store the city names
		String cityList[] = {city1, city2, city3};

		// sorting the array in ascending order
		Arrays.sort(cityList);

		// printing the sorted array
		System.out.println("List of cities: " + Arrays.toString(cityList));
		
	}
}