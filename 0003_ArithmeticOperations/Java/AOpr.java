/* Problem Statement: Program for Arithmetic Operations using various methods */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AOpr 
{
	static int add(int x, int y)
	{
		int add = x + y;
		return add;
	}
	
	static int sub(int x, int y)
	{
		int sub = x - y;
		return sub;
	}
	
	static int mult(int x, int y)
	{
		int mult = x * y;
		return mult;
	}
	
	static int div(int x, int y)
	{
		int div = x / y;
		return div;
	}
	
	public static void main(String []args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ans;
		int choice, a, b, result;
		System.out.println("Arithmetic Operations on Two Numbers");
		do
		{
			System.out.println("Press 1: Addition");
			System.out.println("Press 2: Subtraction");
			System.out.println("Press 3: Multiplication");
			System.out.println("Press 4: Division");
			System.out.println("Press 5: Quit");
			System.out.print(": ");
			choice = Integer.parseInt(br.readLine());
			
			switch(choice)
			{
			case 1:
				System.out.print("Enter First Number: ");
				a = Integer.parseInt(br.readLine());
				System.out.print("Enter Second Number: ");
				b = Integer.parseInt(br.readLine());
				result = add(a, b);
				System.out.println("Addition of " + a + " and "+ b +" is: "+result);
				break;
				
			case 2:
				System.out.print("Enter First Number: ");
				a = Integer.parseInt(br.readLine());
				System.out.print("Enter Second Number: ");
				b = Integer.parseInt(br.readLine());
				result = sub(a, b);
				System.out.println("Subtraction of " + a + " and "+ b +" is: "+result);
				break;
				
			case 3:
				System.out.print("Enter Multiplicand: ");
				a = Integer.parseInt(br.readLine());
				System.out.print("Enter Multiplier: ");
				b = Integer.parseInt(br.readLine());
				result = mult(a, b);
				System.out.println("Multiplication of " + a + " and "+ b +" is: "+result);
				break;
				
			case 4:
				System.out.print("Enter Dividend: ");
				a = Integer.parseInt(br.readLine());
				System.out.print("Enter Divisor: ");
				b = Integer.parseInt(br.readLine());
				result = div(a, b);
				System.out.println("Division of " + a + " and "+ b +" is: "+result);
				break;
				
			case 5:
				System.exit(0);
				break;
				
			default:
				System.out.println("Wrong choice entered!! PLease try again..");
				break;
			}
			
			System.out.println("Do you want to continue?");
			System.out.print("(Y/N): ");
			ans = br.readLine();
			
		}
		while(ans.toLowerCase().equals("y"));
	}
	
}
