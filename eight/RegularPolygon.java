package eight;
import java.lang.Math; // import Math module for power function

public class RegularPolygon {

    // create private fields (b.p. 1-4)
    private int n;
    private double side;
    private double x, y;

    // create no-arg constructor (b.p. 5)
    public RegularPolygon() {
        n = 3;
        side = 1;
        x = y = 0;
    }

    // create constructor with # sides and length of side (b.p. 6)
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        x = y = 0;
    }

    // create constructor with # sides, length of side, and x- and y- coordinates (b.p. 7)
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // create accessor and mutator methods (b.p. 8)
    public int getNumSides() {
        return n;
    }

    public double getSideLength() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setNumSides(int n) {
        this.n = n;
    }

    public void setSideLength(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // create method that returns perimeter (b.p. 9)
    public double getPerimeter() {
        return side * n;
    }

    // create method that returns area (b.p. 10)
    public double getArea() {

        // using appropriate formula (given in assignment instructions)
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}