package day03.quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quiz_Score {
	public static void main(String[] args) {
		// 성적표 국어, 영어, 전산, 이름 입력 받아서 총점, 평균
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, com;
		int sum;
		double avg;
		
		System.out.print("이름 :");
		name = sc.next();
		System.out.print("국어 :");
		kor = sc.nextInt();
		System.out.print("영어 :");
		eng = sc.nextInt();
		System.out.print("전산 :");
		com = sc.nextInt();
		
		sum = kor + eng + com;
		avg = (double)sum / 3;
		System.out.println("이름 : " + name + "\n국어 : " + kor + "\n영어 : " + eng + "\n전산 : " + com + "\n총점 : " + avg + "\n평균 : " + avg);		
	}
}	
