package ex01.method;

import java.util.Arrays;
import java.util.Scanner;

public class MainEntry {
	//절차지향 언어는 메인함수와 다른함수의 위치순서가 중요
	//객체지향 언어는 static 영역에 모두 등록후 실행되기 때문에 상관없음
	
	// 1)매개변수 없고, 리턴타입 없는경우
	
	public static void namePrint() {
		System.out.println("Ha Seong Rok");
	}
	
	public static void main(String[] args) {
		namePrint();
		add(1,2);
//		//함수(Method)
//		메인함수의 부담을 줄이고 반복적인 코드를 함수로 만들어서 사용
//		-instance method : 객체 생성하고 사용해야함(메모리상에 할당이 되어야 사용가능)
//		-static method : 객체 생성 없이 바로 사용 가능함
//		
		
//		int[] a = {1, 2, 3, 4, 5, 6, 7};
//		Scanner sc; // 객체 선언
//		sc = new Scanner(System.in); // 객체생성, 메모리에 할당, 생성자 함수 자동호출
//		
//		int kor = sc.nextInt();
//		System.out.println(kor);
//		
//		Arrays.sort(a);		
	}
	
	//
	public static void add(int x, int y) {
		int sum = x + y;
		System.out.println("sum ="+ sum);
	}
}
