import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInputBuffer
{
	public static void main(String []args) throws Exception
	{
   		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name;
			
		System.out.println("What's your name?");
		name = reader.readLine();
		System.out.println("Hello "+ name +".");
    	
		reader.close();
  	}
}
