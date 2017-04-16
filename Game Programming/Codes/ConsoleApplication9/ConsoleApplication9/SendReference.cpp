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

void changeNational(Human &human, string changeNational) {
	human.national = changeNational;
}

void addAge(Human &human) {
	human.age += 1;
}

int main() {
	Human baby = createNewHuman("Baby", "United States");
	baby.printHuman();

	addAge(baby);
	baby.printHuman();

	changeNational(baby, "Russia");
	baby.printHuman();

	return 0;
}