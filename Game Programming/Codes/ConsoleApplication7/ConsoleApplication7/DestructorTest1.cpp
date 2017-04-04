#include <iostream>
#include <string>

using namespace std;

class Car {
private:
	int speed;
	int gear;
	string color;
public:
	Car() {
		cout << "Constructor called" << endl;
	}
	~Car() {
		cout << "Destructor called" << endl;
	}
};

int main() {
	Car c1;

	return 0;
}