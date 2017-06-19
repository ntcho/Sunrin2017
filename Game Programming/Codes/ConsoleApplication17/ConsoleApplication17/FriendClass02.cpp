#include <iostream>

using namespace std;

class Date {
	friend bool equals(Date d1, Date d2);
	int year, month, day;
public:
	Date(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
};

bool equals(Date d1, Date d2) {
	return (d1.year == d2.year) &&
		(d1.month == d2.month) &&
		(d1.day == d2.day);
}

int main() {
	Date d1(1994, 11, 30); // teacher birthday
	Date d2(2002, 10, 40); // teacher sibling birthday
	Date d3(1994, 11, 30);

	cout << equals(d1, d2) << endl;
	cout << equals(d1, d3) << endl;
	return 0;
}