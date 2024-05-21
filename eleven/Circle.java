package eleven;
/*
 *   Circle class in Listing 13.2
 */
// import the Comparable interface
import java.lang.Comparable;

// extend GeometricObject and implement Comparable
public class Circle extends GeometricObject implements Comparable<Circle>{
	
	// define private field of radius
	private double radius;
	
	// constructors
	public Circle() {}

	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled)
	{
		this.radius = radius;
		this.setColor(color);		
		this.setFilled(filled);	
	}

	
	// overrides existing equals method
	@Override
	public boolean equals(Object o) {
		return this.compareTo((Circle)o) == 0;
	}

	// compareTo method
	@Override
	public int compareTo(Circle other) {

		if (this.radius == other.radius) {
			return 0;
		}
		if (this.radius < other.radius) {
			return -1;
		}
		else {
			return 1;
		}
		
	}

	// returns radius of circle
	public double getRadius()
	{
		return radius;
	}
	
	// updates radius of circle
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	// returns diameter of circle
	public double getDiameter()
	{
		return 2 * radius;
	}

	// returns area of circle
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
	
	// returns perimeter of circle
	public double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}
	
	// returns info of the circle
	public void getCircleInfo()
	{
		System.out.println ("The circle was created " + getDateCreated() +
				           "\nradius: " + getRadius() + "\ncolor: " + getColor()+
				           "\nfilled: " + isFilled());
	}
}
