package ex01.lambda;

interface Message2 {
	public int something();
}

class  Person2 {
	public void greeting(Message2 msg) {
		int su = msg.something();
		System.out.println(su);
		
	}
	
}

public class LambdaMain {
	public static void main(String[] args) {
		Person2 p = new Person2();
		
		// 람다를 이용하지 않은  평소 방법(리턴타입)
		p.greeting(new Message2() {
			
			@Override
			public int something() {
				// TODO Auto-generated method stub
				return 2;
			}
		});
		
		//람다 적용 방법
		System.out.println("==================");
		p.greeting(
				() ->{
					return 2;
				});
	}
}
