#include <iostream>
#include <string>

using namespace std;

class Point {
private:
	int x;
	int y;
public:
	void set(int x, int y) {
		this->x = x;
		this->y = y;
	}
	void showPoint() {
		cout << "( " << x << ", " << y << " )" << endl;
	}
};

class ColorPoint : public Point {
private:
	string color;
public:
	void setColor(string color) {
		this->color = color;
	}
	void showColorPoint() {
		cout << "Color : " << color << endl;
		showPoint();
	}
};

int main() {
	ColorPoint cp;
	cp.set(3, 4);
	cp.setColor("Red");
	cp.showColorPoint();

	return 0;
}