import java.util.Scanner;
public class Month {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in dd/mm/yyyy");
        int date=sc.nextInt();
	int month=sc.nextInt();
	int year=sc.nextInt();
	System.out.println(+date+"/"+month+"/"+year);
	if(month==1)
	{
		System.out.println(+date+"/"+"january"+"/"+year);
	}
	if(month==2)
	{
		System.out.println(+date+"/"+"february"+"/"+year);
	}
	if(month==3)
	{
		System.out.println(+date+"/"+"march"+"/"+year);
	}
	if(month==4)
	{
		System.out.println(+date+"/"+"April"+"/"+year);
	}
	if(month==5)
	{
		System.out.println(+date+"/"+"may"+"/"+year);
	}
	if(month==6)
	{
		System.out.println(+date+"/"+"june"+"/"+year);
	}
	if(month==7)
	{
		System.out.println(+date+"/"+"july"+"/"+year);
	}
	if(month==8)
	{
		System.out.println(+date+"/"+"August"+"/"+year);
	}
	if(month==9)
	{
		System.out.println(+date+"/"+"september"+"/"+year);
	}
	if(month==10)
	{
		System.out.println(+date+"/"+"october"+"/"+year);
	}
	if(month==11)
	{
		System.out.println(+date+"/"+"November"+"/"+year);
	}
	if(month==12)
	{
		System.out.println(+date+"/"+"December"+"/"+year);
	}
	}

}