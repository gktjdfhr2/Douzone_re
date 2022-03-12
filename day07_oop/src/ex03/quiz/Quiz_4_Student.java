package ex03.quiz;

import java.util.Scanner;

public class Quiz_4_Student implements Comparable<Quiz_4_Student> {
	Scanner sc = new Scanner(System.in);
	private String name;
	private int kor, eng, com, sum;
	private double avg;
	char grade;
	
	public Quiz_4_Student() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getCom() {
		return com;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	public void total(int x, int y, int z) {
		this.sum = x + y + z;
	}
	public void input() {
		System.out.print("이름을 입력하세요 : ");
		this.name = sc.next();
		System.out.print("국어점수를 입력하세요 : ");
		this.kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		this.eng = sc.nextInt();			
		System.out.print("전산점수를 입력하세요 : ");
		this.com = sc.nextInt();
	}
	public void avg(int sum, int y) {
		this.avg = (double)sum / 3;
	}
	public boolean check() {
		boolean normal=true;
		if(this.kor < 0 || this.kor > 100 || this.eng < 0 || this.eng > 100 || this.com < 0 || this.com > 100)
			normal =false;
		return normal;
	}
	public void setGrade(double avg) {
		int key = (int)(avg / 10);
		switch (key) {
		case 10:
			this.grade = 'A';
			break;
		case 9:
			this.grade = 'B';
			break;
		case 8:
			this.grade = 'C';
			break;
		case 7:
			this.grade = 'D';
			break;
		default :
			this.grade='F';
		}			
	}
	@Override
	public String toString() {
		return "이름=" + name + "\n국어점수=" + kor + "\n영어점수=" + eng + "\n전산점수=" + com + "\n총합=" + sum + "\n평균=" + avg + "\n학점=" + grade;
	}
	@Override
	public int compareTo(Quiz_4_Student o) {
		// TODO Auto-generated method stub
		return (int) (this.avg - o.avg);
	}
}
