package day3_junit_assignment;

public class Date {
	private int date;
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	private int month;
	private int year;
	public Date(int date, int month, int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
		// TODO Auto-generated constructor stub
	}
	

	public void Date()
	{
		
	}
	
	public String toString()
	{
		return date+"/"+month+"/"+year;
	}
	public boolean isSmaller(Date d)
	{
		Date givendate=new Date(8,6,2019);
		if(d.date<givendate.date)
		{
			return true;
		}
		else
			return false;
	}
	public int[] diff(Date d)
	{
		Date fulldate=new Date(8,6,2019);
		int newdate=fulldate.date-d.date;
		int newmonth=fulldate.month-d.month;
		int newyear=fulldate.year-d.year;
		int diff[]={newdate,newmonth,newyear};
		return diff;
	}
}
