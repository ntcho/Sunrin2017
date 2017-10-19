#include <iostream>
#define LENGTH 5

using namespace std;

int main(void) {
	const double pi = 3.141592;

	cout << "Circumference of a circle that has a radius of " << LENGTH << " is " << LENGTH * 2 * pi << endl;
	cout << "Area of a circle that has a radius of " << LENGTH << " is " << LENGTH * LENGTH * pi << endl;
	return 0;
}