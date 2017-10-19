#include <iostream>

using namespace std;

int main(void) {
	int year;
	cin >> year;

	// simple program for calculting input year is leap year or not
	// used to train logical gates

	if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
		cout << "Its leap year" << endl;
	}
	else {
		cout << "Its normal year" << endl;
	}

	return 0;
}