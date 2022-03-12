
package ex01.generic;

public class MainEntry {
	public static void main(String[] args) {
//		GenericEx<String> t1 = new GenericEx<String>();
//		String[] str = {"abc", "kbs", "dirotor"};
//		t1.set(str);
//		t1.print();
//		System.out.println("----------------------------");
//		
//		GenericEx<Integer> t2 = new GenericEx<Integer>();
//		Integer [] num = { 1, 2, 3, 4, 5, 6, 7};	//템플릿 형태로 생성되었으니 템플릿 형태로 넣어줘야함
//		t2.set(num);

		GenericEx<Double>t1 = new GenericEx<Double>();
		
		Double[] num = {1.2,1.5,1.8,1.9,2.0};
		
		t1.set(num);		
		t1.print();
		
		
	}
}	
