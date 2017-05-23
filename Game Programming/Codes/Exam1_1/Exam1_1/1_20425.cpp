#include <iostream>

using namespace std;

void function(int a) {
	cout << "function(int) : " << a << endl;
}

void function(int a, int b) {
	cout << "function(int, int) : " << a << "," << b << endl;
}

void function(char a) {
	cout << "function(char) : " << a << endl;
}

int main() {
	function(10, 20);
	function(30);
	function('A');
	return 0;
}