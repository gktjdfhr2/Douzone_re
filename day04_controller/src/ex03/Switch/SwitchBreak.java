package ex03.Switch;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		System.out.println("당신의 포인트 = ");
		int point = new Scanner(System.in).nextInt();
		
		switch (point) {
		case 1: System.out.print("집"); break;
		case 2: System.out.print("피아노"); break;
		case 3: System.out.print("우산"); break;		
		}
		System.out.println("상품에 당첨 되셨습니다. 축하합니다~~ ^^");
	}
	
	
//	public static void main(String[] args) {
//		System.out.println("도시를 선택하세요(s, d, b, u)");
//		char city = new Scanner(System.in).next().charAt(0);
//	}
	
	
	
	
	
	
//	public static void main(String[] args) {
//		System.out.println("integer datat input:");
//		int point = new Scanner(System.in).nextInt();
//		
//		switch(point) {
//			case 1:
//				System.out.println("포인트 점수 1점 입니다.");
//				break;
//			case 2:
//				System.out.println("포인트 점수 1점 입니다.");
//				break;
//			case 3:
//				System.out.println("포인트 점수 1점 입니다.");
//				break;
//			default:
//				System.out.println("없는 점수 입니다. 1~3까지만 입력 요망");
//		}
//	}
}
