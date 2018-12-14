package Question1_a;

public class Circle {

	private double radius = 1.0;
	private String color = "red";
	
	public Circle()
	{
		
	}
	public Circle(double radius)
	{
		setRadius(radius);
	}
	public Circle(double radius, String color)
	{
		setRadius(radius);
		setColor(color);
	}
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea()
	{
		
		return Math.PI * getArea()*getArea();
	}

}