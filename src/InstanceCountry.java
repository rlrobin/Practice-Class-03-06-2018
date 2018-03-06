import java.util.Scanner;
public class InstanceCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("What is the name of the first country? ");
		String name1= scan.nextLine();
		System.out.println("What is the population size? ");
		int size1=scan.nextInt();
		System.out.println("What is the area? ");
		double area1=scan.nextDouble();
		Country country1=new Country(name1,size1,area1);
		
		System.out.println("What is the name of the second country? ");
		String name2= scan.nextLine();
		System.out.println("What is the population size? ");
		int size2=scan.nextInt();
		System.out.println("What is the area? ");
		double area2=scan.nextDouble();
		Country country2=new Country(name2,size2,area2);
		
		System.out.println("The largest of the two is "+ country1.ComparePopulation(country1,country2));
	}

}
