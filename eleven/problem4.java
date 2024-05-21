package eleven;

public class problem4 {
    // throws exception if octagon cannot be cloned
    public static void main(String[] args) throws CloneNotSupportedException {
        
        // create Octagon object
		Octagon a = new Octagon(5);

		// get and print area and perimeter of Octagon
		System.out.println("Octagon area: " + a.getArea());
        System.out.println("Octagon perimeter: " + a.getPerimeter());
        System.out.println();

		// clone the existing octagon
		System.out.println("cloning Octagon...");
		Octagon b = (Octagon)a.clone();

		// compare octagons using compareTo method
        // and print result (whether the clone of the octagon is equal or if one is greater)
		int result = (a.compareTo(b));
		if (result == 1){
			System.out.println("octagon is greather than its clone");
        }
        else if (result == -1) {
			System.out.println("octagon is less than its clone"); 
        }
        else {
			System.out.println("octagon is equal to its clone");
        }
    }
}
