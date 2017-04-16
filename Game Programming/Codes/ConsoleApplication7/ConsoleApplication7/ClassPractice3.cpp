#include <iostream>
#include <string>

using namespace std;

class Car {
public:
	int getSpeed();
	void setSpeed(int s);
	void honk();

private:
	int speed;
};

int Car::getSpeed() {
	return speed;
}

void Car::setSpeed(int s) {
	speed = s;
}

void Car::honk() {
	cout << "honk" << endl;
}

int main() {
	Car myCar;

	myCar.setSpeed(80);
	myCar.honk();
	
	cout << "Current speed : " << myCar.getSpeed() << endl;

	return 0;
}