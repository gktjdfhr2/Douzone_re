package quiz;

import java.util.Random;

public class ArrayQuiz {
	public static void main(String[] args) {
		
		//문제1] int[] a = { 1, 7, 5, 7, 2, 8, 7, 9, 12, 5, 7, 99 }
		// int seek = 7;
		int[] a = { 1, 7, 5, 7, 2, 8, 7, 9, 12, 5, 7, 99 };
		int seek = 7;
		int cnt = 0;
		for(int x : a) {
			if( x == seek) {
				cnt++;			
			}
		}
		System.out.println("7 개수:" + cnt);
		
		//문제2]기상청
		//	1월의 평균 강수량을 구하는 프로그램을 작성 (단 30일 기준)
		//	
		int[] arr = new int[30];
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5);
			System.out.println("arr["+ i + "] = " + arr[i]);
			sum += arr[i];
		}
		
		avg = (double)(sum/arr.length);
		System.out.println("강수량 평균 : " + avg + "ml");
	}
}
