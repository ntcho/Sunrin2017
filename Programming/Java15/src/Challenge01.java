import java.util.Scanner;

public class Challenge01 {
	public static void main(String[] args) {
		String usr1, usr2;
		// Create input stream
		Scanner sc = new Scanner(System.in);

		System.out.println("Rock scissors paper");
		System.out.println("Scissors,Rock,Paper 중에서만 입력하세요.");

		while(true){
			System.out.print("PLAYER 1 = ");
			usr1 = sc.next();
			if(usr1.equals("Sciccors")||usr1.equals("Rock")||usr1.equals("Paper"))
				break;
			else{
				System.out.println("Please check your input.");
			}
		}
		while(true){
			System.out.print("PLAYER 2 = ");
			usr2 = sc.next();
			if(usr2.equals("Sciccors")||usr2.equals("Rock")||usr2.equals("Paper"))
				break;
			else{
				System.out.println("Please check your input.");
			}
		}
		
		if (usr1.equals("Scissors")) {

			if (usr2.equals("Scissors")) {
				System.out.println("Duel");
			} else if (usr2.equals("Rock")) {
				System.out.println("P1 wins");
			} else if (usr2.equals("Paper")) {
				System.out.println("P2 wins");
			}
		} else if (usr1.equals("Rock")) {
			if (usr2.equals("Scissors")) {
				System.out.println("P1 wins");
			} else if (usr2.equals("Rock")) {
				System.out.println("Duel");
			} else if (usr2.equals("Paper")) {
				System.out.println("P2 wins");
			}
		} else if (usr1.equals("Paper")) {
			if (usr2.equals("Scissors")) {
				System.out.println("P2 wins");
			} else if (usr2.equals("Rock")) {
				System.out.println("Duel");
			} else if (usr2.equals("Paper")) {
				System.out.println("P1 wins");
			}
		}
		sc.close();
	}
}
