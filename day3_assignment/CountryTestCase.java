package day3_junit_assignment;

import static org.junit.Assert.*;

import org.junit.Test;
import  org.junit.Before;
public class CountryTestCase 
{
	 private Country country1;
	 private Country country2;
	 private Country country3;
	 Country country[];
	 @Before
	 public void setUp()
	 {
		 country1=new Country("india",1000,500.0);
		 country2=new Country("Usa",1500,700.568);
		 country3=new Country("Australia",1200,550);
		 country=new Country[3];
		 country[0]=country1;
		 country[1]=country2;
		 country[2]=country3;		 
	 }
	 @Test
	 public void checkingPopulation()
	 {
		 assertEquals(country2,country1.highestPopulation(country));
	 }
	 @Test
	 public void checkingArea()
	 {
		 assertEquals(country2,country1.highestArea(country));
	 }
	 @Test
	 public void checkingPopulationDensity()
	 {
		 assertEquals(country2,country1.highestArea(country));
	 }
	 
}
