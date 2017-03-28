#include <iostream>
#include <string>
#include <cstring>

using namespace std;

int main(void) {
	char str[20];
	char strCpyFromInput[20];

	char strCode[20] = "Copied string!";
	char strCpyFromCode[20];

	cout << "Enter string : ";
	cin >> str;

	cout << "[strlen] String length = " << strlen(str) << endl;
	// function "strlen(char str[])" : returns a int value of str[]'s length

	strcpy(strCpyFromInput, str);
	strcpy(strCpyFromCode, strCode);
	// function "strcpy(char cpy[], char org[])" : copies the string of org[] to cpy[]

	cout << "[strcpy] Copied string (from input) = " << strCpyFromInput << endl;
	cout << "[strcpy] Copied string (from code) = " << strCpyFromCode << endl;

	strcat(str, strCode);
	// function "strcat(char str1[], char str2[])" : merges the str2[] at the end of str1[]

	cout << "[strcat] Merged string (str + strCode) = " << str << endl;

	if (strcmp(strCpyFromInput, strCode) < 0) {
		cout << "[strcmp] String \"" << strCpyFromInput << "\" is in front of string \"" << strCode << "\" on alphabetical order" << endl;
	}
	else if (strcmp(strCpyFromInput, strCode) > 0) {
		cout << "[strcmp] String \"" << strCode << "\" is in front of string \"" << strCpyFromInput << "\" on alphabetical order" << endl;
	}
	else {
		cout << "[strcmp] String \"" << strCode << "\" is same of string \"" << strCpyFromInput << "\" on alphabetical order" << endl;
	}
	// function "strcmp(char str1[], char str2[])" : checks alphabetical order of two strings
	// if str1[] is in front of str2[], returns *value < 0*, vice versa and if the string is same, it returns 0
	// beware it returns < 0 if the first string is at the front of the second string

	return 0;
}