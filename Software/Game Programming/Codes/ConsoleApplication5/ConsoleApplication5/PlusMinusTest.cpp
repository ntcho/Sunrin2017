#include <iostream>

using namespace std;

// simple pointer test

int main(void) {
	int a = 100;
	int *p = &a;

	cout << p << endl;
	cout << ++p << endl;
	cout << ++p << endl;
	cout << ++p << endl;

	// to note:
	// the pointer value increases with the pointer type size
	// above is the example, the pointer value increases with 4 bytes (sizeof(int) is 4)

	// to note:
	// about initializing the pointer variable
	// should initialize with value 0 or null value
	// using uninitialized pointer has extremely high chance to get wrong values 

	return 0;
}