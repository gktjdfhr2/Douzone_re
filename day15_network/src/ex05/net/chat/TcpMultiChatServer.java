package ex05.net.chat;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpMultiChatServer {
	
	HashMap clients;
	ServerSocket ss = null;
	Socket s= null;
	
	public TcpMultiChatServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);	//동기화 
	}
	
	public void start() {
		try {
			ss = new ServerSocket(8000);
			System.out.println("서버가 시작 되었습니다. 챗 준비 완료!");
			
			while(true) {
				s = ss.accept();	//응답대기, 클라이언트 소켓
				System.out.println("["+ s.getInetAddress() + " : " + s.getPort() + "] 에서 접속하셨습니다.");
				ServerReceiver thread = new ServerReceiver(s);	//user class
				thread.start(); //run()메소드 유도
			}
		} catch (Exception e) {	System.out.println("서버 접속 실패");	}
	}	// end start()
	
	public void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();		
		while(it.hasNext()) {
			try {
				DataOutputStream dos = (DataOutputStream) clients.get(it.next());
				dos.writeUTF(msg);
			} catch (Exception e) {	e.printStackTrace();}
		}
	}	
	class ServerReceiver extends Thread {
		Socket s;	//클라이언트 소켓
		DataInputStream dis;
		DataOutputStream dos;
		String name;
		public ServerReceiver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
				dos = new DataOutputStream(s.getOutputStream());
			} catch (Exception e) {	System.out.println("서버 리시브 실패!!");}
		}
		@Override
		public void run() {
			try {
				name = dis.readUTF();
				sendToAll("#" + name + "님이 입장하셨습니다");
				clients.put(name, dos);	//HashMap에 넣기
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다.");
				
				while( dis != null) {
					sendToAll(dis.readUTF());
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				sendToAll("#" + name + "님이 나가셨습니다.");
				clients.remove(name);	//접속자 수 제거
				System.out.println("["+ s.getInetAddress() + " : " + s.getPort() + "] 에서 접속 종료 하셨습니다.");
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다.");
			}
		}	//inner class
		
	}	// end ServerReceiver
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}
}
