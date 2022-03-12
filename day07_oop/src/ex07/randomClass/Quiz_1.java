package ex07.randomClass;

import java.util.Random;
import java.util.Scanner;

public class Quiz_1 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int ranNum = rand.nextInt(100)+1, input = 0;
		
		for (int i = 0; i < 5; i++) {			
			System.out.print("숫자입력 : ");
			input = sc.nextInt();
			if(ranNum > input) {
				System.out.println("up");
			}
			else if(ranNum < input) {
				System.out.println("down");
				
			}else if(ranNum == input) {
				System.out.println("입력값 :" + input + " 정답입니다.");
				break;
			}			
		}
		System.out.println(" 정답은" + ranNum + " 입니다.");
		
	}
}
