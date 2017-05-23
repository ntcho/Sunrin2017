#include <iostream>

using namespace std;

class Book{
public:
	Book() {
		cout << "book持失切" << endl;
	}
};

class NovelBook : public Book{
public:
	NovelBook() {
		cout << "novelbook持失切" << endl;
	}
};

class ActionBook : public NovelBook{
public:
	ActionBook() {
		cout << "actionbook持失切" << endl;
	}
};

int main() {
	ActionBook obj;
	return 0;
}