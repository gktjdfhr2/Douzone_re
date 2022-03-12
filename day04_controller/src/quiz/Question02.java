package quiz;

public class Question02 {
	public static void main(String[] args) {
		//문제2]1~ 100까지 합을 출력하는 프로그램 작성
				int result2 = 0;
				for(int i = 0; i <= 100; i ++) {
					if( i % 10 == 0) System.out.println();				
						result2 += i;
				}
				System.out.println("1에서 100 까지의 합 : " +result2);
	}
}
