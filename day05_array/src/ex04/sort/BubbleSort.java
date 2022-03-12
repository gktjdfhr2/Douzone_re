package ex04.sort;

public class BubbleSort {
		
	public static void main(String[] args) {
		int[] a = {7, 3, 5, 2, 8};
		int temp = 0;
		System.out.println("*****sort 전 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "\t");
		}
		
		//소트
		for (int i = 0; i < a.length; i++) {
			for (int j= 0; j < a.length - i -1; j++) {
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;					
				}
			}
		}

		System.out.println();
		
		System.out.println("*****sort 후 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "\t");
		}
		
		
		
	}
	
}
