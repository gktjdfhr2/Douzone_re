package ex05.While;

import java.util.Scanner;

public class DoWhileMain {
	public static void main(String[] args) {
		int num;
		
		do {
			num = new Scanner(System.in).nextInt();
			if(num >= 0 && num <= 100) {
				System.out.println("num = " + num);
			}
			else
				break;
			
		} while (true);
		System.out.println("exit");
	}
}
