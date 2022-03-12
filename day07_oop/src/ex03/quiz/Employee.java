package ex03.quiz;

import java.util.Scanner;

public class Employee {
	// 			Employee <--------------- Regular <----------------------- Sales
	//	이름, 직급, 부서, 연락처			급여							
	//직급 PartTime
	
	//PartTime
	//	일수 * 시간 단가
	
	protected String name,rank,part,number;	
	public Employee() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);		
		System.out.print("이름을 입력 :");
		name = sc.next();
		System.out.print("직급을 입력 :");
		rank = sc.next();
		System.out.print("부서를 입력 :");
		part = sc.next();
		System.out.print("전화번호을 입력 :");
		number = sc.next();
		
	}
	public String getName() {
		return name;
	}

	public String getRank() {
		return rank;
	}

	public String getPart() {
		return part;
	}

	public String getNumber() {
		return number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public void setNumber(String number) {
		this.number = number;
	}	
	@Override
	public String toString() {
		return "[name=" + name + ", rank=" + rank + ", part=" + part + ", number=" + number;
	}
	
	
	
	
}
