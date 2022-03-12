package quiz;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1 = 0, su2 = 0;
		char input = ' ';
		try {
			su1 = sc.nextInt();
			su2 = sc.nextInt();
			input = sc.next().charAt(0);
			
		} catch (InputMismatchException e) {
			System.out.println("자료형을 맞춰서 입력해주세요");
		}	

		int result=0;
		switch (input) {
		case '+':
			result = su1 + su2;
			break;
		case '-':
			result = su1 - su2;
			break;
		
		case '*':
			result = su1 * su2;
			break;
		
		case '/':
			result = su1 / su2;			
			break;		
		}
		System.out.println(su1 + " " + input + " " + su2 + " = " + result);
		
	}
}
