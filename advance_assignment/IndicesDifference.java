package Basic_assignment;

public class IndicesDifference {
	public boolean isIndicesRange(int[] array, int k) 

	{

		int index,index1,difference=0;

		for(index=0;index<array.length;index++)

		{

			for(index1=index+1;index1<array.length;index1++)

			{

				if(array[index1]==array[index])

				{

					difference=index1-index;

				}

			}

		}

		if(difference<=k)

			return true;

		else

			return false;

	}

}
