#include <iostream>

using namespace std;

class Company {
	int sales, profit;
	friend void sub(Company &c);
	// declaring the actual function outside of the class would be more useful
public:
	// friend functions could be declared here too
	Company() : sales(100), profit(500) {}
};

void sub(Company &c) {
	// can access to all variables in the class, even if the variable is private
	cout << c.profit << endl;
}

int main() {
	Company c1;
	sub(c1);
	return 0;
}