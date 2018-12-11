import java.util.*;
import java.util.Scanner;
class Duplicates

{

	public static void main(String[] args)

	{

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the number of elements:");

		int numberOfElements=sc.nextInt();

		int array[]=new int[numberOfElements];

		System.out.println("Enter the elements");

		for(int index=0;index<array.length;index++)

		{

			array[index]=sc.nextInt();

		}

		for(int index=0;index<array.length;index++)//sorting

		{

			int temporaryVariable;

			for(int index1=index+1;index1<array.length;index1++)

			{

				if(array[index]>array[index1])

				{

					temporaryVariable=array[index];

					array[index]=array[index1];

					array[index1]=temporaryVariable;

				}

			}

		}

		int temporaryVariable=0;

		for(int index=0;index<array.length-1;index++)

		{

			if(array[index]!=array[index+1])

			{

				array[temporaryVariable]=array[index];	

				temporaryVariable++;

			}

		}

		array[temporaryVariable]=array[array.length-1];

		int newArray[]=new int[temporaryVariable+1];

		System.out.println("After removing dupalicate elements");

		for(int index=0;index<newArray.length;index++)

		{

			System.out.println(array[index]);

		}

	}
}