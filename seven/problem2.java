/*  
intro to computer science 
march 12, 2024
andrew ma
problem 2: central city
*/

package seven;

// import modules
import java.lang.Math; // Math for power and sqrt functions
import java.util.Scanner; // Scanner for taking input


public class problem2 {
    
    // method to calculate the distance between two cities
    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
    }

    // method to find the total distance from one city to all other cities
    public static double totalDistance(double[][] a, int i) {
        double total = 0;
        for (int j = 0; j < a.length; j++) {
            if (i != j) {
                total += getDistance(a[i][0], a[i][1], a[j][0], a[j][1]);
            }
        }
        return total;
    }


    public static void main(String[] args) {

        // creating input variable
        Scanner input = new Scanner(System.in);

        // prompt user for number of cities, and each city's coordinates
        System.out.print("Enter the number of cities: ");
        int num = input.nextInt();
        double[][] cities = new double[num][2];
        
        System.out.print("Enter the coordinates of the cities: ");
        for (int i = 0; i < num; i++) {
            cities[i][0] = input.nextDouble();
            cities[i][1] = input.nextDouble();
        }

        // create variables to find minimum total distance
        double minDistance = Double.MAX_VALUE;
        int centralCity = 0;

        // comparing each city's total distance to find the minimum
        for (int i = 0; i < num; i++) {
            double distance = totalDistance(cities, i);
            if (distance < minDistance) {
                centralCity = i;
                minDistance = distance;
            }
        }

        // print the calculated central city with its coordinates and total distance
        System.out.println("The central city is at position " + cities[centralCity][0] + ", " + cities[centralCity][1] + " and has a total distance of " + minDistance);

    }


}
