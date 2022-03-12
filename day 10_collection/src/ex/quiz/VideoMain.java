package ex.quiz;

import java.util.Scanner;

public class VideoMain {
	
	public static void main(String[] args) {	//view
		
		
		while(true) {
			System.out.println();
			System.out.print("<1>비디오정보 추가 <2>대여정보 출력 <3>대여정보 수정 <4>비디오 삭제 <5>EXIT : ");
			try {
				switch (new Scanner(System.in).nextInt()) {
				case 1:
					VideoManager.inert();
					break;
				case 2:
					VideoManager.print();
					break;
				case 3:
					VideoManager.update();
					break;
				case 4:
					VideoManager.delete();
					break;
				case 5:
					VideoManager.exit();
					break;

			default:
				break;
			}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
}
