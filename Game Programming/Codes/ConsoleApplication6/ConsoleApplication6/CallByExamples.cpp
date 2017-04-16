#include <iostream>

using namespace std;

void swap(int &rx, int &ry) {
	int tmp;
	tmp = rx;
	rx = ry;
	ry = tmp;
}

int main() {
	int a = 100, b = 200;

	cout << "before calling swap(), a = " << a << " b = " << b << endl;
	swap(a, b);
	cout << "before calling swap(), a = " << a << " b = " << b << endl;

	return 0;
}