#include <iostream>

using namespace std;

class NoPersonException {
	int persons;
public:
	NoPersonException(int p) {
		persons = p;
	}

	int getPersons() {
		return persons;
	}
};

int main() {
	int pizzaSlices = 0;
	int personCount = 0;
	int slicesPerPerson = 0;

	try {
		cout << "Enter pizza slice count : ";
		cin >> pizzaSlices;
		cout << "Enter person count : ";
		cin >> personCount;

		if (personCount <= 0) {
			throw NoPersonException(personCount);
		}

		slicesPerPerson = pizzaSlices / personCount;
		cout << "Slices per person is " << slicesPerPerson << endl;
	}
	catch (NoPersonException e) {
		cout << "Person is " << e.getPersons() << endl;
	}
}