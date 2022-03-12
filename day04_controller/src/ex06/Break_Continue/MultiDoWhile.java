package ex06.Break_Continue;

public class MultiDoWhile {
	public static void main(String[] args) {
		
		int a = 1, b = 1;
		
		do {
			do {
				System.out.println(b + "\t");
				b++;
			}while(b <= 3);
		
			a++;
			System.out.println();
		}while(a <= 2);
	}
}
 