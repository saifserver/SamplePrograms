import java.util.Scanner;

public class UserInputScanner
{
	public static void main(String []args)
	{
		Scanner user_input = new Scanner(System.in);
		String name;
		
		System.out.println("What's your name?");
		name = user_input.next();
		
		System.out.println("Hello "+ name +".");
	}
}
