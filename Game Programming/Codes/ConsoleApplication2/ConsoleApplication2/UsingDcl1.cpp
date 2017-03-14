#include <iostream>

namespace Sunrin {
	void HighSchool(void) {
		std::cout << "Sunrin Internet Highschool!" << std::endl;
	}
}

int main(void) {
	using Sunrin::HighSchool;
	// state that code will use function "highschool" in namespace "Sunrin"
	HighSchool();

	return 0;
}