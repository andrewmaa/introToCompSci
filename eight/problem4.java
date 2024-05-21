package eight;
import java.util.Scanner; // import Scanner for taking input

public class problem4 {
    public static void main(String[] args) {

        // create new variable for taking input
        Scanner input = new Scanner(System.in);
        
        // create variables for the size of the array
        int row, col;

        // take the input for the size of the array
        System.out.print("Enter the number of rows and columns in the array: ");
        row = input.nextInt();
        col = input.nextInt();

        // create the array using the specified row and column variables
        double[][] a = new double[row][col];

        // takes input for each element in the array
        System.out.println("Enter array values: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }


        // create instance of Location and locate largest element in array
        Location loc = Location.locateLargest(a);

        // returns maximum element of array and its position
        System.out.println("The largest element is " + loc.maxValue + ", and it is located at ("+ loc.row + ", " + loc.column + ")");
    }
}
