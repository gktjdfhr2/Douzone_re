package ex07.randomClass;

import java.util.Random;

public class RandomClass {
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(5));
		System.out.println(rand.nextInt(10) +1);
	}
}
