package Basic_assignment;

import java.util.StringTokenizer;

public class RemoveDuplicateWordsInString {
	public String RemoveDuplicatesBasedOnIndex(String word,String deleteWord,int indexPosition)
	{
		word = word.toUpperCase();
		deleteWord=deleteWord.toUpperCase();
        int length = word.length();
        char last = word.charAt(length-1); // Extracting the last character
 
         if(last != '.' && last != '?' && last != '!')
        {
        	 return "Invalid Input"; 
}
        else
        {
            StringTokenizer str = new StringTokenizer(word," .?!");
            int c = str.countTokens();
            String w="",ans = "";
            String del = deleteWord;
            int x =indexPosition;
 
            if(x<1 || x>c) // Checking whether integer inputed is acceptable or not
            {
                return "Entered position is out of range";
            }
            else
            {      
                for(int i=1; i<=c; i++)
                {
                    w = str.nextToken();
                    /* Skipping if the word to delete and the position matches */
                    if(w.equals(del)==true && i == x)
                        continue;
                    ans = ans + w + " ";
                }
               return ans.trim()+last;
            }
        }
	}

}
