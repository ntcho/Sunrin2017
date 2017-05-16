#include <iostream>

using namespace std;

class ParentClass {
public:
	void print() {
		cout << "Parent class print()" << endl;
	}
};

class ChildClass : public ParentClass {
public:
	void print() {
		// this function overrides the Parent Class' print()
		cout << "Child class print()" << endl;
	}
};

void main() {
	ChildClass obj;
	obj.print();
	obj.ParentClass::print();
}