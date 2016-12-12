/* Problem Statement: Addition of first 'n' numbers; where 'n' numbers is provided by the user */
#include<iostream>

using namespace std;

int main()
{
		int user_input; 
		int count = 0;
		
		cout << "Addition of First 'n' numbers!" <<endl;
		cout << "Enter 'until' number you want to add: ";
		cin >> user_input;
		
		for(int i = 0; i <= user_input; i++ )
		{
			count = count + i;
		}
		
		cout << "Addition of first "<< user_input <<" numbers is: "<<count <<endl;
}
