package ex03.quiz;

import java.util.Scanner;

public class Regular extends Employee {
	protected double pay;
	Scanner sc = new Scanner(System.in);
	public Regular() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("급여 입력");
		this.pay = sc.nextDouble();
	}
	public double getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {		
		return super.toString()+" pay=" + pay + "]";
	}
}
