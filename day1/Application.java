import java.util.*;
import java.util.Scanner;
public class Application
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String userid="harish";
		String password="harish";
		int counter=0;
		for(int count=1;count<4;count++)
		{ 
			System.out.println("Enter your user_id:");
			String userid1=sc.nextLine();
			System.out.println("Enter your password:");
			String password1=sc.nextLine();
			if(userid.equals(userid1) && password.equals(password1))
			{
				System.out.println("Welcome "+userid);
				break;
			}
			else
			{
				counter++;
			}
		}
		if(counter==3)
		{
			System.out.println("contact admin");
		}
		
	}
}