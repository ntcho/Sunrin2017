#include <iostream>

using namespace std;

int main() {
	int a = 10, b = 20, c = 30;

	const int *p = &a;
	cout << *p;

	p = &b;
	cout << ' ' << *p << endl;

	int * const q = &b;
	cout << *q;

	*q = c;
	cout << ' ' << *q << endl;
	return 0;
}