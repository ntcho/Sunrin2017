#include <iostream>

using namespace std;

bool IsPositive(int num) {
	if (num < 0) {
		return false;
	}
	else {
		return true;
	}
}

int main(void) {
	bool isPositive;
	int num;
	cout << "Input number : ";
	cin >> num;

	isPositive = IsPositive(num);
	if (isPositive) {
		cout << "Positive number" << endl;
	}
	else {
		cout << "Negative number" << endl;
	}

	return 0;
}