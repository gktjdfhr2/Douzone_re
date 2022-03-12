package quiz;

import java.util.Scanner;

public class QuizLeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inYear = sc.nextInt();
		sc.close();
		if( inYear % 4 == 0) {
			if( (inYear % 100 != 0)  || (inYear % 400 == 0) ) {
				System.out.println("윤년");
			} else
				System.out.println("윤년아님");
			
		}else 
			System.out.println("윤년아님"); 
		
	}
}
