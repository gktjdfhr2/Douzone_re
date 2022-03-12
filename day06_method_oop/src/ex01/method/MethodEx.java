package ex01.method;

import java.util.Scanner;

public class MethodEx {
	static void abs(int x) {
		if(x<0) {
			x = -(x);
		}		
		System.out.println(x);				
	}
	
	static int max (int x, int y) {
		if(x > y) {
			return x;
		}
		else return y;
	}
	
	public static void main(String[] args) {
		//이름, 연락처, 주소 출력함수
		Info in = new Info();
		System.out.println(in.getName());
		in.setName("하성록2");
		System.out.println(in.getName());
		in.printAll();
		
		
		//절댓값 출력 함수
		abs(new Scanner(System.in).nextInt());
		System.out.println(max(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));
		//두개 정수 입력 받아서 큰 수 리턴하는 함수
	}
}

class Info{
	private String name="hsr";
	private String phone="010-2885-1865";
	private String addr="부산광역시";
	
	public Info() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void printAll() {
		System.out.println("name = " + this.name + " phone = " + this.phone + " addr = " + this.addr );
	}
	
}