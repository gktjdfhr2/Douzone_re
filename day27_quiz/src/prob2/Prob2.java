package prob2;

public class Prob2 {
	public static void main(String[] args) {
		int num = generateRandom();
		System.out.println("생성된 정수 : " + num);
		if (primeNumber(num)) {
			System.out.println("---> 소수입니다.");
		} else {
			System.out.println("---> 소수가 아닙니다.");
		}
	}

	private static int generateRandom() {
		// 구현하세요.
		int result =(int)(Math.random()*100) +1 ;
		return result;
	}

	private static boolean primeNumber(int num) {
		// 구현하세요.		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}			
		}
		return true;
	}
}
