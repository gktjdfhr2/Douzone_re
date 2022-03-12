package ex02.operator;
// 최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//관계연산자 :  >, <,  >=, <=, ==, != 
		int x = 20, y  = 20;
		
		if( x != y)
			System.out.println("같지 않습니다.");
		else
			System.out.println("같습니다.");
		
		//삼항연산자  : (조건)? 참 : 거짓
		String msg = null; // msg = "";
		msg = (x != y)? "같지 않습니다." : "같습니다.";
		
		
	}
	
	
//	public static void main(String[] args) {
//		// shift연산자 : <<,>>,<<<
//		int x =  8, result;
//		
//		result =  x << 2;		
//		System.out.println("left shift result : " + result);
//	}
}
