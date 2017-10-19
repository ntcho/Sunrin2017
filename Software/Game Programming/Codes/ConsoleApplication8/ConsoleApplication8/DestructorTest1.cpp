#include <iostream>
#include <string>

using namespace std;

class Car {
private:
	int speed;
	int gear;
	string color;
public:
	Car(int s, int g, string c);
	Car(string c);
	void print();
};

Car::Car(int s, int g, string c) : speed(s), gear(g), color(c) {
	cout << "Called a initializer with three arguments" << endl;
}

Car::Car(string c) {
	cout << "Called a initializer with an argument" << endl;
	new (this) Car(0, 0, c);
}

void Car::print() {
	// prints the class member variables
	cout << endl;
	cout << "Speed : " << speed << endl;
	cout << "Gear  : " << gear << endl;
	cout << "Color : " << color << endl;
	cout << endl;
}

int main() {
	Car c1("White");
	c1.print();

	return 0;
}