package ex01.Array;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int x = sc.nextInt();
//		System.out.println("x = " + x);
		int[][] a = new int[2][3];
		System.out.println("array data 2row 3col = ");
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("a[" + i + "][" + j + "] = ");
				a[i][j] = sc.nextInt();
			} //j end
		}//i end
		
		System.out.println();
		// output
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "\t");				
			} //j end
			System.out.println();
		}//i end
	}
}
