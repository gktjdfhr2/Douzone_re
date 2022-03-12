package ex01.collection.set;

import java.util.TreeSet;

public class TreeSetMain {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		int[] score = { 85, 95, 50, 35, 45, 65, 10, 100};
		
		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		
		System.out.println(set);
		
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));
	}
}
