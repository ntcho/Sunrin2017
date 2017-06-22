#include <iostream>

using namespace std;

template <class T>
// generic template class, can be used with multiple variable
// function_name<variable_type>(variable_1, variable_2);
T getMax(T a, T b) {
	if (a > b) return a;
	else return b;
}

int main() {
	cout << getMax<int>(3, 4) << endl;
	cout << getMax(3, 4) << endl;
	cout << getMax(3.4, 4.8) << endl;
	return 0;
}