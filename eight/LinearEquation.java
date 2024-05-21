package eight;

public class LinearEquation {

    // create private data fields (b.p. 1)
    private double a, b, c, d, e, f;

    // create constructor with arguments (b.p. 2)
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // create getter method for each data field (b.p. 3)
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // create method that returns boolean depending on if (ad-bc) equals to 0 (b.p. 4)
    public boolean isSolvable() {
        return (a*d - b*c) != 0;
    }

    // create methods to return solutions for the equation (b.p. 5)
    public double getX() {
        return ((e * d - b * f)/(a * d - b * c));
    }

    public double getY() {
        return ((a * f - e * c)/(a * d - b * c));
    }
}
