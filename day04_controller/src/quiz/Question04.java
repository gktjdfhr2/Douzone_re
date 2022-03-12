package quiz;

public class Question04 {
	public static void main(String[] args) {
		//문제4] 1~100까지 중에서 3의 배수의 개수와 합을 구하는 프로그램 작성
				int cnt4=0;
				int result4=0;;
				for(int i = 1; i < 101; i++) {
					if(i % 3 == 0) {
						cnt4 += 1;
						result4 += i;
					}			
				}
				System.out.println("\n3의 배수의 개수 : " + cnt4+ "\n3의 배수의 합 : " + result4);
	}
}
