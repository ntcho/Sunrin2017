#include <iostream>
#include <string>

using namespace std;

class Car{
public:
	int speed;
	int gear;
	string color;

	void setGear(int newGear) {
		gear = newGear;
	}

	void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	void speedUp(int increment) {
		speed += increment;
		cout << "Speed : " << speed << endl;
	}

	void speedDown(int decrement) {
		speed -= decrement;
		cout << "Speed : " << speed << endl;
	}
};

class SportsCar : public Car {
	bool turbo;
public:
	void setTurbo(bool newValue) {
		turbo = newValue;
	}
};

int main() {
	SportsCar c;
	c.color = "Red";
	c.setGear(3);
	c.setSpeed(100);
	c.speedUp(100);
	c.speedDown(30);
	c.setTurbo(true);

	return 0;
}