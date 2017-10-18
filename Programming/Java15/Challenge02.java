import java.util.Random;
import java.util.Scanner;

public class Challenge02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();      // Random클래스 객체 생성
		int target = rand.nextInt(100);  // 0~99 사이의 임의의 정수값을 선정하여 target변수에 저장함
		
		int input, cnt;
		
		System.out.println("Guess the number");
		System.out.println("Guess a number between 0 to 99");
		System.out.println();
		
		cnt = 0;
		while(true){
			System.out.print("Tried " + cnt + " times : ");
			input = sc.nextInt();
			
			if(input==target){
				System.out.println("Tried total " + cnt + " times");
				break;
			}
			else if(input>target){
				System.out.println("Your number is smaller");
			}else{
				System.out.println("Your number is higher");
			}
			cnt++;
		}
		System.out.println("You got it!");

		sc.close();
	}
}
