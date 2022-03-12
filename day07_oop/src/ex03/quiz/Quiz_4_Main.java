package ex03.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_4_Main {
	static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
		// 성적표 국어, 영어, 전산, 이름 입력 받아서 총점, 평균

		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 :");
		Quiz_4_Student[] st = new Quiz_4_Student[sc.nextInt()];
		String name="";
		int kor = 0, eng = 0, com = 0;
		int cnt = 0; 
		for (int i = 0; i < st.length; i++) {
			st[i] = new Quiz_4_Student();
		}
		while(cnt < st.length) {//	
			
			st[cnt].input();
			st[cnt].total(st[cnt].getKor(), st[cnt].getEng(), st[cnt].getCom());
			
			st[cnt].avg(st[cnt].getSum(), 3);
			st[cnt].setGrade(st[cnt].getAvg());
			System.out.println();
			if(st[cnt].check()) {
				System.out.println(st[cnt].getName() +" 등록 완료");
				cnt++;
			}
			else {
				System.out.println("점수를 올바르게 입력하세요");
			}
			
		}
//		
		Arrays.sort(st);
		for (int i = 0; i < st.length; i++) {
			System.out.println("==========st[" + i + "]==========");
			System.out.println(st[i]);
			System.out.println("=========================");
		
		}
	}
}