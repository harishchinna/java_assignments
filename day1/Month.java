import java.util.Scanner;
import java.text.DateFormatSymbols;
public class Month 
	{

	public static void main(String[] args)
	{
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter date in dd/mm/yyyy");
	        int date=sc.nextInt();
		int month=sc.nextInt();
		int year=sc.nextInt();
		System.out.println(+date+"/"+getMonth(month)+"/"+year);
	}
	static String getMonth(int month)
	{
		return new DateFormatSymbols().getMonths()[month-1];
	}

}