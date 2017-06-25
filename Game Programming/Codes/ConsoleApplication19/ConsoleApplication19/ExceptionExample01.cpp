#include <iostream>

using namespace std;

int stringToInt(char x[]) {
	int sum = 0, len = strlen(x);
	for (int i = 0; i < len; i++) {
		if (x[i] >= '0' && x[i] <= '9') {
			sum = sum * 10 + (x[i] - '0');
		}
		else {
			throw x;
		}
	}
}

int main() {
	int n;

	try {
		n = stringToInt("123");
		cout << n << endl;
	}
	catch (exception) {
		cout << "Error" << endl;
	}
	return 0;
}