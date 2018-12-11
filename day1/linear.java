import java.util.*;

class LinearSearch

{

	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		int array[] = {5,10,15,20,25,30,35,34,40,36,50,6,7,96,76};

		System.out.println("Enter the number you want to search :");

		int number = sc.nextInt();

		for(int count=0;count<array.length;count++)

		{

			if(array[count]==number)

			{

				System.out.println("Entered number is in the array:"+number);

			}

		}

	}

}