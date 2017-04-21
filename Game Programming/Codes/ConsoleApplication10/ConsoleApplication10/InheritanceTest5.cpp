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
	Shape(int xloc, int yloc) :x(xloc), y(yloc) {
		cout << "Shape Initializer(xloc, yloc)" << endl;
	}
	~Shape() {
		cout << "Shape Destructor()" << endl;
	}
};

class Rectangle : public Shape {
	int width;
	int height;
public:
	Rectangle(int x = 0, int y = 0, int w = 0, int h = 0);
	~Rectangle() {
		cout << "Rectangle Destuctor()" << endl;
	}
};

Rectangle::Rectangle(int x, int y, int w, int h):Shape(x, y) {
	width = w;
	height = h;
	cout << "Rectangle Initializer(x,y,w,h)" << endl;
}

int main() {
	Rectangle r;

	return 0;
}