#include <iostream>

using namespace std;

int main(void) {
	char c;
	char s[10];

	cout << "Enter a character : ";
	cin >> c >> s;
	// standard input method

	cout << c << " " << s << endl;
	return 0;

	// enter a abcd
	// 'a' goes to variable c
	// "abcd" goes to variable s
}