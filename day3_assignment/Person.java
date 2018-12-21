package day3_junit_assignment;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String name;
	private String DOB;
	int day;
	int month;
	int year;
	public Person(String name, int day, int month, int year)
	{
		this.name=name;
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public Person()
	{
		
	}
	
	
	public void display()
	{	
		LocalDate personDateofbirth = LocalDate.of(1997,6,8);
		LocalDate localdate = LocalDate.now();
		Period p =Period.between(personDateofbirth,localdate);
		String name = getName();
		String dateOfBirth = day+"/"+month+"/"+year;
		String age = p.getDays()+"Days "+p.getMonths()+"Months "+p.getYears()+"Years ";
		
	}
	public String olderOne(Person person,Person person1)
	{
		LocalDate personDateofbirth = LocalDate.of(person.year,person.month,person.day);
		LocalDate personOneDob = LocalDate.of(person1.year,person1.month,person1.day);
		Period p =Period.between(personDateofbirth,personOneDob);
		if(p.getDays()>0 && p.getMonths()>0 && p.getYears()>0)
		{
			return person.name+" is older than " +person1.name+" by "+p.getYears()+" years ,"+p.getMonths()+" months, and "+p.getDays()+"days";
		}
		else
		{
			return person1.name+" is older than " +person.name+" by "+p.getYears()+" years ,"+p.getMonths()+" months, and "+p.getDays()+"days";
		}
	}
}
