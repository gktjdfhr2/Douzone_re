package ex04.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
//		try {
//			OutputStream os = new FileOutputStream("test.txt"); //상대경로
			OutputStream os = new FileOutputStream("C:/Users/HASEONGROK/Desktop/test.txt"); //절대경로
			while(true) {
				System.out.println("문자열 입력 요망 :");
				String str =sc.nextLine() + "\r\n"; 
				
				if(str.toUpperCase().equals("EXIT\r\n")) break;
				
				os.write(str.getBytes());
			}
			
			
			System.out.println("test.txt save success");
//		} catch (FileNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		
	}
}
