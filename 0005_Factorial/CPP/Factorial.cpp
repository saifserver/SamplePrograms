/* Problem Statement: Programs for Factorial of Given Number */
#include<iostream>

using namespace std;

int main()
{
	int number;
	int fact = 1;

	cout << "Factorial of Number!" <<endl;
	cout << "Enter a number: ";
	cin >> number;
		
	if ( number < 0 )
	{
		cout << "Number should be non-negative." <<endl;
	}
	else
	{
		for (int c = 1 ; c <= number ; c++ )
		{
			fact = fact*c;
		}
		
		cout << "Factorial of "<< number <<" is = "<<fact <<endl;
	}
	return 0;
}
