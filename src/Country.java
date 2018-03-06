
public class Country {
	String country;
	int population;
	double area;
	public Country(String country1, int population1, double area1)
	{
		country=country1;
		population=population1;
		area=area1;
	}
	public String ComparePopulation(Country num1, Country num2)
	{
		if (num1.population>num2.population)
			return num1.country+" is Larger";
		else
	{
		return num2.country+" Is larger";
	}
	}
	
}

