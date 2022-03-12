package Chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		BufferedReader br = null, stin  = null;
		BufferedWriter bw = null;
		Socket client = null;
		
		try {
			client = new Socket("localhost", 9000);
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String outputMessage;
			
			while(true) {
				System.out.println("message input : ");
				outputMessage = stin.readLine();
				if( outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				}
				bw.write("클라이언트 > " + outputMessage + "\n");
				bw.flush();
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				client.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("채팅중 오류 발생");
			}
		}
	}
	
}
