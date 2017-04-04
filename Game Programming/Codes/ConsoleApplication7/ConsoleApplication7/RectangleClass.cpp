#include <iostream>
#include <string>

using namespace std;

class Rectangle {
private:
	int width;
	int height;
public:
	void setWidth(int w) {
		width = w;
	}
	void setHeight(int h) {
		height = h;
	}
	int getWidth() {
		return width;
	}
	int getHeight() {
		return height;
	}
	int getArea() {
		return width * height;
	}
};

int main() {
	Rectangle rect;
	rect.setHeight(5);
	rect.setWidth(3);
	cout << "Area of width " << rect.getWidth() << " x height " << rect.getHeight() << " is " << rect.getArea() << endl;

	return 0;
}