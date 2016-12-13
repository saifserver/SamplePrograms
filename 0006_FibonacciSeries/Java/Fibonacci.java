/* Problem Statement: Fibonacci Series for 'n' numbers */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci
{
	
	public static void main(String []args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, prev, next, sum;
		
		System.out.println("Fibonacci Series!");
		System.out.println("Enter number upto which Fibonacci series to print: ");
		num = Integer.parseInt(br.readLine());
		
		System.out.println("Provided Number: "+num);	
		System.out.println("- Fibonacci Series -");
		
		prev = next = 1;
		for(int i = 1; i <= num; i++)
		{
			System.out.print(" "+prev);	
			sum = prev + next;
			prev = next;
			next = sum;
		}
	}
}
