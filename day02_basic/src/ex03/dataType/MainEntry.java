package ex03.dataType;

public class MainEntry {
	public static void main(String[] args) {
		int su =10;
		
		System.out.printf("10진수 : %d\n", su);
		System.out.printf("8진수 : %o\n", su);
		System.out.printf("16진수 : % x\n", su);
		
	}
	
	
	
	/*
	 * public static void main(String[] args) { short sh = 32767; //-32768~ 32767
	 * int num = 32769;
	 * 
	 * System.out.println(sh + ":" + num);
	 * 
	 * num = sh; //묵시적 형변환 sh = (short)num; //명시적 형변환 }
	 */
	
//	public static void main(String[] args) {
//		String str ="A"; // 문자열, " ", 2byte , A\0
//		char ch ='A'; // 문자, '', 1byte -> 2byte
//		char ch2 = 67;
//		char ch3 = 'b';
//		int su = 20; String name = "happy"; double dd = 12.34, ff = 3.45;
//		
//		System.out.println(ch); // A
//		System.out.println(str); // A
//		System.out.println((int)ch); // ASCII65
//		System.out.println(ch2 + ch3); // ?
//		System.out.println("name = " + name);
//		System.out.println("실수형데이터 : " + dd);
//		System.out.printf("%f %f\n", dd, ff);
//		System.out.println("------------------------");
//	
//		for(int i=65; i <= 90; i++) {
//			System.out.print((char)i + " ");
//		}// end for
//		
//		System.out.println("\n\n==========================");
//		System.out.println();
//		
//	}
}
