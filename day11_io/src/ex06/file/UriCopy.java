package ex06.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UriCopy {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		URL url = new URL("https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png");
		
		// 읽기객체 - FileInputStream
		InputStream is = url.openStream();
		// 쓰기객체 - FileOutputStream;
		OutputStream os = new FileOutputStream("google.jpg");
		
		byte[] buffer = new byte[1024 * 8];
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read(buffer);
			if( inputData == -1) break;
			os.write(buffer, 0, inputData);
		}
		long end = System.currentTimeMillis();
		
		System.out.println( end-start);
		
		is.close(); os.close();
		System.out.println("웹에서 파일  copy success!!!");
	}
}	
