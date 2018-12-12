package Basic_assignment;

public class MissingValue {
	
	

	public int missValues(int array[]) {
		int actualTotal=0;
		int currentTotal=0;
		for(int count=0;count<array.length;count++)
		{
			currentTotal +=array[count];
		}
		actualTotal=(array.length*(array.length+1))/2;
		actualTotal -=currentTotal;
		return actualTotal;
	}

	
}
