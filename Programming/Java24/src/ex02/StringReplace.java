package ex02;

import java.util.Scanner;

public class StringReplace {

	static void printBash() {
		print("ex02@java StringReplace");
		printL("$ ");
	}

	public static void main(String[] args) {
		// exploded bash
		String input;
		String string = null;
		Scanner sc = new Scanner(System.in);
		while (true) {
			printBash();
			input = sc.nextLine();
			if (input.startsWith("rep")) {
				if (input.split(" ").length > 1) {
					if (input.split(" ")[1].equals("init") 
							&& input.split(" ").length >= 2) {
						// initialize string
						if (input.split(" ")[2] != null
								&& input.split(" ")[2].length() > 0) {
							string = input.split(" ")[2];
						} else if (input.split(" ").length >= 3) {
							fatal("enter string to initialize");
						}
					} else if (input.split(" ").length == 2) {
						if (input.split(" ")[1].equals("clear")
								&& input.endsWith("clear")) {
							// clear string
							string = null;
							print("string cleared");
						} else if (input.split(" ")[1].equals("print")
								&& input.endsWith("print")) {
							// print
							if (string == null) {
								print("[null]");
							} else {
								print(string);
							}
						} else if (input.split(" ")[1].equals("exit")
								&& input.endsWith("exit")) {
							// exit
							print("bye");
							break;
						} else if (input.split(" ")[1].equals("help")
								&& input.endsWith("help")) {
							// help
							printHelp();
						}
					} else if (input.split(" ").length == 3
							&& input.split(" ")[2] != null
							&& input.split(" ")[2].length() > 0 
							&& input.split(" ")[2].contains("!")) {
						// process replace
						if (string == null) {
							// need to be initialized
							fatal("string needs to be initialized");
						} else {
							// process
							String findStr = input.substring(0, input.indexOf("!"));
							String replaceStr = input.substring(
									input.indexOf("!") + 1, 
									input.indexOf(" ", input.indexOf("!") + 1)
									);
							//debug
							print("findStr - " + findStr);
							print("replaceStr - " + replaceStr);
						}
					} else {
						print("bash: " + input + ": command not found");
					}
				} else {
					printHelp();
				}
			} else {
				print("bash: " + input + ": command not found");
			}
		}

		sc.close();
	}

	static void error(String message) {
		print("error: " + message);
	}

	static void fatal(String message) {
		print("fatal: " + message);
	}

	static void printHelp() {
		print("help");
	}

	static void print(Object obj) {
		System.out.println(obj.toString());
	}

	static void printL(Object obj) {
		System.out.print(obj.toString());
	}
}
