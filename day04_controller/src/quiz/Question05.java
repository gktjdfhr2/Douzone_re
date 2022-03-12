package quiz;

import java.util.Scanner;

public class Question05 {
	public static void main(String[] args) {
		//문제5] 원하는 단을 입력 받아서 구구단 출력하는 프로그램 작성
		int input = new Scanner(System.in).nextInt();
			
		for(int i = 1; i < 10; i++) {
			System.out.printf("%2d * %2d = %2d\n", input, i, (i*input));
		}
	}
}
