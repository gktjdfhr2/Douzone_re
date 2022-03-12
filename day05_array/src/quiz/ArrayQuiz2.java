package quiz;

import java.util.Scanner;

public class ArrayQuiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][4];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i != arr.length-1) {
					arr[i][j] = sc.nextInt();
					
					
				}else {
					arr[i][j] = arr[i-2][j] + arr[i-1][j];
					
				}
			}			
		}
		for (int k = 0; k < arr.length; k++) {
			for (int k2 = 0; k2 < arr[k].length; k2++) {
				System.out.print(" arr[" + k +"][" + k2 + "] = " + arr[k][k2]);
			}
			System.out.println();
		}
		
		
		
		
	}
}
