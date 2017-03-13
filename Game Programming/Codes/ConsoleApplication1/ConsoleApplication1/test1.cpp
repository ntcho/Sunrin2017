#include <iostream>
int main() {
	int sum = 0;

	for (int i = 0; i < 3; i++) {
		int num;
		std::cout << "Enter number " << i + 1 << " : ";
		std::cin >> num;
		sum += num;
	}

	std::cout << "Sum : " << sum;
	return 0;
}