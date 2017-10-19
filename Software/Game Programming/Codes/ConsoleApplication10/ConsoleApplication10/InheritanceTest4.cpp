#include <iostream>
#include <string>

using namespace std;

class Shape {
private:
	int x;
	int y;
public:
	Shape() {
		cout << "Shape Initializer()" << endl;
	}
	~Shape() {
		cout << "Shape Destructor()" << endl;
	}
};

class Rectangle : public Shape {
	int width;
	int height;
public:
	Rectangle() {
		cout << "Rectangle Initializer()" << endl;
	}
	~Rectangle() {
		cout << "Rectangle Destuctor()" << endl;
	}
};

int main() {
	Rectangle r;

	return 0;
}