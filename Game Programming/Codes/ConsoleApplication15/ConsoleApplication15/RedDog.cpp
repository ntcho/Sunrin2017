#include<iostream>
#include<time.h>
#include<string>

using namespace std;

class Card {
private:
	int shape;
	int number;
	bool isUsed;
public:
	Card() {
		isUsed = false;
	}
	Card(int s, int n) {
		shape = s;
		number = n;
		isUsed = false;
	}

	void printCard() {
		if (isUsed == false) {
			switch (shape) {
			case 0:
				cout << "♦";
				break;
			case 1:
				cout << "♣";
				break;
			case 2:
				cout << "♥";
				break;
			case 3:
				cout << "♠";
				break;
			}
			cout << " ";

			switch (number) {
			case 0:
				cout << "A\t";
				break;
			case 10:
				cout << "J\t";
				break;
			case 11:
				cout << "Q\t";
				break;
			case 12:
				cout << "K\t";
				break;
			default:
				cout << number + 1 << "\t";
				break;
			}
			isUsed = true;
		}
	}
};

int main() {
	Card card[52];
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 13; j++) {
			card[j + (i * 13)] = Card(i, j);
		}
	}

	// shuffling mechanism
	Card tmp;
	int src, cng;
	srand((unsigned)time(NULL));
	for (int i = 0; i < 1000; i++) {
		src = rand() % 52;
		cng = rand() % 52;

		tmp = card[cng];
		card[cng] = card[src];
		card[src] = tmp;
	}
}