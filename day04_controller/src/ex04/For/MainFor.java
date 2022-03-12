package ex04.For;

public class MainFor {
	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j ++) {
				System.out.printf(" "
						+ "%d * %d = %2d |", j , i , i * j);
			}
			System.out.println();
		}
	}
}
