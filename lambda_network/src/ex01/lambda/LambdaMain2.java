package ex01.lambda;

interface Message3 {
	public int something(int x);
}

class  Person3 {
	public void greeting(Message3 msg) {
		int su = msg.something(30);
		System.out.println(su);
		
	}
}

public class LambdaMain2 {
	public static void main(String[] args) {
		Person3 p = new Person3();
		
		// 람다를 이용하지 않은  평소 방법(리턴타입)
		p.greeting(new Message3() {
			
			@Override
			public int something(int x) {
				// TODO Auto-generated method stub
				System.out.println("파라미터 예제");
				System.out.println("parameter value : " + x);
				return 82;
			}
		});
		
		//람다 적용 방법
		System.out.println("==================");
		p.greeting(
				(x) ->{
					System.out.println("파라미터 예제(lambda)");
					System.out.println("parameter value : " + x);
					return 22;
				});
	}
}
