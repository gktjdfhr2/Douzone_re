package ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;import javax.print.DocFlavor;

public class VectorEx02 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5); // 초기용량 : 3, 증가용량 : 5
		
		System.out.println("--------- 3개 객체 추가 ---------");
		v.addElement("자바");
		v.addElement(new Double(10.2));
		v.addElement(date);		
		System.out.println("size:" + v.size() + " , capacity : "  + v.capacity());	//증가는 5씩된다
		
		System.out.println();
		System.out.println("--------- 10개 객체 추가 ---------");
		for (i = 0; i < 10; i++) {
			v.addElement(new Integer(i));			
		}		
		System.out.println("size:" + v.size() + " , capacity : "  + v.capacity());
		
		System.out.println();
		System.out.println("--------- Vector 내용 출력 ---------");
		System.out.println(v);
		Enumeration enu = v.elements();
		
		while( enu.hasMoreElements()) {
			System.out.print(enu.nextElement() +  "  ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("--------- 객체 내용 포함 확인 ---------");
		if( v.contains("자바")) System.out.println("자바 문자열 포함됨");
		
		System.out.println("10.2 객체의 위치는? " + v.indexOf(new Double(10.2)));
		System.out.println("size:" + v.size() + " , capacity : "  + v.capacity());
		
		System.out.println();
		System.out.println("********************");
		
		
		
		v.removeElementAt(v.indexOf(date));	// date 객체 삭제
		System.out.println("size : "+ v.size() + " , capacity : " + v.capacity());
		System.out.println(v);
		
		for (i = 0; i <v.size(); i++) {
//			v.removeElementAt(i);		//i번째 값을 지운뒤 비워진 값을 다음번째 값이 땡겨져 채워짐	
//			v.remove(0);	// 0번째 값만 지움
//			v.removeAllElements();	//전체값 지움
			
			
		}
		v.remove(new Integer(5));
		System.out.println();
		System.out.println("size : "+ v.size() + " , capacity : " + v.capacity());
		System.out.println(v);
		System.out.println("\n\n");
		v.trimToSize();
		System.out.println("size :" + v.size() + " , capacity : " + v.capacity());
		
		v.removeAllElements();
		System.out.println("size : " + v.size() + " , capacity : " + v.capacity());
		
		
		
	}
}
