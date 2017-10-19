#include<iostream>
using namespace std;
class Car {
	int speed;
public:
	Car(int sp) : speed(sp) {}
	void print() {
		cout << "speed" << endl;
	}
};
void main() {
	Car c1(1), c2(3);
	c1.print();
	c2.print();
}