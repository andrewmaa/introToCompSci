package eleven;

import java.util.Scanner;// import Scanner for taking input

public class problem3 {
    public static void main(String[] args) {

        // create Scanner variable to take input
        Scanner input = new Scanner(System.in);

        // create new Circle with radius 5
        Circle a = new Circle(5);

        // prompt user to give a radius for a second circle
        System.out.print("Enter a radius for a circle to compare with another circle: ");
        Circle b = new Circle(input.nextDouble());

        // comparing the radii from each circle
        System.out.println("Comparing circles...");

        // prints whether the radii are equal
        if (a.equals(b)) {
            System.out.println("Circle radii are equal");
        }
        else {
            System.out.println("Circle radii are not equal");
        }
    }
}
