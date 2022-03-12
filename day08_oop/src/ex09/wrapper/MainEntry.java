package ex09.wrapper;

class Point {
	
}

public class MainEntry {
	public static void main(String[] args) {
		Integer la = new Integer(10);
		Integer lb = new Integer("10");
		String su = "30";
		Point pt = new Point();
		
		System.out.println(pt);
		System.out.println(pt.toString());
		System.out.println(pt.getClass().getName() + "@" + Integer.toHexString(pt.hashCode()));
		System.out.println();
		
		//래퍼클래스는 toHexString을 사용해도 주소가 아닌 실제 데이터 값을 뽑아냄
		System.out.println(la);
		System.out.println(la.getClass().getName() + "@" + Integer.toHexString(la.hashCode()));
		
		int x = 77;
		double y = 5.5;
		System.out.println(x + "," + y);
		
		x = (int)y;
		System.out.println(x + "," + y);
		
		//Boxing vs UnBoxing
		int c = la.intValue();	// jdk 4.x 이전에 사용하던 메소드
		int d = lb;	// jdk 5.x 이후부터 autoboxing, unboxing		
		System.out.println("-------------");
		System.out.println(c + "," + d);
		
		int num = Integer.parseInt(su);
		
		System.out.println(c +num);
		System.out.println(c + d);
		System.out.println(la.MAX_VALUE);
		System.out.println(la.MIN_VALUE);
		System.out.println("===============");
		Double dd = new Double(12.34);
		System.out.println(dd);
		System.out.println(dd.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		System.out.println("===============");
//		c = (int)dd;
		c= (int)dd.doubleValue();
		System.out.println(c);
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("11111111", 2);
		System.out.println(e + 20);
		System.out.println(f);
		
		System.out.println("===============");
		
		int xx = 3;	// stack memory
		Integer yy = new Integer(3);	//heap memory
	}
}
