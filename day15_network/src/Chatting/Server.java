package Chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		ServerSocket server = null;
		Socket client = null;
		
		System.out.println("채팅 프로그램 동작");
		
		try {
			server = new ServerSocket(9000);
			client = server.accept();
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			stin = new BufferedReader(new InputStreamReader(System.in));
			
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String inputMessage;
			while(true) {
				inputMessage = br.readLine();
				if(inputMessage.equalsIgnoreCase("exit")) break;
				System.out.println(inputMessage);
				String outputMessage = stin.readLine();
				bw.write("myServer > " + outputMessage + "\n");
				bw.flush();
			}//end while
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}  finally {
			
			try {
				client.close(); server.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
