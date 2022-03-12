package ex06.Break_Continue;

public class MainEntry {
	public static void main(String[] args) {
		for(int i = 1; i < 11; i++) {
			
			if( i == 7) break;
			System.out.println(i);
		}
		System.out.println("main end");
		
		for (int i = 0; i < 11; i++) {
			
			if (i == 7) continue;
			System.out.println(i);
		}
		System.out.println("main end");
		
		for (int i = 0; i < 101; i++) {
			if( i % 2 !=0) continue;
			
			System.out.print(i + "\t");
		} 
	}
}
