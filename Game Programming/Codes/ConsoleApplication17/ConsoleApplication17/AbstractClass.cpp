#include <iostream>

using namespace std;

class Calculator {
	void input() {
		cout << "Enter two integers : ";
		cin >> a >> b;
	}
protected:
	int a, b;
	// pure virtual function
	virtual int calc(int a, int b) = 0;
public:
	void run() {
		input();
		cout << "Calculated value : " << calc(a, b) << endl;
	}
};

class Adder : public Calculator {
	int calc(int a, int b) {
		return a + b;
	}
};

class Substractor : public Calculator {
	int calc(int a, int b) {
		return a - b;
	}
};

int main() {
	Adder adder;
	Substractor substractor;

	adder.run();
	substractor.run();
}