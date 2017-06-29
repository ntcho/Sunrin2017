#include <iostream>

using namespace std;

// originally this class
//class Box {
//	int data;
//public:
//	Box() {}
//
//	void set(int value) {
//		data = value;
//	}
//
//	int get() {
//		return data;
//	}
//};

template <typename T>
class Box {
	T data;
public:
	Box();

	void set(T value) {
		data = value;
	}

	T get() {
		return data;
	}
};

// also could declare as outer-class function
template <typename T>
Box<T>::Box(){}

int main() {
	Box<int> box;
	box.set(100);

	cout << box.get() << endl;

	Box<double> box1;
	box1.set(3.141592);

	cout << box1.get() << endl;

	return 0;
}