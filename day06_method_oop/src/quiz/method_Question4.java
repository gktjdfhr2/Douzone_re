package quiz;

import java.util.Scanner;

public class method_Question4 {
	public static void add(int x, int y) {	
		System.out.println(x + " + " + y +" = " + (x+y));
	}
	
	public static void sub(int x, int y) {		
		System.out.println(x + " - " + y +" = " + (x-y));
	}
	
	public static void div(int x, int y) {		
		System.out.println(x + " / " + y +" = " + (x/y));
	}
	
	public static void mul(int x, int y) {		
		System.out.println(x + " * " + y +" = " + (x*y));
	}
	
	public static double sub(double x, double y) {		
		return x - y;
	}
	public static double  mul(double x, double y) {
		return x * y;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		char op =' ';
	
		while(true) {
			num1=sc.nextInt();
			num2=sc.nextInt();
			op = sc.next().charAt(0);
			switch (op) {
			case '+':
				add(num1, num2);
				break;

			case '-':
				sub(num1, num2);
				break;

			case '/':
				try {
					div(num1, num2);
				} catch (Exception e) {
					e.printStackTrace();
				}				
				break;
			case '*':
				mul(num1, num2);
				break;				
			}		
			System.out.println("리턴타입 함수 sub :" + sub((double)num1, (double)num2));
			System.out.println("리턴타입 함수 mul :" + mul((double)num1, (double)num2));
		}
		
		
		
		
	}
}
