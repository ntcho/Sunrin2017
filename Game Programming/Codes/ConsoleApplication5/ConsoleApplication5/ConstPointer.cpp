#include <iostream>

using namespace std;

void display(const int *xPos, const int *yPos);
void move(int *xPos, int *yPos);

int main(void) {
	int x = 10;
	int y = 20;

	display(&x, &y);
	move(&x, &y);
	display(&x, &y);

	return 0;
}

void display(const int *xPos, const int *yPos) {
	// btw const not needed for this
	cout << "Current position [" << *xPos << ", " << *yPos << "]" << endl;
}

void move(int *xPos, int *yPos) {
	*xPos = *xPos + 1;
	*yPos = *yPos + 1;
}