package ex03.quiz;

import java.util.Scanner;

public class Quiz_3_Main {
	
	// 			Employee <--------------- Regular <----------------------- Sales
	//	이름, 직급, 부서, 연락처			급여							
	//직급 PartTime
	
	//PartTime
	//	일수 * 시간 단가
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PartTime pt;
		Sales sa;
		Regular re;
		while(true) {
			System.out.print("근무형태(Part/Regular):");		
			String str = sc.next();
			if(str.equals("Part")) {
				pt = new PartTime();
				System.out.println(pt);
				break;				
			}else {
				System.out.print("직무형태(전산직/영업직....):");
				str=sc.next();
				if(str.equals("영업직")) {
					sa = new Sales();
					System.out.println(sa);
					break;
				}
				else {
					re = new Regular();
					System.out.println(re);
					break;
				}
			}
			
		}
		
		
	}
	
	
}
