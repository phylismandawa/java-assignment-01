package Question1_c;

public class Point3D extends Point2D {
	
	private float z=0.0f;

	public Point3D (float x, float y, float z)
	{
		super(x,y);
		this.z = z;
	}
	public Point3D ()
	{
		super();
	}
	public float getZ()
	{
		return z;
	}
	public void setZ( float z)
	{
		this.z = z;
	}
	public void setXYZ(float x, float y, float z)
	{
		setX(x);
		setY(y);
		setZ(z);
		
	}
	public float [] getXYZ()
	{
		float [] xyz = {getX(),getY(),z};
		return xyz;
	}
	public String toString()
	{
		String a,b,c;
		a = Float.toString (getX());
		b = Float.toString(getY());
		c = Float.toString(getZ());
		return "(" + a + "," + b + " ," + c + ")";
	}

}
