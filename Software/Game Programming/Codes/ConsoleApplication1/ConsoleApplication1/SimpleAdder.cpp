#include <iostream>
int main() {
	int val1;
	std::cout << "Enter Number 1 ";
	std::cin >> val1;

	int val2;
	std::cout << "Enter Number 2 ";
	std::cin >> val2;

	int result = val1 + val2;
	std::cout << "Sum : " << result << std::endl;
	return 0;
}