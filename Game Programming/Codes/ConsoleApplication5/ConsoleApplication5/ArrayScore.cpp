#include <iostream>

using namespace std;

int main(void) {
	const int STUDENTS = 5;
	int grade[STUDENTS];
	int sum = 0;
	int i, average;

	for (i = 0; i < STUDENTS; i++) {
		cout << "Enter score : ";
		cin >> grade[i];
		sum += grade[i];
	}

	average = sum / STUDENTS;
	cout << "Average score = " << average << endl;

	return 0;
}