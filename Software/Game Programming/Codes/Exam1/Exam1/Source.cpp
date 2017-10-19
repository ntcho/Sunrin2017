#include <iostream>
#include <string>

using namespace std;

void print(string str) {
	cout << str << endl;
}

void stopGetEnter() {
	print("");
	print("Press enter to continue...");
	getchar();
}

void chapter1() {
	print("Chapter 1");
	print("About data types");
	print(" - Normal data types could have both negative and positive values");
	print(" - Unsigned data types could only have positive values");

	print(" > short values takes 2 bytes");
	short min_short = SHRT_MIN; // -32768
	short max_short = SHRT_MAX; // 32767
	short max_unsigned_short = USHRT_MAX; // 0xffff, 65535

	print(" > int values takes 4 bytes");
	int min_int = INT_MIN; // -2147483648
	int max_int = INT_MAX; // 2147483647
	int max_unsigned_int = UINT_MAX; // 0xffffffff, 4294967295

	print(" > long values takes 4 bytes, which is same to int");
	long min_long = LONG_MIN; // -2147483648
	long max_long = LONG_MAX; // 2147483647
	long max_unsigned_long = ULONG_MAX; // 0xffffffff, 4294967295

	print(" > float values takes 4 bytes, and float doesn't have unsigned type");
	float min_float = FLT_MAX; // 3.402823466e+38F
	float max_float = FLT_MAX; // 1.175494351e-38F

	print(" > double values takes 8 bytes, and double doesn't have unsigned type");
	double min_double = DBL_MAX; // 1.7976931348623158e+308
	double max_double = DBL_MAX; // 2.2250738585072014e-308

	print(" > char values takes 2 bytes");
	char min_char = CHAR_MAX; // -128
	char max_char = CHAR_MAX; // 127
	char max_unsigned_char = UCHAR_MAX; // 0xff, 255

	print(" > bool values takes 1 bytes, only have true and false values");
	bool min_bool = false;
	bool max_bool = true;

	getchar();

	print("About variables");
	print(" - Variables have identifiers, so devs can use create, edit values linked from those identifiers");
	print(" - There is some limitations on creating variables");
	print(" > Identifiers should...");
	print("    only contain number, alphabet, underscore (_)");
	print("    only contain number, alphabet, underscore (_)");
}

int main() {
	chapter1();
	return 0;
}