package ex03.quiz;

import java.util.Scanner;

public class PartTime extends Employee {
	protected int day;
	protected double pay;
	Scanner sc = new Scanner(System.in);
	
	
	

	public int getDay() {
		return day;
	}

	public double getPay() {
		return pay;
	}	
	public void setDay(int day) {
		this.day = day;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

		
	public PartTime() {
		// TODO Auto-generated constructor stub
		super();
		System.out.print("근무일수 입력:");
		this.day = sc.nextInt();
		this.pay = day * 60000;
	}
	@Override
	public String toString() {
		return super.toString()+" day=" + day + ", pay=" + pay +  "]";
	}
}	
