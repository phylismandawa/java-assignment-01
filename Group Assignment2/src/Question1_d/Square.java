package Question1_d;

public class Square extends Rectangle
{
	private double side;
	
public Square()
{
	
}
public Square(double side)
{
	setSide(side);
}
public Square(double side,String color,boolean filled)
{
    setColor(color);
    getColor();
    setFilled(filled);
}
public double getSide()
{
    return side;
}
public void setSide(double side)
{
	this.side = side;
}
public void setWidth(double side)
{
	this.side = side;
}
public void setLength(double side)
{
	this.side = side;
}
public String toString()
{
	return "";
}
}
