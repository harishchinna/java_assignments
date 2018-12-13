package Basic_assignment;

public class RemoveDuplicates {
	public String removeDuplicateLetters(String word1) {

		String afterRemovingDuplicates ="";
		int size=word1.length();
		for(int position = 0;position<size;position++)

		{
			 if(!afterRemovingDuplicates.contains(String.valueOf(word1.charAt(position)))) 
			 {

				 afterRemovingDuplicates+= String.valueOf(word1.charAt(position));  

			 }
		}

		return afterRemovingDuplicates;

	}
}
