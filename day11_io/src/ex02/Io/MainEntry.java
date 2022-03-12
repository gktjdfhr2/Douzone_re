package ex02.Io;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		try {
			int su;
			while((su = System.in.read()) != -1) {
				if(su == 10 || su == 13 || su == 32) continue;
				if(su == 113 || su == 81) break;	//'q' or 'Q'
				
				char ch = (char)su;
				System.out.println(ch);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		} 
	}
	
	
	
	
	
	
//	public static void main(String[] args) throws Exception{
//		int su1 = 0, su2 = 0;
//		System.out.println("데이터 입력 끝은  ctrl + z  를 누르세요");
//		
//		while ((su1 = System.in.read()) != -1) {
//			System.out.println((char)su1 + "\t");			
//		}
//	}
	
	
	
	
//	public static void main(String[] args) {
//		
//		InputStream is = System.in;
//		
//		try {
//			System.out.print("단일 문자 입력 요망 : ");
//			int num = is.read() - 48;	//예외 발생함
//			is.read(); is.read();		//발생한 문제 해결 - 자바에서는 한 '문자' 2바이트 처리됨
//			int num2 = is.read() - 48;
//			
//			System.out.println(num + num2 );
//		}catch (IOException e) {
//			// 
//			System.out.println("user error message");
//			System.out.println("e.getMessage()");
//			e.printStackTrace();
//		}
//	}
}
