#include <iostream>

int BoxVolume(int length, int width, int height) {
	return length * width * height;
}

int BoxVolume(int length, int width) {
	return length * width * 1;
}

int BoxVolume(int length) {
	return length * 1 * 1;
}

// DefaultValue3.cpp - with function overloading

int main(void) {
	std::cout << "[3,3,3] " << BoxVolume(3, 3, 3) << std::endl;
	std::cout << "[5,5,d] " << BoxVolume(5, 5) << std::endl;
	std::cout << "[7,d,d] " << BoxVolume(7) << std::endl;

	return 0;
}