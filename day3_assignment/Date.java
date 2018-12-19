package day3_junit_assignment;

public class Date {
	private int day;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
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

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		// TODO Auto-generated constructor stub
	}

	public void Date() {

	}

	public String toString() {
		return day + "/" + month + "/" + year;
	}

	public boolean isSmaller(Date date)
	{
		Date givendate = new Date(8, 6, 2019);
		if (date.year < givendate.year) 
		{
			if(date.month<givendate.month)
			{
				if(date.day<givendate.day)
				{
					return true;
				}
			}
		} 
			return false;
	}

	public int[] diff(Date date) {
		int newdate;
		int newmonth;
		int newyear;
		Date fulldate = new Date(8, 6, 2019);
		if(fulldate.day>date.day)
		{
			newdate = fulldate.day - date.day;
		}
		else
		{
			newdate=date.day-fulldate.day;
		}
		if(fulldate.month>date.month)
		{
		newmonth = fulldate.month - date.month;
		}
		else
		{
			newmonth=date.month-fulldate.month;
		}
		if(fulldate.year>date.year)
		{
		newyear = fulldate.year - date.year;
		}
		else
		{
			newyear=date.year-fulldate.year;
		}
		int diff[] = { newdate, newmonth, newyear };
		return diff;
	}
}
