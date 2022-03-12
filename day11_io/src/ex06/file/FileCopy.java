package ex06.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		// 읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("1.jpg");
		// 쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("copy.jpg");
		
		long start = System.currentTimeMillis();	//시작 시간저장
		
		while(true) {
			int inputData = is.read();
			if(inputData == -1) break;
			os.write(inputData);			
		}
		long end = System.currentTimeMillis();	// 종료시간 저장		
		System.out.println(end - start);
		is.close(); os.close();		
	}
	
	
//	public static void main(String[] args) throws Exception{
//		
//		// 읽기 객체 - FileInputStream
//		InputStream is = new FileInputStream("1.jpg");
//		// 쓰기 객체 - FileOutputStream
//		OutputStream os = new FileOutputStream("copy.jpg");
//		
//		long start = System.currentTimeMillis();	//시작 시간저장
//		
//		while(true) {
//			int inputData = is.read();
//			if(inputData == -1) break;
//			os.write(inputData);
//			
//		}
//		long end = System.currentTimeMillis();	// 종료시간 저장
//		
//		System.out.println(end - start);
//		is.close(); os.close();
//	
//		
//	}
}
