#include<iostream>
#include<time.h>

using namespace std;

int main() {
	srand(time(NULL));
	int r1 = rand() % 10;
	int r2 = rand() % 10; // doesnt changes
	int r3 = rand() % 10;
	while (r1 == r2 || r1 <= 0) {
		r1 = rand() % 10;
	}
	while (r2 == r3 || r1 == r3) {
		r3 = rand() % 10;
	}
	int randomArray[] = { r1, r2, r3 };
	cout << "Cheat : " << r1 << r2 << r3 << endl;
	int count = 0;

	while (true) {
		int n1, n2, n3;
		cout << "Input (separate by spaces) : ";
		cin >> n1 >> n2 >> n3;
		int numArray[] = { n1, n2, n3 };
		int out = 0;
		int strike = 0;
		int ball = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (randomArray[i] == numArray[j]) {
					if (i == j) {
						// strike
						++strike;
					}
					else {
						// ball
						++ball;
					}
				}
			}
		}
		if (strike == 0 && ball == 0) {
			out = 1;
		}
		cout << "[" << strike << " strike / " << ball << " ball / " << out << " out]" << endl;
		count++;
		if (strike == 3) {
			break;
		}
	}

	cout << "Matched in " << count << " times!" << endl;
}