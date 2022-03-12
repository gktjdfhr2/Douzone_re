package ex02.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args){
		System.out.println("integer data input :");
		Scanner sc = new Scanner(System.in);
		int x, y, result =0;
		x = sc.nextInt();
		y = sc.nextInt();
		
		
		try {
			result = x/y;  //문제발생 있음
			System.out.println( x + " / " + y + " = " + result);
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("ArithmeticException !!!");
		} catch (InputMismatchException e) {
			System.out.println("RuntimeException !!!");
		} catch (Exception e) {
			System.out.println("Exception !!!"); //상위 예외
		}
		finally {
			System.out.println("finally는 무조건 출력된다");
		}
		
		
//		if( y != 0) result = x / y;
//		else {
//			
//			System.exit(0);
//		}
//		
//		System.out.println(result);
	}
}
