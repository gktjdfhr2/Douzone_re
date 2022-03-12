package ex02.exception;

import java.io.IOException;
import java.util.Scanner;

public class MainEntry {
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
