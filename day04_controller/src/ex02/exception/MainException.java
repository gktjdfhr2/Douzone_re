package ex02.exception;

import java.io.IOException;
import java.util.Scanner;

public class MainException {
	public static void main(String[] args){
		System.out.println("integer data input :");
		Scanner sc = new Scanner(System.in);
		int x, y, result =0;
		x = sc.nextInt();
		y = sc.nextInt();
		
		
		try {
			result = x/y;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("종료되었습니다.");
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
