#include<iostream>

using namespace std;

class Person {
public:
	void print(){
		cout << "Person - print()" << endl;
	}

};

class Employee : public Person {
public:
	void print(){
		Person::print();
		cout << "Employee - print()" << endl;
	}

};

class Manager : public Employee {
public:
	void print(){
		Employee::print();
		cout << "Manager - print()" << endl;
	}

};
int main(){
	Manager obj;
	obj.print();

	return 0;
}