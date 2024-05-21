package eleven;
import java.lang.Math;

// extending GeometricObject and implementing Comparable and Cloneable
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    // create private field for side length of Octagon
    private double side;

    // constructors
    public Octagon() {
    }

    public Octagon(double side) {
        this.side = side;
    }

    // update side length of Octagon
    public void setSideVal(double side) {
        this.side = side;
    }

    // returns side length of Octagon
    public double getSideVal() {
        return side;
    }

    // returns area of Octagon
    public double getArea() {
        return 2*(1+Math.sqrt(2))*Math.pow(side, 2);
    }

    // returns perimeter of Octagon
    public double getPerimeter() {
        return 8*side;
    }

    // overrides existing compareTo method
    @Override
    public int compareTo(Octagon a) {

        // if sidelengths are equal
		if (this.side == a.side) {
			return 0;
		}

        // if sidelengths are not equal, check which octagon has a greater side length
		if (this.side < a.side) {
			return -1;
		}
		else {
			return 1;
		}
	}

    // overrides existing clone method and throws exception if octagon cannot be cloned
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
