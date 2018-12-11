class Sort

{

	public static void main(String[] args) throws Exception

	{

		int array[] = {10,54,14,45,12,5,68,6,55,7,35,45,77,87,76};

		int temporary;

		for(int point=0;point<15;point++)

		{

			for(int pointer1=point+1;pointer1<15;pointer1++)

			{

				if(array[point]>array[pointer1])

				{

				temporary=array[point];

				array[point]=array[pointer1];

				array[pointer1]=temporary;

				}

			}

		}

		for(int point=0;point<15;point++)

		{

		System.out.print(array[point]+" ");

		}

	}

}