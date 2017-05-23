#include <iostream>

using namespace std;

class Employee{
	int salary, bonus;
public:
	int getBonus() {
		return bonus;
	}
	int getSalary() {
		return salary;
	}
	void setSalary(int tmp) {
		this->salary = tmp;
	}
	void calBonus(int score);
};

void Employee::calBonus(int score) {
	this->bonus = (int)(score * 0.5);
}

int main() {
	Employee e1;
	e1.setSalary(100);
	e1.calBonus(100);

	cout << e1.getSalary() << endl;
	cout << e1.getBonus() << endl;

	return 0;
}