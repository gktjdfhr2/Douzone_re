package ex03.net.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTime {
	
	public static void main(String[] args) {
		Socket s = null;
		
		try {
			s = new Socket("127.0.0.1", 7000);
			// I / O
			InputStream is = s.getInputStream();	//read
			OutputStream os = s.getOutputStream();	//write
			
			String str = "Hello Server";
			os.write(str.getBytes("utf-8"));
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				s.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
