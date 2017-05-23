#include <iostream>

using namespace std;

class Car{
public:
	int speed;
	int speedUp() {
		speed += 10;
		return speed;
	}
};

void main() {
	Car *myCar = new Car;
	myCar->speed = 100;
	cout << "증가된 자동차의 속도: " << myCar->speedUp() << endl;
}