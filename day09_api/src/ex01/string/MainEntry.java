package ex01.string;

public class MainEntry {
	
	public static void main(String[] args) {
		
		String str = new String("korea");
		int x = 99;
		double y = 12.34;
		String message = "hi!!";
		
		System.out.println(str);
		System.out.println(message);
		System.out.println(x + "," + y);
		
		char data[]= {'a', 'b', 'c'};
		String str2 = new String(data);
	}
}
