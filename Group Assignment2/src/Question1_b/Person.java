package Question1_b;

public class Person 
{
	private String name;
	private String address;
	
	public Person(String name, String address)
	{
		setName(name);
		setAddress(address);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString()
	{
		return "Person [ name = " + getName() + ", address"
				+ " = " + getAddress() + "]";
	}

}
