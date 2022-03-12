package quiz;

public class QuizEx01 {
	public static void main(String[] args) {
		// %, / 산술연산자를 이용한 계산 결과 출력하기
		//월급
		int pay = 567890;
		
//		result:
//		만원 : 56장
//		천원 : 7장
//		백원 : 8개
//		십원 : 9개
		
		
		System.out.println("만원 : " + pay / 10000 + "장");
		System.out.println("천원 : " + pay % 10000 / 1000 + "장");
		System.out.println("백원 : " + pay % 1000 /100 + "개");
		System.out.println("십원 : " + pay % 100/10 + "개");
		
	}
}
