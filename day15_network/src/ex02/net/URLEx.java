package ex02.net;

import java.io.*;
import java.net.*;
public class URLEx {
	public static void main(String[] args) throws IOException,UnknownHostException {
		URL google = new URL("http://www.google.com");	//어떤프로토콜을 사용하는지 입력한뒤 도메인 
		
//		https://www.google.com
//		/search		
//		?q=yuna
//		&oq=yuna
//		&aqs=chrome..69i57j46i131i433i512j0i131i433i512j0i3j0i512l5.781j0j15
//		&sourceid=chrome
//		&ie=UTF-8
		BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));
		
		String inputLine;
		
		while( (inputLine = br.readLine()) != null) {
			System.out.println(inputLine);
		
		}
		
		URL url = new URL("https://www.google.com/search?q=yuna&oq=yuna&aqs=chrome..69i57j46i131i433i512j0i131i433i512j0i3j0i512l5.781j0j15&sourceid=chrome&ie=UTF-8");
		
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("호스트와 포트 : " + url.getAuthority());
		System.out.println("호스트 : " + url.getHost());
		System.out.println("포트: " + url.getPort());
		System.out.println("경로 : " + url.getPath());
		System.out.println("질의 : " + url.getQuery());
		System.out.println("파일명 : " + url.getFile());
		System.out.println("참조 : " + url.getRef());
		
		br.close();
	}
}
