package ex04.For;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
//		문제1] 1~ 10까지 출력하는 프로그램 작성 (for문 )
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		//문제2]1~ 100까지 합을 출력하는 프로그램 작성
		int result2 = 0;
		for(int i = 0; i <= 100; i ++) {
			if( i % 10 == 0) System.out.println();				
				result2 += i;
		}
		System.out.println("1에서 100 까지의 합 : " +result2);
		
		//문제3]1~ 100까지 중에서 짝수 출력하고 한행에 10개씩 출력
		int cnt3 = 0;
		for(int i = 1; i <= 100;) {
			if(i % 2 == 0)
				System.out.print(i +"\t");
			if(cnt3 == 10) {
				System.out.println();
				cnt3 = 0;
			}
		}
		System.out.println();
		//문제4] 1~100까지 중에서 3의 배수의 개수와 합을 구하는 프로그램 작성
		int cnt4=0;
		int result4=0;;
		for(int i = 1; i < 101; i++) {
			if(i % 3 == 0) {
				cnt4 += 1;
				result4 += i;
			}			
		}
		System.out.println("\n3의 배수의 개수 : " + cnt4+ "\n3의 배수의 합 : " + result4);
		
		//문제5] 원하는 단을 입력 받아서 구구단 출력하는 프로그램 작성
		int input = new Scanner(System.in).nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%2d * %2d = %2d", input, i, (i*input));
		}
		
	}
}
