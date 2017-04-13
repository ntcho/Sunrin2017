#include <iostream>
#include <string>

using namespace std;

class Human {
public:
	string name;
	int age;
	string national;

	Human(string humanName, int humanAge, string humanNational) :
		name(humanName), age(humanAge), national(humanNational){}

	void printHuman();
};

void Human::printHuman() {
	cout << "Name     : " << name << endl;
	cout << "Age      : " << age << endl;
	cout << "National : " << national << endl << endl;
}

Human createHuman(string name, int age, string national) {
	Human human = Human(name, age, national);
	return human;
}

Human createNewHuman(string name, string national) {
	Human human = Human(name, 0, national);
	return human;
}

void printHuman(Human human) {
	cout << "Name     : " << human.name << endl;
	cout << "Age      : " << human.age << endl;
	cout << "National : " << human.national << endl << endl;
}

int main() {
	Human baby = createNewHuman("Baby", "United States");
	baby.printHuman();

	printHuman(baby);

	return 0;
}