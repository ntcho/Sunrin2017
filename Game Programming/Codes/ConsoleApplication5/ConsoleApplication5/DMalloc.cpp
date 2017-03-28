#include <iostream>
#include <cstring>
#include <stdlib.h>

using namespace std;

char* makeStringAddress(int len) {
	// char* str = (char*)melloc(sizeof(char)*len);
	char* str = new char[len];
	return str;
}

int main(void) {
	char* str = makeStringAddress(20);
	strcpy(str, "I am so happy!");
	cout << str << endl;
	// free(str);
	delete []str;

	return 0;
}