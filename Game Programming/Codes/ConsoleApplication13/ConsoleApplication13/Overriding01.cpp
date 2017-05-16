#include<iostream>

using namespace std;

class PassangerCar{
public:
	int seats;
	PassangerCar() {
		seats = 4;
	}
};

class Truck{
public:
	int payload;
	Truck(){
		payload = 10000;
	}
};

class PickUp : public PassangerCar, public Truck{
public:
	int tow_capability;
	PickUp(){
		tow_capability = 30000;
	}
};

int main(){

	PickUp myCar;

	cout << myCar.seats << endl;
	cout << myCar.payload << endl;
	cout << myCar.tow_capability << endl;

	return 0;
}