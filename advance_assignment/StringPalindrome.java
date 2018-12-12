package Basic_assignment;

import java.util.HashSet;
import java.util.Set;

public class StringPalindrome {
	
public String reversePalindrome(String str)
{
	 
	String input =str;      
    if (input.length() <= 1) 
    {
        return "not a palindrome";
    }
    else
    {   
        int length = input.length();            
        Set<String> set = new HashSet<String>();
        for (int i = 0; i <length; i++)
        {
            //if(i==0)
            for (int j=i+1;j<length+1;j++) 
            {
                String s = input.substring(i, j);                   
                StringBuffer sb = new StringBuffer(s);
                sb.reverse();

                if(s.equals(sb.toString()) && s.length()>1)
                {                       
                   Boolean word=set.add(s);
                }
            }
        }           
        return word;
    }
	
	 
}
}
