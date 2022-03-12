package ex07.randomClass;

import java.util.Random;

public class Quiz_2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int [] arr = new int [6];
		
		for (int i = 0; i < arr.length; i++) {			
			arr[i] = rand.nextInt(45)+1;
			
			for (int j = 0; j < i; j++) {
//				System.out.println(arr[i] +" = "+arr[j]+ "중복확인");
				if(arr[j] == arr[i]) {					
//					System.out.println("arr["+i+"] = "+arr[i]+ "arr["+ j +"] = "+arr[j]+ "중복확인!");
					i--;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
}
