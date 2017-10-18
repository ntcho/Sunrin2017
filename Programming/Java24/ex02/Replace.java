package ex02;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		printL(">> ");
		input = sc.nextLine();
		
		String command;
		
		while (true) {
			printL("$ ");
			command = sc.nextLine();
			if (!command.startsWith("!")
					&& !command.endsWith("!")
					&& command.contains("!")
					&& command.length() >= 3) {
				// process
				String findStr = command.substring(0, command.indexOf("!"));
				String replaceStr = command.substring(
						command.indexOf("!") + 1);
				// replace
				input = input.replace(findStr, replaceStr);
				print("process : " + input);
			} else if (command.equals("stop") || command.equals("±×¸¸")) {
				print("bye");
				break;
			} else {
				print("error");
			}
		}
		
		sc.close();
	}

	static void print(Object obj) {
		System.out.println(obj.toString());
	}

	static void printL(Object obj) {
		System.out.print(obj.toString());
	}
}
