package quiz;

import java.util.Scanner;

public class MethodQuestion5 {
	static Scanner sc = new Scanner(System.in);
	static String[][] scoreArr;
//	문제5] 성적처리 프로그램 함수로 분할(분리)할것
//	입력 함수 input()  - 이름 , 국어, 영어, 전산 점수 
//	총점 함수 total(~~~) - 총점 구하는 함수
//	평균 함수 average( ~~ ) - 평균 구하는 함수
//	평점(학점) grade( ~~ ) - 학점 구하는 함수 
//	출력 함수 output( ) - 결과 출력하는 함수 
	
	public static void main(String[] args) {
		
		System.out.println("학생 수 :");
		
		scoreArr = new String[sc.nextInt()][4];
		int cnt = 0;
		
		input();
		total();
		output();
		
	}
	static void total() {
		int sum = 0;
		
	}
	static void input() {
		for (int i = 0; i < scoreArr.length; i++) {
			for (int j = 0; j < scoreArr[i].length; j++) {				
				switch (j) {
				case 0:
					System.out.println("이름 : ");
					break;
				case 1:
					System.out.println("국어점수 : ");
					break;
				case 2:
					System.out.println("영어점수 : ");
					break;
				case 3:
					System.out.println("전산점수 : ");
					break;
					
				}
				scoreArr[i][j] = sc.next();			}
		}
	}
	
	static void output() {
		for (int i = 0; i < scoreArr.length; i++) {
			for (int j = 0; j < scoreArr[i].length; j++) {				
				switch (j) {
				case 0:
					System.out.println("이름 : ");
					break;
				case 1:
					System.out.println("국어점수 : ");
					break;
				case 2:
					System.out.println("영어점수 : ");
					break;
				case 3:
					System.out.println("전산점수 : ");
					break;
					
				}
				System.out.println(scoreArr[i][j]);			}
		}
	}
}
	

	

