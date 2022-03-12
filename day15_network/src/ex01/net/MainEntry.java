package ex01.net;

import java.net.Inet4Address;
import java.net.InetAddress;

public class MainEntry {
	public static void main(String[] args) {
//		String host = "192.168.200.254";
		String host = "127.0.0.1";
		
		try {
			InetAddress[] address = InetAddress.getAllByName(host);
			for(InetAddress item : address) {
				System.out.println(item.getCanonicalHostName());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
}
