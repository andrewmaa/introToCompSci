/*  
intro to computer science 
march 11, 2024
andrew ma
problem 1: largest element in 2D array
*/

package seven;
import java.util.Scanner; // Scanner for input
import java.util.Arrays; // Arrays for converting to string

public class problem1 {

    // create method for locating largest element in 2D array
    public static int [] locateLargest(double [][] a) {

        // create array to return when method is called
        int[] loc = new int[2];

        // create array to compare elements 
        double largest = a[0][0];

        // for each element, compare with the largest element found already
        // replace numbers in the array if a larger element is found
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > largest) {
                    largest = a[i][j];
                    loc[0] = i;
                    loc[1] = j;
                }
            }
        }
        
        return loc;
    }

    public static void main(String [] args) {

        // create input variable
        Scanner input = new Scanner(System.in);

        // prompt user for array size
        System.out.print("Enter number of rows in array: ");
        int r = input.nextInt();

        System.out.print("Enter number of columns in array: ");
        int c = input.nextInt();

        // create array with dimensions from input
        double[][] a = new double[r][c];

        // prompt user to enter integer for each element in array
        System.out.println("Enter elements: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        // print position of largest number using created method from earlier
        System.out.print("The largest element is located at " + Arrays.toString(locateLargest(a)));

    }
}
