#include <iostream>

using namespace std;

template <class T>
void mcopy(T a1[], T a2[], int length) {
	for (int i = 0; i < length; i++) {
		a2[i] = (T)a1[i];
	}
}

template <class T>
void print(T a[], int length) {
	for (int i = 0; i < length; i++) {
		cout << a[i] << " ";
	}
	cout << endl;
}

int main() {
	int x[] = { 1, 2, 3, 4, 5 }, y[5];
	char c[5] = { 'H', 'e', 'l', 'l', 'o' }, d[5];

	mcopy(x, y, 5);
	mcopy(c, d, 5);

	print(y, 5);
	print(d, 5);

	return 0;
}