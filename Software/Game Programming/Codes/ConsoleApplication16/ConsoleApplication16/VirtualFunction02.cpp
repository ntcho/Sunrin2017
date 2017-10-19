#include<iostream>

using namespace std;

class Animal {
public:
	Animal() {
		cout << "Animal initializer" << endl;
	}

	~Animal() {
		cout << "Animal destructor" << endl;
	}

	virtual void speak() {
		cout << "Animal speak()" << endl;
	}
};

class Dog : public Animal {
public:
	Dog() {
		cout << "Dog initializer" << endl;
	}

	~Dog() {
		cout << "Dog destructor" << endl;
	}

	void speak() {
		cout << "Wof wof" << endl;
	}
};

class Cat : public Animal {
public:
	Cat() {
		cout << "Cat initializer" << endl;
	}

	~Cat() {
		cout << "Cat destructor" << endl;
	}

	void speak() {
		cout << "Meow" << endl;
	}
};

void main() {
	Animal *a1 = new Dog();
	a1->speak();

	Animal *a2 = new Cat();
	a2->speak();

	delete a1;
	delete a2;
}