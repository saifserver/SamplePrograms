/* Problem Statement: Palindrome check of String and Number */
#include <iostream>
#include <string.h>
using namespace std;

class Palindrome
{
public:
	void pString(char user_input[]);
	void pNumber(int user_input);
};
	
void Palindrome :: pString(char user_input[])
{
	int length = strlen(user_input);
	int flag = 0;
	for(int i=0; i < length; i++)
	{
		if(user_input[i] != user_input[length-i-1])
		{
			flag = 1;
			break;
		}
	}
		
	if (flag)
	{
		cout << user_input << " is not a palindrome." << endl; 
	}    
	else 
	{
		cout << user_input << " is a palindrome." << endl; 
	}	
}
	
void Palindrome :: pNumber(int user_input)
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
		cout << user_input << " is a palindrome." << endl;
	}    
	else 
	{
		cout << user_input << " is not a palindrome." << endl;
	}	
}
	
int main()
{
	Palindrome obj;
	int choice;
	char ans;
	do
	{
		cout << "Palindrome Check!" <<endl;;
		cout << "Press 1: Palindrome String" <<endl;
		cout << "Press 2: Palindrome Number" <<endl;
		cout << "Press 3: Quit" <<endl;
		cout << ": ";
		cin >> choice;
			
		switch(choice)
		{
		case 1:
			char user_inputString[20];
			cout << "Enter a String: ";
			cin >> user_inputString;
			obj.pString(user_inputString);
			break;
		
		case 2:
			int user_inputNumber;
			cout << "Enter a Number: ";
			cin >> user_inputNumber;
			obj.pNumber(user_inputNumber);
			break;
		
		case 3:
			return 0;
			break;
				
		default:
			cout << "Wrong choice entered!! Please try again.." <<endl;
			break;
		}
			
		cout << "Do you want to continue?" <<endl;
		cout << "(Y/N): ";
		cin >> ans;			
	}
	while(ans == 'y' || ans == 'Y');
}
