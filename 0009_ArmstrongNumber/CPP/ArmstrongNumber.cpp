/* Problem Statement: Program to print armstrong number and check whether armstrong number or not */
#include<iostream>

using namespace std;

class ArmstrongNumber
{
public:
	void printArmstrong(int user_input);
	void checkArmstrong(int user_input);
};

void ArmstrongNumber :: printArmstrong(int user_input)
{
	int temp = user_input;
	int num, rem, qub, sum;
	cout << "First "<< temp <<" armstrong numbers are - " <<endl;
	for(int i = 1; i <= temp; i++)
	{
		num = i;
		sum = 0;
		
		while(num > 0)
		{
			rem = num % 10;
			qub = rem * rem * rem;
			sum = sum + qub;
			num = num / 10;
		}
		
		if(sum == i)
		{
			cout << " " <<sum;
		}
	}
	cout << endl;
}
	
void ArmstrongNumber :: checkArmstrong(int user_input)
{
	int temp = user_input;
	int sum = 0, rem;
		
	while( temp != 0 )
	{
		rem = temp % 10;
		sum = sum + rem * rem * rem;
		temp = temp / 10;
	}

	if(user_input == sum)
		cout << user_input <<" is an Armstrong Number." <<endl;
	else
		cout << user_input <<" is not an Armstrong Number." <<endl;
}

int main()
{
	ArmstrongNumber obj;
	int choice, num, check;
	char ans;
	do
	{
		cout << "Armstrong Numbers!" <<endl;
		cout << "Press 1: Print Armstrong Numbers" <<endl;
		cout << "Press 2: Check Armstrong Number" <<endl;
		cout << "Press 3: Quit" <<endl;
		cout << ": ";
		cin >> choice;
		
		switch(choice)
		{
		case 1:
			cout << "How many armstrong numbers you want?" <<endl;
			cin >> num;
			obj.printArmstrong(num);
			break;
		
		case 2:
			cout << "Enter number for armstrong check: ";
			cin >> check;
			obj.checkArmstrong(check);
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
