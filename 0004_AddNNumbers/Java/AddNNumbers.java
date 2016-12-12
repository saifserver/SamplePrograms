/* Problem Statement: Addition of first 'n' numbers; where 'n' numbers is provided by the user */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddNNumbers
{
	public static void main(String []args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int user_input; 
		int count = 0;
		
		System.out.println("Addition of First 'n' numbers!");
		System.out.print("Enter 'until' number you want to add: ");
		user_input = Integer.parseInt(br.readLine());
		
		for(int i = 0; i <= user_input; i++ )
		{
			count = count + i;
		}
		
		System.out.println("Addition of first "+ user_input +" numbers is: "+count);
	}
}
