import java.util.Scanner;
public class Numbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Key in 3 different numbers to check for the largest and smallest of the three ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if ((num1>num2)&&(num2>num3))
		{
			System.out.println(num1+" Is greater \n"+num3+ " Is smallest " );
		}
		else if ((num1>num3)&&(num3>num2))
		{
			System.out.println(num1+" Is greater \n"+num2+" Is smallest");
		}
		else if ((num2>num1)&&(num1>num3))
		{
			System.out.println(num2+" Is greater \n"+num3+ " Is Smallest ");
		}
		else if ((num2>num3)&&(num3>num1))
		{
			System.out.println(num2+ " Is greater \n"+num1+ " Is Smallest ");
		}
		else if ((num3>num1)&&(num1>num2))
		{
			System.out.println(num3+" Is greater \n"+num2+ " Is Smallest ");
		}
		else 
		{
			System.out.println(num3+ " Is greater \n"+num1+ " Is smaller ");
		}
	}
	
}
