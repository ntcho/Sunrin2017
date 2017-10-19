#include <iostream>

using namespace std;

class Car{
public:
	int getHp() {
		return 100;
	}
};

class SportsCar : public Car{
public:
	int getHp() {
		return 1000;
	}
};

int main() {
	SportsCar sc;
	// call the parent class by [variable].[ParentClass]::[parentVariable] syntax
	cout << "HP (Parent) : " << sc.Car::getHp() << endl;
	cout << "HP (Child)  : " << sc.getHp() << endl;
}