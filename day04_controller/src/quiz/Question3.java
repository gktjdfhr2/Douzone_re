package quiz;

public class Question3 {
	public static void main(String[] args) {
		//문제3]1~ 100까지 중에서 짝수 출력하고 한행에 10개씩 출력
			int cnt3 = 0;
			for(int i = 1; i <= 100; i++) {
				if(i % 2 == 0) {
					System.out.print(i +"\t");
					cnt3+=1;
				}
				if(cnt3 == 10) {
					System.out.println();
					cnt3 = 0;
				}
			}
	}
}
