import java.util.Scanner;
public class Hello 
{
	
	
	static double addition(double one,double two)
	{
		double result;
		result=one+two;
		return result;
	}
	static double subtraction(double one,double two)
	{
		double result;
		result=one-two;
		return result;
	}
	static double multiplication(double one,double two)
	{
		double result;
		result=one*two;
		return result;
	}
	static double division(double one,double two)
	{
		double result;
		result=one/two;
		return result;
	}
	public static void main(String args[])	
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value of first number:");
	
	double one=scan.nextDouble();
	System.out.println("Enter the value of second number:");
	
	double two=scan.nextDouble();
	System.out.println("addition :"+addition(one,two));
	System.out.println("subtraction :"+subtraction(one,two));
	System.out.println("multiplication :"+multiplication(one,two));
	System.out.println("division :"+division(one,two));	
	
	}
}