package Basic_assignment;

public class ReverseString
{
			public String reverseWord(String str)
			{  
				String words[]=str.split("\\s");  
				String reverseWord="";  
				for(String word:words){  
		        StringBuilder originalWord=new StringBuilder(word);  
		        originalWord.reverse();  
		        reverseWord+=originalWord.toString()+" ";  
		    }  
		    return reverseWord.trim();  
		}  
		}  


