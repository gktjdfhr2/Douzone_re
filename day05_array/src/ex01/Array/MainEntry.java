package ex01.Array;

public class MainEntry {
	public static void main(String[] args) {
		char[] ch2 = new char[4];
		
		ch2[0] = 'J';
		ch2[1] = 'A';
		ch2[2] = 'V';
		ch2[3] = 'A';
		
		System.out.println(ch2[0]);
		System.out.println(ch2[3]);
		System.out.println("================");
		
		for(char x : ch2) {
			System.out.println(x);
		}
		
		System.out.println("=================");
		
		
		
		
	}
}
