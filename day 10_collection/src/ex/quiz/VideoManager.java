package ex.quiz;

import java.util.HashMap;
import java.util.Set;



public class VideoManager extends Video {	// controller
	static HashMap<String, Video> map = new HashMap<String, Video>();
	static int top = 0;
	
	public static void inert() {
		System.out.print("추가하실 비디오 제목을 입력해 주세요 : ");
		String title = sc.next();
		System.out.print("추가하실 비디오 장르을 입력해 주세요 : ");
		String category = sc.next();
		
		map.put(title, new Video(title, category));
		
	}
	
	public static void print() {
		System.out.println("********** 비디오 목록 **********");
		Set <String> set = map.keySet();
		
		for (String video : set) {
			System.out.println("비디오 제목 : " +map.get(video).getTitle() + " 장르 : " + map.get(video).getCategory() + " 대여여부 : "
			+ map.get(video).getLend() + " 대여자 명 : " + map.get(video).getLendName() + " 대여일 : " + map.get(video).getLendDate());			
		}
		
		System.out.println("********** end **********");
		
	}
	
	public static void update() {
		System.out.println("변경하실 비디오 제목을 입력해 주세요 : ");
		String title = sc.next();				
		
		if( map.containsKey(title)) {
			System.out.println("포함");
			map.replace(title, new Video());
			System.out.println("변경완료.");	
		}
		else System.out.println("입력하신 비디오는 없습니다.");
		
			
		
	}
	
	public static void delete() {
		System.out.print("삭제하실 비디오 제목을 입력해 주세요 : ");
		String title = sc.next();
		
		if(map.containsKey(title)) {
			map.remove(title);
		}
		else {
			System.out.println("입력하신 비디오는 없습니다.");
		}
	}
	
	public static void exit() {
		System.out.println("프로그램 종료");
		System.exit(0);
	}
	
	

		
		
		
		
		

}
