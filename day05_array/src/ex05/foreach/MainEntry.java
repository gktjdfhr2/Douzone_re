package ex05.foreach;

public class MainEntry {
	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8, 100, 89, 90};
		
		System.out.println("****출력");
		for (int i = 0; i < args.length; i++) {
			System.out.println(a[i] + "\t");
		}
		
		//for(자료형 변수명 : 컬렉션명 or 배열 { 반복구문}
		System.out.println("foreach출력");
		
		for(int item : a) {
			System.out.println(item);
		}
	}
}
