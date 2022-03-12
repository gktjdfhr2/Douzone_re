package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MainEntry {
	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>(); //앞에 자료형 타입이 입력되면 뒤에는 입력할 필요 없음
		
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");
//		hs.add(12.34);	//문자열로 선언하여 정수형 타입 add불가능
		
		System.out.println("요소 개수 : " + hs.size() );
		
//		HashSet<int> hs2 = new HashSet<int>();	//컬렉션의 타입 파라미터 내에서는 클래스 자료형(Wrapper Class)가 와야함
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
//		hs2.add(12.34);
		
		System.out.println("요소 개수 : " + hs.size());
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("---------------");
		
		for (Object item : hs2) {
			System.out.println(item);
		}
		
		System.out.println("--------------");
		System.out.println(hs);
		
	}
	/*
	 * public static void main(String[] args) { Object[] objArr = { "1", new
	 * Integer(1), "2", "2", "3", "4", "t", "4", 1 , 12.34}; //자료형 타입이 다른건 중복으로 취급
	 * 안함
	 * 
	 * Set set = new HashSet();
	 * 
	 * for (int i = 0; i < objArr.length; i++) { set.add(objArr[i]); }
	 * 
	 * System.out.println(set);
	 * 
	 * }
	 */}
