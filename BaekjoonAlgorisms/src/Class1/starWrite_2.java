package Class1;

import java.util.Scanner;

public class starWrite_2 {
	//���ڿ� ���	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt;		
		cnt = sc.nextInt();
		sc.close();
		for(int i=0; i < cnt; i++) {			
//			System.out.println(" ".repeat((cnt)-(i+1))+ "*".repeat(i+1)); �ڹ�8������ ����  ���
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
