#include<iostream>

using namespace std;

class Shape {
protected:
	int x, y;
public:
	void setOrigin(int x, int y) {
		this->x = x;
		this->y = y;
	}

	virtual void draw() {
		cout << "Shape draw" << endl;
	}
};

class Rectangle : public Shape {
	int width, height;
public:
	void setWidth(int w) {
		width = w;
	}

	void setHeight(int h) {
		height = h;
	}

	void draw() {
		cout << "Rectangle draw" << endl;
	}
};

class Circle : public Shape {
	int radius;
public:
	void setRadius(int r) {
		radius = r;
	}

	void draw() {
		cout << "Circle draw" << endl;
	}
};

class Triangle : public Shape {
private:
	int base, height;
public:
	void setBase(int b) {
		base = b;
	}

	void setHeight(int h) {
		height = h;
	}

	void draw() {
		cout << "Triangle draw" << endl;
	}
};

void main() {
	cout << "Repeated initializer" << endl;

	Shape *ps = new Rectangle;
	ps->draw();
	delete ps;

	Shape *ps1 = new Circle;
	ps1->draw();
	delete ps1;

	Shape *ps2 = new Triangle;
	ps2->draw();
	delete ps2;

	cout << endl;
	cout << "For loop initializer" << endl;

	Shape *shapeArray[3];

	shapeArray[0] = new Rectangle();
	shapeArray[1] = new Triangle();
	shapeArray[2] = new Circle();

	for (Shape *shape : shapeArray) {
		shape->draw();
	}

	cout << endl;
}