#include <iostream>

namespace SunrinHigh {
	void StudentInfo(void);
}

namespace SunrinMiddle {
	void StudentInfo(void);
}

int main(void) {
	SunrinHigh::StudentInfo();
	SunrinMiddle::StudentInfo();

	return 0;
}

void SunrinHigh::StudentInfo(void) {
	std::cout << "Function contains SunrinHigh" << std::endl;
}

void SunrinMiddle::StudentInfo(void) {
	std::cout << "Function contains SunrinMiddle" << std::endl;
}