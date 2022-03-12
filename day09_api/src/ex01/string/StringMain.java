package ex01.string;

public class StringMain {
	public static void main(String[] args) {
		
		int x =3, y = 5;		
		System.out.println("x = " + x + "\ty =" + y);
		
		x = y;
		System.out.println("x = " + x + "\ty =" + y);
		
		String s1 = "korea";
		String s2 = "happy";
		
		System.out.println("s1 =" + s1 + "\ts2 = "+ s2);
		System.out.println("s1.hashCode() =" + s1.hashCode() + "\ts2.hashCode() = "+ s2.hashCode());
		s1 = s2;
		System.out.println("s1 =" + s1 + "\ts2 = "+ s2);
		System.out.println("s1.hashCode() =" + s1.hashCode() + "\ts2.hashCode() = "+ s2.hashCode());
	
		s1 = "rok";
		System.out.println("s1 =" + s1 + "\ts2 = "+ s2);
		System.out.println("s1.hashCode() =" + s1.hashCode() + "\ts2.hashCode() = "+ s2.hashCode());
		
		s2 ="hahaha";
		System.out.println("s1 =" + s1 + "\ts2 = "+ s2);
		System.out.println("s1.hashCode() =" + s1.hashCode() + "\ts2.hashCode() = "+ s2.hashCode());
		
		s1 = s2;
		
		System.out.println("s1=" + s1 + "s2" + s2);
		System.out.println("s1.hashCode() =" + s1.hashCode() + "\ts2.hashCode() = "+ s2.hashCode());
	}
	
	
}
