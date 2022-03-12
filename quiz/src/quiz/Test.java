package quiz;

import java.io.IOException;
import java.util.ArrayList;
class MySuper{
	int i;
	MySuper(int i){
		this.i = i * i;
	}
}
class MySub extends MySuper{
	public MySub(int i) {
		// TODO Auto-generated constructor stub
	}
	
}

public class Test {
	public static void main(String[] args) {
		String s1 = new String("100");		
		String s2 = new String("100");
		
		if(s1 == s2) {
			System.out.println("!");
		}
		String s3 = "100";
		String s4 = "100";
		if(s3 == s4) {
			System.out.println("$");
		}
		String str1 = null;
		if(str1.length() > 5) System.out.println("true");
	}
}
