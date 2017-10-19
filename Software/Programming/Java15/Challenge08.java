package project;

import java.util.Scanner;

class Dog {
	private String name;
	public Dog() {
		this.name = "港港捞";
		printName();
	}
	
	public Dog(String name) {
		this.name = "港港捞 " + name;
		printName();
	}
	
	public Dog(String color, String name) {
		this.name = color + " " + name + " 港港捞";
		printName();
	}
	
	public void printName() {
		System.out.println(name);
	}
}

public class Challenge08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();

		Dog a = new Dog();
		Dog b = new Dog("归备");
		Dog c = new Dog("窍踞", "归备");
		
		System.out.print("港港捞 捞抚 涝仿 : ");
		Dog d = new Dog(sc.next());
		sc.close();
	}
}
