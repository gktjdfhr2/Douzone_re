package ex06.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
	private final static int PACKSIZE = 100;
	public static void main(String[] args) {
		if(args.length != 1	) {
			System.out.println("dasfasdf");			
			return;
		}
		
		try {
			int port = Integer.parseInt(args[0]);
			DatagramSocket ds = new DatagramSocket(port);
			System.out.println("The Server is ready");
			
			for( ; ; ) {
				DatagramPacket dp = new DatagramPacket(new byte[PACKSIZE], PACKSIZE);
				ds.receive(dp);
				System.out.println(dp.getAddress() + " " + dp.getPort());
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			
		}

	}
}
