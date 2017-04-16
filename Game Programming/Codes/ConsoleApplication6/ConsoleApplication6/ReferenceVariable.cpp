#include <iostream>

using namespace std;

int main() {
	int var;
	int &ref = var;

	var = 10;
	cout << "Value of var = " << var << endl;
	cout << "Value of ref = " << ref << endl;

	ref = 20;
	cout << "Value of var = " << var << endl;
	cout << "Value of ref = " << ref << endl;

	return 0;
}