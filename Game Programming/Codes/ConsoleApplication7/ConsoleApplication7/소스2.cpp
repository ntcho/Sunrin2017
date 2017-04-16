#include<iostream>
using namespace std;
class Student {
	const int id;
	int age;
public:
	Student(int id2, int age2) : id(id2) : age(age2) {}
	void ShowData() {
		cout << "Id : " << id << endl;
		cout << "Age : " << age << endl;
	}
};
void main() {
	Student kim(10101, 17);
	Student lee(20202, 18);
	kim.ShowData();
	cout << endl;
	lee.ShowData();
	cout << endl;
}