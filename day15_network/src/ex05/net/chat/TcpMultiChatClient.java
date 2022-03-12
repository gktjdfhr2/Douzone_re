package ex05.net.chat;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChatClient {
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("USAGE : java TcpMultiChatClient nickName");
			System.exit(0);
		}
		
		try {
			String ip = "192.168.200.110";
			Socket s = new Socket(ip, 8000);
			System.out.println("서버에 연결되었습니다.");
			
			Thread send = new Thread(new ClientSender(s, args[0]));
			Thread reciever = new Thread(new ClientReciever(s));
			
			send.start(); reciever.start();
			System.out.println(args[0]);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	static class ClientSender extends Thread {
		Socket s;
		DataOutputStream dos;
		String name;
		public ClientSender(Socket s, String name) {
			this.s =s;
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);	//키보드로 부터 입력받기
			try {
				if(dos != null) {
					dos.writeUTF(name);
					while( dos != null) dos.writeUTF("[" + name + "]" + sc.nextLine());
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
	
	static class ClientReciever extends Thread{
		Socket s;
		DataInputStream dis;
		public ClientReciever(Socket s) {
			// TODO Auto-generated constructor stub
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while( dis != null) {
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		
	}
}
