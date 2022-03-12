package quiz;

import java.util.Scanner;
// 점수는 0~100점 사이값만 입력 받기
//  y/n ? 원하는 만큼 입력받기
public class Quiz_Score {
	public static void main(String[] args) {
		// 성적표 국어, 영어, 전산, 이름 입력 받아서 총점, 평균
		Scanner sc = new Scanner(System.in);
		char check=' ';
		String name;
		int kor, eng, com;
		int sum;
		int score;
		char grade = ' ';
		double avg;
		
		do {
			score = 0;
			name = "";
			sum = 0;
			grade =' ';
			avg = 0;
			
			
			System.out.print("이름 :");
			name = sc.next();
			
			do {
			System.out.print("국어 :");
			score = sc.nextInt();
			kor = score;
			} while(score > 100 || score <0);
			
			do {			
			System.out.print("영어 :");		
			score = sc.nextInt();
			eng = score;
			} while(score > 100 || score <0);
			
			do {
			System.out.print("전산 :");
			score = sc.nextInt();
			com = score;
			} while(score > 100 || score <0);
			
			
			
			sum = kor + eng + com;
			avg = (double)sum / 3;
			System.out.println("이름 : " + name + "\n국어 : " + kor + "\n영어 : " + eng + "\n전산 : " + com + "\n총점 : " + sum + "\n평균 : " + avg);
			int data = (int)avg/10;
			
			switch (data) {
			
				case 10:
					System.out.println("학점 : A+");			
					break;
				case 9:
					System.out.println("학점 : A");
					break;
				case 8:
					System.out.println("학점 : B+");
					break;
				case 7:
					System.out.println("학점 : B");
					break;
				case 6:
					System.out.println("학점 : C+");
					break;
				case 5:
					System.out.println("학점 : C");
					break;	
			}
			
			if( 100 >= avg && avg >= 90) {
				System.out.println("avg1 = " + avg);
				grade = 'A';
			} else if(90 > avg && avg >= 80) {
				System.out.println("avg2 = " + avg);
				grade = 'B';
			} else if (80 > avg && avg >= 70) {
				System.out.println("avg3 = " + avg);
				grade = 'C';
			} else {
				System.out.println("avg4 = " + avg);
				grade = 'F';
			}
			System.out.println("학점 : " + grade);
			
			System.out.println("계속 / 종료 ( y / n )");
			check = sc.next().charAt(0);
			if(check == 'n' || check == 'N') {
				System.out.println("exit");
				break;
				
			}
		}while(true);
		
		
	}
}
