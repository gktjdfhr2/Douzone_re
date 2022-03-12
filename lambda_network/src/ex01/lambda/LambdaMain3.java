package ex01.lambda;

interface Message4 {
	public int something(int x, int y);
}

class  Person4 {
	public void greeting(Message4 msg) {
		int su = msg.something(1, 2);
		System.out.println(su);
		
	}
}

public class LambdaMain3 {
	public static void main(String[] args) {
		Person4 p = new Person4();
		
		// 람다를 이용하지 않은  평소 방법(리턴타입)
		p.greeting(new Message4() {
			
			@Override
			public int something(int x, int y) {
				// TODO Auto-generated method stub
				System.out.println("파라미터 예제");
				System.out.println("parameter value : " + x + ", " + y);
				return 8282;
			}
		});
		
		//람다 적용 방법
		System.out.println("==================");
		p.greeting(
				(x, y) ->{	//변수의 자료형 생략가능, 괄호 생략 불가능
					System.out.println("파라미터 예제(lambda)");
					System.out.println("parameter value : " + x + ", " + y);
					return 2222;
				});
	}
}
