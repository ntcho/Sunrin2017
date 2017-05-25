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
				cout << "◆";
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

	int getNumber() {
		return number;
	}
};

int money = 1000;
int totalCount = 0;

int main() {
	// initialize the card
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

	int count = 0;
	int bet;
	while (true) {
		if (count >= 17) {
			cout << "No cards left, money left $" << money << endl;
			while (true) {
				cout << "Do you want to try again? (Y/N) : ";
				char selection;
				cin >> selection;
				if (selection == 'Y' || selection == 'y') {
					cout << "Suffling the cards again..." << endl;
					main();
				}
				else if (selection == 'N' || selection == 'n') {
					break;
				}
			}
			break;
		}
		else if (money <= 0) {
			cout << "No money left, you lose." << endl;
			break;
		}
		cout << "----- Turn " << totalCount + 1 << " -----" << endl;
		while (true) {
			cout << "Current money : $" << money << "\t Money to bet : $";
			cin >> bet;
			if (bet <= 0) {
				cout << "You need to bet at least $1" << endl;
			}
			else if (bet > money) {
				cout << "You don't enough money to bet" << endl;
			}
			else if (bet == money) {
				cout << "Are you sure you are all in? (Y/N) : ";
				char selection;
				cin >> selection;
				if (selection == 'Y' || selection == 'y') {
					cout << "All in." << endl;
					break;
				}
			}
			else {
				break;
			}
		}
		money -= bet;
		// money bet, show cards
		Card card1 = card[count * 3];
		Card card2 = card[(count * 3) + 1];
		Card card3 = card[(count * 3) + 2];

		card1.printCard();
		card2.printCard();
		card3.printCard();
		//cout << "\t";

		if (card1.getNumber() > card3.getNumber() &&
			card2.getNumber() < card3.getNumber()) {
			// win
			cout << " Won  : recieved $" << bet * ((count + 1) * 2) << endl;
			money += bet * ((count + 1) * 2);
		}
		else if (
			(card1.getNumber() == card3.getNumber() &&
			card2.getNumber() < card3.getNumber()) || 
			(card1.getNumber() > card3.getNumber() &&
			card2.getNumber() == card3.getNumber())) {
			// duel
			cout << " Duel : recieved $" << bet << endl;
			money += bet;
		}
		else {
			// lose
			cout << " Lose : lost $" << bet << endl;
		}
		count++;
		totalCount++;
	}
}