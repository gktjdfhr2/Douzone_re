package ex04.For;

import java.util.Scanner;

public class StarWrite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		String star="";
		cnt = sc.nextInt();
		
		for(int i=0; i < cnt; i++) {
			star +="*";
			System.out.println(star);
		}
		
		cnt = sc.nextInt();
		
		for(int i=0; i < cnt; i++) {
			star = "";
			for(int j = 0; j < (cnt-1)-i; j++) {
				star += " ";
			}
			for(int j = 0; j <= i; j++) {
				star +="*";
			}
			System.out.println(star);
		}
	}
}
