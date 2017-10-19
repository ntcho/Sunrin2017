#include <iostream>

namespace SunrinHigh {
	void StudentInfo(void) {
		std::cout << "Function that includes SunrinHigh" << std::endl;
	}
}

namespace SunrinMiddle {
	void StudentInfo(void) {
		std::cout << "Function that includes SunrinMiddle" << std::endl;
	}
}

int main(void) {
	SunrinHigh::StudentInfo();
	SunrinMiddle::StudentInfo();

	return 0;
}