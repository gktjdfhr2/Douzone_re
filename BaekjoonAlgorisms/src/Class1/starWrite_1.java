package Class1;

import java.util.Scanner;

public class starWrite_1 {
	//���ڿ� ���	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		String star="";
		cnt = sc.nextInt();
		sc.close();
		for(int i=0; i < cnt; i++) {
			star +="*";
			System.out.println(star);
		}
	}
	//	���߹ݺ���
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int cnt;		
//		cnt = sc.nextInt();
//		
//		for(int i=0; i < cnt; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
}
