package ex06.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	private final static int PACKSIZE = 100;
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("using : DatagramServer host , port number:");
			return;
		}
		
		DatagramSocket ds = null;
		try {
			InetAddress host = InetAddress.getByName(args[0]);
			int port = Integer.parseInt(args[1]);
			
			ds = new DatagramSocket();
			byte[] data = "Hello Server KOSA th2".getBytes();
			DatagramPacket dp = new DatagramPacket(data, data.length,host,port);
			
			ds.send(dp);
			
			ds.setSoTimeout(2000);
			dp.setData(new byte[PACKSIZE]);
			
			System.out.println(new String(dp.getData()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
