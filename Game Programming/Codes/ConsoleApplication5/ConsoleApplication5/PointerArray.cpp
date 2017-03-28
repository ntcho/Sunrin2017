#include <iostream>

using namespace std;

int main(void) {
	const int STUDENTS = 5;
	int grade[STUDENTS] = { 10, 20, 30, 40, 50 };

	cout << "Print by value : " << endl;

	for (int i = 0; i < STUDENTS; i++) {
		cout << grade[i] << " ";
	}

	cout << endl << "Print by pointer : " << endl;

	for (int *p = grade, *pEnd = grade + STUDENTS; p != pEnd; p++) {
		// *p points at the first value of grade[]
		// *pEnd points at the final value of grade[]
		// repeats until *p isn't *pEnd
		// and prints it
		cout << *p << " ";
	}

	cout << endl;

	return 0;
}