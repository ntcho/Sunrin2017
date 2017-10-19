#include <iostream>

using namespace std;

class Example{
	int num;
public:
	Example(int n) : num(n) {
		cout << "num = " << num << ", ";
		cout << "address = " << this << endl;
	}

	void showData() {
		cout << num << endl;
	}

	Example* getExamplePointer() {
		return this;
	}
};

int main(void) {
	Example ex1(100);
	Example* ptr1 = ex1.getExamplePointer();
	cout << ptr1 << ", ";
	ptr1->showData();

	Example ex2(200);
	Example* ptr2 = ex2.getExamplePointer();
	cout << ptr2 << ", ";
	ptr2->showData();

	return 0;
}