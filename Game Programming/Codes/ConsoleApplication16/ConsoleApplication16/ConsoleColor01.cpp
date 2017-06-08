#include<windows.h>
#include<iostream>

using namespace std;

#define BLACK 0
#define BLUE 1
#define GREEN 2
#define CYAN 3
#define RED 4
#define MAGENTA 5
#define YELLOW 6
#define LIGHTGRAY 7
#define DARKGRAY 8
#define LIGHTBLUE 9
#define LIGHTGREEN 10
#define LIGHTCYAN 11
#define LIGHTRED 12
#define LIGHTMAGENTA 13
#define YELLOW 14
#define WHITE 15

void textColor(int color) {
	SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), color);
}

void textColorWithBackground(int textColor, int backgroundColor) {
	SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), textColor + backgroundColor * 16);
}

int main() {
	textColor(LIGHTBLUE);
	cout << "Light blue!" << endl;

	textColorWithBackground(LIGHTBLUE, DARKGRAY);
	cout << "Light blue with dark background!" << endl;
}