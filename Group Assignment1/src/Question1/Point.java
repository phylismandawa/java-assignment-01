package Question1;

public class Point {
    private int x=0;
    private  int y=0;

    public Point(){

    }
    public Point(int x,int y)
    {
        this.x= x;
        this.y= y;
    }
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x= x;
    }
    public int getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public void setXY(int x,int y) 
    {
	    this.x = x;
	    this.y = y;
    }
    public int[] getXY()
    {
    	int[] xy = {getX(), getY()};
    	return xy;
    }
    public double distance(int x, int y)
    {
    	double distance = 0;
    	return distance;
    }
    public double distance(Point another)
    {
    	double distance = 0;
    	return distance;
    }
    public double distance()
    {
    	double distance = 0;
    	return distance;
    }
    
}
