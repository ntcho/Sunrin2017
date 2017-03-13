#include <iostream>
int main() {
	int num;
	std::cout << "Enter number  : ";
	std::cin >> num;

	for (int i = 1; i <= 9; i++) {
		std::cout << num << " X " << i << " = " << i*num << std::endl;
	}

	return 0;
}