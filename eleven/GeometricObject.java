package eleven;
import java.util.Date; // import Date for storing date of Object creation

public class GeometricObject{

	// private fields
	private String color = "white";
	private boolean filled = true;
	private Date dateCreated;
	
	// constructors
	public GeometricObject()
	{
		dateCreated = new Date();
	}
	
	public GeometricObject(String color, boolean filled)
	{
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	
	// getters and setters for color, whether the object is filled
	// getter for date of creation
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public boolean isFilled()
	{
		return filled;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
	}

	// overrided toString method returning the objects information
	@Override
	public String toString()
	{
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}
