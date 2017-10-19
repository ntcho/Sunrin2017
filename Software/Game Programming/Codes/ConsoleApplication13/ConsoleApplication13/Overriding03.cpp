#include<iostream>

using namespace std;

class Shape{
protected:
	int x, y;

public:
	void setOrigin(int x, int y){
		this->x = x;
		this->y = y;
		cout << "Shape: " << this->x << ", " << this->y << endl;
	}
	void draw(){
		cout << "Shape Draw" << endl;
	}
};

class Rectangle :public Shape{
private:
	int width, height;
public:
	void setWidth(int w){
		width = w;
		cout << "Rectangle width: " << width << endl;
	}
	void setHeight(int h){
		height = h;
		cout << "Rectangle height: " << width << endl;
	}
	void draw(){
		cout << "Rectangle Draw" << endl;
	}
};

int main() {
	Shape *ps = new Rectangle();
	ps->setOrigin(10, 10);
	ps->draw();
	((Rectangle *)ps)->setWidth(100);
	((Rectangle *)ps)->setHeight(200);
	((Rectangle *)ps)->draw();
}