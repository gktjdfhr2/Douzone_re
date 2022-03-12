package ex02.lambda;

import java.util.ArrayList;
import java.util.List;

public class MainEntry {
	public static void main(String[] args) {
		// (매개변수 목록) -> {  실행문 }
		Thread t = new Thread(()->{
//		new Thread(() -> {		//람다식으로는 .start()사용 불가
			System.out.println("Thread Start");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread End");
		});
//		t.start();
//		System.out.println(t);
		
		System.out.println("==================");
		List<String> list = new ArrayList();
		list.add("java");
		list.add("jsp");
		list.add("react");
		
		//일반 방식
//		System.out.println(list);
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		//람다 방식
		
		list.forEach((item) -> System.out.println(item));
	}
}
