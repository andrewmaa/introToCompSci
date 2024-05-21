package eight;
import java.util.Scanner; // import Scanner for taking input

public class problem3 {
    public static void main(String[] args) {

        // create scanner variable
        Scanner input = new Scanner(System.in);
        
        // take input for each constant in the equation
        System.out.println("Enter a, b, c, d, e, and f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // print out the linear equations
        System.out.println();
        System.out.println("Linear equations:");
        System.out.println(a + "x + " +b + "y = " + e);
        System.out.println(c + "x + " +d + "y = " + f);

        // create new object from Linear Equation class
        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
        // checks if system has solutions, and
        // prints the solutions OR prints that there are none
        if (equation.isSolvable()) {
            System.out.println("Solution for x: " + equation.getX());
            System.out.println("Solution for y: " + equation.getY());
        }
        else {
            System.out.println("The equation has no solution. ");
        }


        
    }
}
