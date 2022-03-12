package ex03.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("박정희 노태우 전두환 김영삼");
		StringTokenizer st1 = new StringTokenizer("사과=10|초콜렛=3|샴페인=1","=|",true);
		while(st1.hasMoreTokens()) {
			String str = st1.nextToken();
			
			if(str.equals("=")) System.out.print("\t");
			else if(str.equals("|")) System.out.print("\n");
			else System.out.println(str);
		}
	}
}
