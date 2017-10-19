#include <iostream>

using namespace std;

template <class T>
// generic template class, can be used with multiple variable
// function_name<variable_type>(variable_1, variable_2);
// or
// function_name(variable_1, variable_2);
T getMax(T a, T b) {
	if (a > b) return a;
	else return b;
}

int main() {
	int a = 20, b = 50;
	char c = 'a', d = 'z';

	cout << getMax(a, b) << endl;
	cout << getMax(c, d) << endl;
	return 0;
}