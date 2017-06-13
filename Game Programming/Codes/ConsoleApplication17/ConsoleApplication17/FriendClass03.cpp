#include <iostream>

using namespace std;

class Complex {
	double real, imaginary;
public:
	friend Complex add(Complex c1, Complex c2);
	Complex(double r, double i) {
		real = r;
		imaginary = i;
	}

	void output() {
		cout << real << "+" << imaginary << "i" << endl;
	}
};

Complex add(Complex c1, Complex c2) {
	return Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
}

int main() {
	Complex c1(1, 2), c2(3, 4);
	Complex c3 = add(c1, c2);
	c3.output();
	return 0;
}