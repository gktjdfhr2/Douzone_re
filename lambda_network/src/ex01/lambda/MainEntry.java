package ex01.lambda;

interface Message {
	public void something();
}

class  Person {
	public void greeting(Message msg) {
		msg.something();
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Person p = new Person();
		
		// 람다를 이용하지 않은  평소 방법(매개변수 없
		p.greeting(new Message() {
			
			@Override
			public void something() {
				// TODO Auto-generated method stub
				System.out.println("good morning");
				System.out.println("반가워요~~~");
			}
		});
		
		//람다 적용 방법
		System.out.println("==================");
		p.greeting(
				() ->{
					System.out.println("good morning");
					System.out.println("힘내요~~~");
				});
	}
}
