package quiz;

public class Assignment {	
	public static void main(String[] args) {		
		int[] arr = {3,4,5};
		int temp;
		
		for(int i = 0; i < arr.length; i ++) {
			for(int j = i+1; j<arr.length; j++) {
				if((arr[i] < arr[j]) & (arr[j] > arr[i]) == true) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}		
		for(int i : arr) {
			System.out.println(i);
		}		
	}
}
