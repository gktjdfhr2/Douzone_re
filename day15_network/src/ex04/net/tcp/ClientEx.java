package ex04.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;		
		Socket client = null;	//Socket1
		
		try {
			client = new Socket("localhost", 9999);	//ip , port number 생성되는 순간 ServerEx의 소켓값 준다.
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));		
			stin = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String outputMessage;
			while(true) {
				System.out.print("message input :");
				outputMessage = stin.readLine();
				
				if( outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				}//end if
				
				bw.write("클라이언트 > " + outputMessage + "\n");
				bw.flush();	// 버퍼 비우기				
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
				System.out.println("Server와 채팅 중 오류 발생");
				
			}
		}
	}
}
