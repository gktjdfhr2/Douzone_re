package ex03.quiz;

import java.util.Scanner;

public class Quiz_2_Triangle extends Quiz_2_Draw {
	public Quiz_2_Triangle() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		System.out.println("넓이 = ");
		this.w = sc.nextInt();
		System.out.println("높이 = ");
		this.h = sc.nextInt();
	}
	
	@Override
	protected double calc() {
		// TODO Auto-generated method stub
		this.result = (w * h) /2;
		return result;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("Triangle toString()");
		return super.toString();
	}
}	
