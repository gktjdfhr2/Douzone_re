package quiz;

import java.util.Scanner;

public class QuizPassCheck {
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
		sc.close();
		 
		sum = kor + eng + com;
		avg = (double)sum / 3;
		System.out.println("이름 : " + name + "\n국어 : " + kor + "\n영어 : " + eng + "\n전산 : " + com + "\n총점 : " + avg + "\n평균 : " + avg);
		System.out.println(passCheck(kor,eng,com,avg));
	}
	static String passCheck(int kor, int eng, int com, double avg) {
		if(avg >= 60) {
			if((kor <= 40) || (eng <= 40) || (com <= 40)) {
				return "불합격입니다.";
			}
			else 
				return "합격입니다.";			
		}
		return "불합격입니다.";
	}
}
