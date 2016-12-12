/* Problem Statement: Program for Factorial of Given Number */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Factorial
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number;
		int fact = 1;
		
		System.out.println("Factorial of Number!");
		System.out.print("Enter a number: ");
		number = Integer.parseInt(br.readLine());
		
		if ( number < 0 )
		{
			System.out.println("Number should be non-negative.");
		}
		else
		{
			for (int c = 1 ; c <= number ; c++ )
			{
				fact = fact*c;
			}
			
			System.out.println("Factorial of "+ number +" is = "+fact);
		}
	}
}
