package quiz;

public class Quiz_While {
	public static void main(String[] args) {
//		과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ?
		int num = 1;
		int result = 0;
		while(true) {
			for(int i = 1; i <= num; i ++) {
				result += i ;
				System.out.print(i + "\t");
			}
			System.out.println();
			System.out.println("result = " + result);
			num++;
			if(num > 5) break;
		}		
//		과제2] (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?
		
		
//		과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = ?

	}
}
