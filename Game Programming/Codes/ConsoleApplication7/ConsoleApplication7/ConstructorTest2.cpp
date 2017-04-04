#include <iostream>
#include <string>

using namespace std;

class Car {
private:
	int speed;
	int gear;
	string color;
public:
	Car(int s, int g, string c) {
		speed = s;
		gear = g;
		color = c;
	}
	void print() {
		cout << endl;
		cout << "Speed : " << speed << endl;
		cout << "Gear  : " << gear << endl;
		cout << "Color : " << color << endl;
		cout << endl;
	}
};

int main() {
	Car c1(0, 1, "red");
	Car c2(0, 1, "blue");

	c1.print();
	c2.print();

	return 0;
}