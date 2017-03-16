#include <iostream>

using namespace std;

void sub(void) {
	int i = 0;
	static int s = 0;
	i++;
	s++;

	cout << "i == " << i << ", s == " << s << endl;
}

int main(void) {
	sub();
	sub();
	sub();

	return 0;
}