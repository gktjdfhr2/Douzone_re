package ex02.lambda;

import java.util.Scanner;

@FunctionalInterface	//메소드 하나만 가지는 interface이고 하나만 가져야 람다형태로 사용가능
interface Plus {
	int sum(int x, int 	y);
}



public class LambdaAnnotation {
	
	public static void main(String[] args) {
		Plus plus = (x,y) -> x + y;
		System.out.println(plus.sum(3, 5));
	}
}
