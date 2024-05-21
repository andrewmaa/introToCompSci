package eight;

public class problem2 {
    public static void main(String[] args) {
        // create three polygon objects from the RegularPolygon class based on the parameters in the assignment instructions
        RegularPolygon a = new RegularPolygon();
        RegularPolygon b = new RegularPolygon(6,4);
        RegularPolygon c = new RegularPolygon(10, 4, 5.6, 7.8);

        // print out each polygons area and perimeter
        System.out.println("Polygon 1: ");
        System.out.println("Perimeter: " + a.getPerimeter());
        System.out.println("Area: " + a.getArea());
        System.out.println();

        System.out.println("Polygon 2: ");
        System.out.println("Perimeter: " + b.getPerimeter());
        System.out.println("Area: " + b.getArea());
        System.out.println();

        System.out.println("Polygon 3: ");
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());
    }
}
