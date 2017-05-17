package project;

import java.util.Scanner;

class Square {
	private int length;
	
	public Square() {
		this.length = 1;
	}
	
	public Square(int length) {
		this.length = length;
	}
	
	public int getArea() {
		return this.length * this.length;
	}
}

public class Challenge10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Square a = new Square();
		System.out.println("# 첫번째 정사각형 면적: " + a.getArea());
		
		System.out.print("한변의 길이 입력>> ");
		Square b = new Square(sc.nextInt());
		System.out.println("## 두번째 정사각형 면적: " + b.getArea());
		sc.close();
	}
}