#include <iostream>

using namespace std;

class InvalidInputException {
public:
	InvalidInputException() {
		cout << "Negative value input" << endl;
	}
};

class DivideByZeroException {
public:
	DivideByZeroException() {
		cout << "Divided by zero" << endl;
	}
};

int main() {
	int x, y;
	try {
		cout << "Enter two positive integers : ";
		cin >> x >> y;
		if (x < 0 || y < 0) {
			throw InvalidInputException();
		}
		if (y == 0) {
			throw DivideByZeroException();
		}
		
		cout << (double)x / (double)y << endl;
	} 
	catch (DivideByZeroException &e) {

	}
	catch (InvalidInputException &e) {

	}

	return 0;
}