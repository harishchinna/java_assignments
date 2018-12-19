package day3_junit_assignment;

public class Country {
	private String countryName;
	private double population;
	private double area;
	int count;

	public Country(String countryName, double population, double density)
	{
		this.countryName=countryName;
		this.population=population;
		this.area=density;
	}

	public Country highestPopulation(Country[] first) 
	{
		Country largestpopulation=first[0];
		for(count=0;count<first.length;count++)
		{
			if(first[count].population>largestpopulation.population)
			{
			largestpopulation=first[count];
			}
		}
		return largestpopulation;
	}
	public Country highestArea(Country[] first) 
	{
		Country highestarea=first[0];
		for(count=0;count<first.length;count++)
		{
			if(first[count].area>highestarea.area)
			{
				highestarea=first[count];
			}
		}
		return highestarea;
	}
	public Country highestpopulationdensity(Country[] first) 
	{
		Country highestpopulationdensity=first[0];
		for(count=0;count<first.length;count++)
		{
			if(first[count].population/first[count].area>highestpopulationdensity.population/highestpopulationdensity.area)
			{
				highestpopulationdensity=first[count];
			}
		}
		return highestpopulationdensity;
	}
	
	}


