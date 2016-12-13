/* Problem Statement: Palindrome check of String and Number */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome
{
	static void pString(StringBuffer user_input)
	{
		
		StringBuffer rev = new StringBuffer(user_input);
		rev.reverse();
		
		if(String.valueOf(user_input).compareTo(String.valueOf(rev)) == 0)
		{
			System.out.println(user_input + " is a palindrome.");
		}
		else
		{
			System.out.println(user_input + " is not a palindrome.");
		}
	}
	
	static void pNumber(int user_input)
	{
		
		int temp = user_input;
		int rev = 0, rem;
		
		while(temp > 0)
		{
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		
		if(rev == user_input)
		{
			System.out.println(user_input + " is a palindrome.");
		}
		else
		{
			System.out.println(user_input + " is not a palindrome.");
		}
	}
	
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		String ans;
		do
		{
			System.out.println("Palindrome Check!");
			System.out.println("Press 1: Palindrome String");
			System.out.println("Press 2: Palindrome Number");
			System.out.println("Press 3: Quit");
			System.out.print(": ");
			choice = Integer.parseInt(br.readLine());
			
			switch(choice)
			{
			case 1:
				StringBuffer user_inputString = new StringBuffer();
				System.out.print("Enter a String: ");
				user_inputString.append(br.readLine());
				pString(user_inputString);
				break;
		
			case 2:
				int user_inputNumber;
				System.out.println("Enter a Number: ");
				user_inputNumber = Integer.parseInt(br.readLine());
				pNumber(user_inputNumber);
				break;
			
			case 3:
				System.exit(0);
				break;
				
			default:
				System.out.println("Wrong choice entered!! Please try again..");
				break;
			}
			
			System.out.println("Do you want to continue?");
			System.out.print("(Y/N): ");
			ans = br.readLine();			
		}
		while(ans.toLowerCase().equals("y"));
	}
}
