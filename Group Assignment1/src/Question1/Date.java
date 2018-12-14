package Question1;

public class Date 
{
	private int year, month, day;
	
	Date(int year, int month, int day)
	{
		setDate(year,month,day);
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String toString()
	{
		return Integer.toString(getMonth()) + "/" +
				Integer.toString(getDay()) + "/" + Integer.toString(getYear());
	}
	public void setDate(int year , int month , int day)
	{
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	

}
