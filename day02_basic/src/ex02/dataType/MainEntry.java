package ex02.dataType;

public class MainEntry {
	
	static int Num; //정수형은 0 실수형은0.0으로 초기화됨
	static String str; //문자열은 NULL값으로 초기화됨
	
	public static void main(String[] args) { //
		boolean b = true;
		int x = 30; 
		int y=123; //int y;지역변수는 반드시 초기화 하고 사용해야 한다
		
		int su = 99;
		
		System.out.println(b);
//		System.out.println(int(b)); boolean 타입은 정수나 실수로 변환할 수 없다.
		
		System.out.println(y); //int 4byte
		System.out.println(x); //int 4byte
		System.out.println(b); //boolean 1bit
		System.out.println(Num);
		System.out.printf(x + "," + y + "," + su);
		
		System.out.println(1000); //int 4byte
		System.out.println(1000L); //long --> 8byte 숫자 뒤에 L or l 입력
		
		double dd = 12.34;
		System.out.println(dd);
		System.out.println(345.6789); //double 8byte
		
		//컴파일은 위에서 아래로 인식하지만 대입연산자는 
		//오른쪽에서 왼쪽으로 읽음 따라서 접미사를 붙혀줘야함
		
		float ff = 12.34f; //f,F
		System.out.println(ff); //float
		
		int i = 32769; //-32768~32767
		short sh = 32767;
		
		sh = (short)i;
		System.out.println(sh);
		
		
	}
}