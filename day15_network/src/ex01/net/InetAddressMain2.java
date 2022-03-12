package ex01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain2 {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress address = InetAddress.getLocalHost();		
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 IP주소 : " + address.getHostAddress());
		
		address = InetAddress.getByName("www.naver.com");
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 IP주소 : " + address.getHostAddress());
		
		byte[] addr = new byte[4];
		addr[0] = (byte)211;
		addr[1] = (byte)249;
		addr[2] = (byte)220;
		addr[3] = (byte)24;
		
		address = InetAddress.getByAddress(addr);
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 IP주소 : " + address.getHostAddress());
		
		InetAddress[] arr;
		
		arr= InetAddress.getAllByName("www.daum.net");
		
		for(InetAddress item : arr) {
			System.out.println("daum host 이름 : " +item.getHostName());
			System.out.println("daum host IP주소 : " +item.getHostAddress());
		}
		
	}
	
}
