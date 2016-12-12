
int main()
{
	AOpr obj;
	char ans;
	int choice, a, b, result;
	cout << "Arithmetic Operations on Two Numbers" <<endl;
	do
	{
		cout << "Press 1: Addition" <<endl;;
		cout << "Press 2: Subtraction" <<endl;
		cout << "Press 3: Multiplication" <<endl;
		cout << "Press 4: Division" <<endl;
		cout << "Press 5: Quit" <<endl;
		cout << ": ";
		cin >> choice;
			
		switch(choice)
		{
		case 1:
			cout << "Enter First Number: ";
			cin >> a;
			cout << "Enter Second Number: ";
			cin >> b;
			result = obj.add(a, b);
			cout << "Addition of " << a << " and " << b << " is: " << result << endl;
			break;

		case 2:
			cout << "Enter First Number: ";
			cin >> a;
			cout << "Enter Second Number: ";
			cin >> b;
			result = obj.sub(a, b);
			cout << "Subtraction of " << a << " and " << b << " is: " << result << endl;
			break;
				
		case 3:
			cout << "Enter Multiplicand: ";
			cin >> a;
			cout << "Enter Multiplier: ";
			cin >> b;
			result = obj.mult(a, b);
			cout << "Multiplication of " << a << " and " << b << " is: " <<result <<endl;
			break;
				
		case 4:
			cout << "Enter Dividend: ";
			cin >> a;
			cout << "Enter Divisor: ";
			cin >> b;
			result = obj.div(a, b);
			cout << "Division of " << a << " and " << b << " is: " <<result <<endl;
			break;
				
		case 5:
			return 0;
			break;
				
		default:
			cout << "Wrong choice entered!! PLease try again.." <<endl;
			break;
		}
			
		cout << "Do you want to continue?" <<endl;
		cout << "(Y/N): ";
		cin >> ans;
	}
	while(ans == 'y' || ans == 'Y');
}
