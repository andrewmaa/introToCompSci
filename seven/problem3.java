/*  
intro to computer science 
march 12, 2024
andrew ma
problem 3: markov matrix
*/

package seven;

// import modules
import java.util.Scanner; // Scanner for input
import java.util.Arrays; // Array to fill array with values

public class problem3 {

    // create method to determine if matrix is a markov matrix
    public static boolean isMarkovMatrix(double [][] m) {
        
        // create boolean variable to be returned at end of method
        boolean isOne = true;
        
        
        double[] sums = new double[m.length];
        Arrays.fill(sums, 0);

        // sums elements in each row into one total
        // stores into new array of sums
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sums[i] += m[i][j];
            }
        }

        // if any element in the sums list is not 0, return false
        for (int i = 0; i < m.length; i++) {
            if (sums[i] != 1 ) {
                isOne = false;
            }
        }

        // returns calculated boolean result
        return isOne;
    }

    public static void main(String[] args) {

        // create matrix (2D array)
        double[][] matrix = new double[3][3];
        
        // create input variable to prompt user
        Scanner input = new Scanner(System.in);

        // prompts user for decimal values of each element
        System.out.print("Enter decimal values for a 3x3 matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // prints whether the matrix is a markov matrix based on 
        // final boolean result from the method
        if (isMarkovMatrix(matrix) == false) {
            System.out.println("The matrix is not a markov matrix.");
        }
        else {
            System.out.println("The matrix is a markov matrix.");
        }


    }
}
