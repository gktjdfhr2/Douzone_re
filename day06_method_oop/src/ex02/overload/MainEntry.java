package ex02.overload;

public class MainEntry {
	public static void line() {
		System.out.println("-------------------");
	}
	
	public static void line(String str, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(str +" ");
		}
		System.out.println();
	}
	
	public static void line(int x, int n) {
		for (int i = x; i <= n; i++) {
			System.out.print("+");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		line(-30); //문제소지 있음
		line(3,5);		
		line();
		
		line(5,3); //문제 소지 있음. 해결할 것! if문이나 삼항연산자로 
		line("*",10);
		line();
		
	}

	private static void line(int i) {
		// TODO Auto-generated method stub
		
	}
}
