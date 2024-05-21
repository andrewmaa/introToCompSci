/*  
intro to computer science 
march 12, 2024
andrew ma
problem 4: largest block
*/

package seven;

// import modules
import java.util.Scanner; // Scanner for input
public class problem4 {

    // create method for finding maximum square submatrix
    public static int[] maxSquare(int[][] a) {

        // method to find maximum sized square in the 2D array
        for (int size = a.length; size > 0 ; size--) {
            for (int row = 0; row < a.length; row++) {
                for (int column = 0; column < a[row].length; column++) {

                    // if the array is a square matrix
                    if((a.length - row >= size) && (a[row].length - column >= size)) {
                        boolean onlyOne = true;
                        for (int i = row; i < row + size; i++) {
                            for (int j = column; j < column + size; j++) {

                                // if the element does not contain 1, continue to next possible square
                                if(a[i][j] != 1) {
                                    onlyOne = false;
                                    break;
                                }
                            }
                            if (onlyOne != true) {
                                break;
                            }
                        }

                        // returns the maximum possible square matrix of only 1's in the array
                        if (onlyOne == true) {
                            return new int[] {row, column, size}; // the start element in the block
                        }
                   }
                }
            }
        }

        // returns array if no square with 1s is found
        return new int[] {0, 0, a.length};
    }
    public static void main(String[] args) {

        // create Scanner variable to prompt input
        Scanner input = new Scanner(System.in);

        // prompts user for number of rows, and each element's integer value
        System.out.print("Enter the number of rows in the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("Enter matrix row by row: ");
         
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        
        // finds maximum square matrix
        // create new array to store size and coordinates
        int[] maxSquare = maxSquare(matrix);
        System.out.print("The maximum square submatrix of 1's is at (" + maxSquare[0] + ", " + maxSquare[1] + ") with size " + maxSquare[2]);
         
    }
}
