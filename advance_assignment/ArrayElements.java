package Basic_assignment;

public class ArrayElements {
	public int countElements(String[] names, String comparenames) {

		int count=0;

		for(int i=0;i<names.length;i++){



			if(comparenames.equals(names[i])){



				count++;



			}



		}

		return count;

	}
}
