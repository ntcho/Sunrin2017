// stack data example

#include <iostream>
#include <string>

using namespace std;

class StackOverflowException {
public:
	StackOverflowException() {
		cout << "Exception in thread \"main\" java.lang.StackOverflowException : Stack overflowed" << endl;
		cout << "    at TemplateClassExample02.push(TemplateClassExample02.cpp)" << endl;
		cout << "    at TemplateClassExample02.Stack(TemplateClassExample02.cpp)" << endl;
	}
};

class StackUnderflowException {
public:
	StackUnderflowException() {
		cout << "Exception in thread \"main\" java.lang.StackUnderflowException : Stack underflowed" << endl;
		cout << "    at TemplateClassExample02.pop(TemplateClassExample02.cpp)" << endl;
		cout << "    at TemplateClassExample02.Stack(TemplateClassExample02.cpp)" << endl;
	}
};

template <typename T>
class Stack {
	T* data;
	int size;
	int top;
public:
	Stack(int length = 100) {
		data = new T[length];
		size = length;
		top = -1;
	}

	~Stack() {
		delete[]data;
	}

	void push(T v) {
		if (isFull()) {
			throw StackOverflowException();
		}
		data[++top] = v;
	}

	T pop() {
		if (isEmpty()) {
			throw StackUnderflowException();
		}
		return data[top--];
	}

	bool isEmpty() const {
		return top == -1;
	}

	bool isFull() const {
		return top == size - 1;
	}

	void print() {
		cout << "Stack : ";
		for (int i = 0; i <= top; i++) {
			if (i != top) {
				cout << (T)data[i] << ", ";
			}
			else {
				cout << (T)data[i];
			}
		}
		cout << endl;
	}
};

int main() {
	Stack<int> stack(4);

	stack.push(100);
	stack.push(200);
	stack.push(300);
	stack.push(400);

	stack.print();

	cout << stack.pop() << endl;
	cout << stack.pop() << endl;
	cout << stack.pop() << endl;
	cout << stack.pop() << endl;

	return 0;
}