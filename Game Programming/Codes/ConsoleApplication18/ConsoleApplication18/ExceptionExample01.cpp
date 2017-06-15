#include <iostream>

using namespace std;

int main() {
	int pizzaSlices = 0;
	int personCount = 0;
	int slicesPerPerson = 0;

	try {
		cout << "Enter pizza slice count : ";
		cin >> pizzaSlices;
		cout << "Enter person count : ";
		cin >> personCount;

		if (personCount == 0) {
			throw personCount;
		}

		slicesPerPerson = pizzaSlices / personCount;
		cout << "Slices per person is " << slicesPerPerson << endl;
	}
	catch (int e) {
		cout << "Person is " << e << endl;
	}
}