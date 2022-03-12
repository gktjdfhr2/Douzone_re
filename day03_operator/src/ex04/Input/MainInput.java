package ex04.Input;

public class MainInput {
	public static void main(String[] args) {
		System.out.println("string, int =");
		
		String str = args[0];
		int su = Integer.parseInt(args[1]);
		
		System.out.print(str);
		System.out.println(su + 33);
	}
}
