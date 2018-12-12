package Basic_assignment;

public class MultidimentionalArray {
	public boolean searchNumber(int Number, int[][] array)

	{

		boolean result=false;

		for(int i = 0;i < array.length;i++)

		{

			for(int j = 0;j < array[0].length; j++)

			{

				if(array[i][j]== Number)

				{

					result = true;

				}

			}

		}

		return result;

	}

}
