package ex01.lambda;

//타입을 써야 하는 상황 예제
interface Message5 {
	public int something(int x, int y);		// parameter
	public void something(String x, String y);		// parameter
}

interface Talk {
	public void something(String x, String y);
}

class  Person5 {
	public void greeting(Message5 msg) {
		int su = msg.something(1, 2);
	}
	
	public void greeting(Talk msg) {
		msg.something("Hello", "World");
	}
}

public class LambdaMain4 {
	public static void main(String[] args) {
		Person5 p = new Person5();
		
		// 람다를 이용하지 않은  평소 방법(리턴타입)
		p.greeting(new Talk() {	//익명클래스
			
			@Override
			public void something(String x, String y) {
				// TODO Auto-generated method stub
				System.out.println("parameter value : " + x + ", " + y);
				
			}
		});
		
		//람다 적용 방법
		System.out.println("==================");
		p.greeting(
				(String x,String y) ->{	//변수의 자료형 생략가능, 괄호 생략 불가능
				System.out.println("parameter value : " + x + ", " + y);
					
				});
	}
}
