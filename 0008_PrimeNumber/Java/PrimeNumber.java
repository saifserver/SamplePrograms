/* Problem Statement: Program to print prime number and check whether prime number or not */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber
{
	static void printPrime(int user_input)
	{
		int temp = user_input;
		int num = 3, status = 1;
		if(temp >= 1)
	    	{
	         	System.out.println("First "+ temp +" prime numbers are -");
	         	System.out.print(" "+2);
	    	}
	 
	    for(int count = 2; count <= temp;)
	    {
	    	for(int j = 2; j <= Math.sqrt(num); j++)
	        {
	    		if(num % j == 0)
	            	{
	               		status = 0;
	               		break;
	            	}
	        }
	        if(status != 0)
	        {
	        	System.out.print(" "+num);
	        	count++;
	        }
	        status = 1;
	        num++;
	        
	    }
	    System.out.println();
	}
	
	static void checkPrime(int user_input)
	{
		int temp = user_input;
		boolean flag = true;
		
		for(int i=2; i < temp; i++)
		{
			if(temp % i == 0)
			{
				flag = false;
				break;
			}
		}
		
		if(flag)
			System.out.println(temp +" is a Prime Number.");
		else
			System.out.println(temp +" is not a Prime Number.");
	}
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		String ans;
		do
		{
			System.out.println("Prime Numbers!");
			System.out.println("Press 1: Print Prime Numbers");
			System.out.println("Press 2: Check Prime Number");
			System.out.println("Press 3: Quit");
			System.out.print(": ");
			choice = Integer.parseInt(br.readLine());
			
			switch(choice)
			{
			case 1:
				System.out.println("How many prime numbers you want?");
				int num = Integer.parseInt(br.readLine());
				printPrime(num);
				break;
		
			case 2:
				System.out.print("Enter number for prime check: ");
				int check = Integer.parseInt(br.readLine());
				checkPrime(check);
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
