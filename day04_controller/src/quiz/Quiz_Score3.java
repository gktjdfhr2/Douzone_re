package quiz;

import java.util.Scanner;
// ������ 0~100�� ���̰��� �Է� �ޱ�
//  y/n ? ���ϴ� ��ŭ �Է¹ޱ�
public class Quiz_Score3 {
	public static void main(String[] args) {
		// ����ǥ ����, ����, ����, �̸� �Է� �޾Ƽ� ����, ���
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
			
			
			System.out.print("�̸� :");
			name = sc.next();
			
			do {
			System.out.print("���� :");
			score = sc.nextInt();
			kor = score;
			} while(score > 100 || score <0);
			
			do {			
			System.out.print("���� :");		
			score = sc.nextInt();
			eng = score;
			} while(score > 100 || score <0);
			
			do {
			System.out.print("���� :");
			score = sc.nextInt();
			com = score;
			} while(score > 100 || score <0);
			
			
			
			sum = kor + eng + com;
			avg = (double)sum / 3;
			System.out.println("�̸� : " + name + "\n���� : " + kor + "\n���� : " + eng + "\n���� : " + com + "\n���� : " + sum + "\n��� : " + avg);
			int data = (int)avg/10;
			
			switch (data) {
			
				case 10:
					System.out.println("���� : A+");			
					break;
				case 9:
					System.out.println("���� : A");
					break;
				case 8:
					System.out.println("���� : B+");
					break;
				case 7:
					System.out.println("���� : B");
					break;
				case 6:
					System.out.println("���� : C+");
					break;
				case 5:
					System.out.println("���� : C");
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
			System.out.println("���� : " + grade);
			
			System.out.println("��� / ���� ( y / n )");
			check = sc.next().charAt(0);
			if(check == 'n' || check == 'N') {
				System.out.println("exit");
				break;
				
			}
		}while(true);
		
		
	}
}
