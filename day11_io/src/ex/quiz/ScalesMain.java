package ex.quiz;

import java.util.Scanner;

public class ScalesMain {	
	
	public static void main(String[] args) throws Exception{	
		
			while(true) {
				
				System.out.println();
				System.out.println("비만도 측정 프로그램입니다."
						+ "추가:1 삭제:2 출력:3 파일저장:4 종료:5 처리할것");
				try {
					
					switch (new Scanner(System.in).nextInt()) {
						case 1:
							System.out.println("---------- BMI 기록 추가 ----------");
							ScalesManager.insert();
							break;
						case 2:
							System.out.println("---------- BMI 기록 삭제 ----------");
							ScalesManager.delete();
							break;
			
						case 3:
							System.out.println("---------- BMI 기록 출력 ----------");
							ScalesManager.print();
							break;
			
						case 4:
							System.out.println("---------- BMI 기록 저장 ----------");
							ScalesManager.fileSave();
							ScalesManager.fileOutput();
							break;
			
						case 5:
							System.out.println("---------- BMI 기록 종료 ----------");
							System.exit(0);
							break;
	
	
					default:
						break;
					}
					
				} catch (Exception e) {
					System.out.println("숫자를 입력하세요!!\n");
				}
			}
		
		
	} 
	
}
