#include <iostream>

using namespace std;

int main(void) {
	char string[1000];
	cout << "Enter a string : ";
	cin.getline(string, 1000, '\n');

	int i = 0;
	int charCount = 0;
	while (string[i] != NULL) {
		if (string[i] == 's') {
			charCount++;
		}
		i++;
	}

	cout << "Count of char \'s\' : " << charCount << endl;
	return 0;
}