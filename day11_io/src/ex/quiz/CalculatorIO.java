package ex.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalculatorIO {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int su1, su2;
		char op=' ';
		System.out.print("수 입력1:");
		su1 = Integer.parseInt(br.readLine()); 
		System.out.print("수 입력2:");
		su2 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력:");
		op = br.readLine().charAt(0);
			
		switch (op) {
		case '+':
			System.out.println(su1 + " " + op + " " + su2 + " = " + (su1+su2));
			break;
		case '-':
			System.out.println(su1 + " " + op + " " + su2 + " = " + (su1-su2));
			break;
		case '*':
			System.out.println(su1 + " " + op + " " + su2 + " = " + (su1*su2));
			break;	
		case '/':
			System.out.println(su1 + " " + op + " " + su2 + " = " + (su1/su2));
			break;
			
	
	}
		
		
		
	}
}
