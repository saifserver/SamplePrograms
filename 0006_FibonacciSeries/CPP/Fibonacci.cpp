/* Problem Statement: Fibonacci Series for 'n' numbers */
#include<iostream>

using namespace std;

int main()
{
	int num, prev, next, sum;
		
	cout << "Fibonacci Series!" <<endl;
	cout << "Enter number upto which Fibonacci series to print: ";
	cin >> num;
		
	cout << "Provided Number: "<< num <<endl;	
	cout << "- Fibonacci Series -" <<endl;
		
	prev = next = 1;
	for(int i = 1; i <= num; i++)
	{
		cout << " "<<prev;	
		sum = prev + next;
		prev = next;
		next = sum;
	}
	return 0;
}
