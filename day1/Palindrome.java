

public class Palindrome
{
	public void isPalindrome(int number)
	{
		int temporaryNumber=number;
		int sum=0;
		if(number>=10)
		{
			while(number!=0)
			{
				int remainder=number%10;
				sum=sum*10+remainder;
				number=number/10;
			}
		}
			if(sum==temporaryNumber)
			{
			System.out.println("it is a palindrome");
			}
		else
		System.out.println("not a palindrome");
	
	}

	public static void main(String[] args)
	{
		Palindrome pal=new Palindrome();
		pal.isPalindrome(121);
	}

}