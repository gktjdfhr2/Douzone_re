package ex03.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MainEntry {
	public static void main(String[] args) throws IOException {		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is); //Reader는 추상클래스라  자체적으로 객체 생성X 상속된  객체로 사용해야함
		BufferedReader br = new BufferedReader(reader);
		System.out.println("입력하세요 :");
		int su1, su2;
		
		su1 = Integer.parseInt(br.readLine());
		su2 = Integer.parseInt(br.readLine());
		
		System.out.println(su1 + su2);
		
		String str = br.readLine();	//예외발생
		System.out.println(str);
	}
}
