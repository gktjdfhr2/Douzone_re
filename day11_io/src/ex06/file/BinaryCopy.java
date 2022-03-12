package ex06.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {
	
	public static void main(String[] args) {
//		File src = new File("C:/Program Files/Internet Explorer/iexplore.exe");
//		File dist = new File("C://new/ie.dat");
		
		File src = new File("C:/Users/HASEONGROK/Documents/카카오톡 받은 파일/th2_java 일자별 정리 (5).txt");
		File dist = new File("C://new/copy.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src);	//파일 입력 바이트 스트림 연결
			fos = new FileOutputStream(dist); // 파일 출력 바이트 스트림 연결
			bis = new BufferedInputStream(fis); // 버퍼 입력 스트림 연결
			bos = new BufferedOutputStream(fos); // 버퍼 출력 스트림 연결
			
			while((c = bis.read()) != -1) { //data가 없을때까지 읽음
				bos.write((char)c);
			}
			
			System.out.println( "파일복사 성공");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("파일 오류 복사 실패");
		}
		
		
	}
}
