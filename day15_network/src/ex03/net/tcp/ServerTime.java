package ex03.net.tcp;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Date;
public class ServerTime {
	
	public static void main(String[] args){
		int port = 7000; // 0 ~ 1024 는 유명한 포트번호로 예약되어있음.
		
		try {
			System.out.print("server Start!!!");
			ServerSocket ss = new ServerSocket(port);	// socket 1
			
			while(true) {
				Socket s = ss.accept();		// socket 2
				OutputStream os = s.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date());
				oos.flush();
				s.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
			
		}
		
	}
}
