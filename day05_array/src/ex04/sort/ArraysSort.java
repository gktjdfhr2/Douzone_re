package ex04.sort;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		int[] a = {7, 3, 5, 2, 8};
		
		System.out.println("*****sort 전 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "\t");
		}
		
		Arrays.sort(a);
		
		System.out.println("*****sort 후 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "\t");
		}
		
		System.out.println("\n내림차순");
		for (int i = a.length-1; i < a.length; i++) {
			
		}
	}
}
