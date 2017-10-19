#include <iostream>

using namespace std;

int main(void) {
	int i;

	char menu[5][10] = {
		"init",
		"open",
		"close",
		"read",
		"write"
	};

	for (i = 0; i < 5; i++) {
		cout << i << " Menu is: " << menu[i] << endl;
	}

	char *p[4] = { "January", "Febuary", "March", "April" };

	for (i = 0; i < 4; i++){
		cout << i + 1 << " = " << p[i] << endl;
	}
}