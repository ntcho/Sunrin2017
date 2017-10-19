#include <iostream>

using namespace std;

int main(void) {
	const int COUNT = 5;
	int arr[COUNT] = { 1, 2, 3 };
	// initialized by [1, 2, 3, 0, 0]
	// uninitialized array items are initialized to 0

	for (int i = 0; i < COUNT; i++) {
		cout << arr[i] << " ";
	}

	return 0;
}