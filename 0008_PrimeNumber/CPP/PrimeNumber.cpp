/* Problem Statement: Program to print prime number and check whether prime number or not */
#include<iostream>
#include<math.h>

using namespace std;

class PrimeNumber
{
public:
	void printPrime(int user_input);
	void checkPrime(int user_input);
};

void PrimeNumber :: printPrime(int user_input)
{
	int temp = user_input;
	int num = 3, status = 1;
	if(temp >= 1)
    	{
        	cout << "First "<< temp <<" prime numbers are -" <<endl;
        	cout << " " <<2;
    	}
 
    	for(int count = 2; count <= temp;)
    	{
    		for(int j = 2; j <= sqrt(num); j++)
        	{
    			if(num % j == 0)
            		{
               			status = 0;
               			break;
            		}
        	}

        	if(status != 0)
        	{
        		cout << " " <<num;
            		count++;
        	}
        	status = 1;
        	num++;
	        
    	}
    	cout << endl;
}
	
void PrimeNumber :: checkPrime(int user_input)
{
	int temp = user_input;
	int flag = 1;
	
	for(int i=2; i < temp; i++)
	{
		if(temp % i == 0)
		{
			flag = 0;
			break;
		}
	}
		
	if(flag)
		cout << temp <<" is a Prime Number." <<endl;
	else
		cout << temp <<" is not a Prime Number." <<endl;
}

int main()
{
	PrimeNumber obj;
	int choice, num, check;
	char ans;
	do
	{
		cout << "Prime Numbers!" <<endl;
		cout << "Press 1: Print Prime Numbers" <<endl;
		cout << "Press 2: Check Prime Number" <<endl;
		cout << "Press 3: Quit" <<endl;
		cout << ": ";
		cin >> choice;
		
		switch(choice)
		{
		case 1:
			cout << "How many prime numbers you want?" <<endl;
			cin >> num;
			obj.printPrime(num);
			break;
		
		case 2:
			cout << "Enter number for prime check: ";
			cin >> check;
			obj.checkPrime(check);
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
