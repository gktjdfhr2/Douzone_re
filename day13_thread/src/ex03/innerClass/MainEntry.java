package ex03.innerClass;

class OuterClass {	//외부클래스
	static  int no;
	String message = "hi~~~";
	
	public void outerMethod() {
		System.out.println("outer method call~~");
//		System.out.println(su);	//외부 클래스는 내부의 멤버 사용 불가능
	}
	
	class InnerClass{	//내부클래스
		int su = 99;
		public void show() {
			System.out.println(su);	// 내부(자신의 것) 사용가능
			System.out.println(message);	// 외부클래스 멤버 사용 가능
		}
		
		public void disp() {
			outerMethod();
		}
	}	//InnerClass
	
}	//OuterClass end
public class MainEntry {
	public static void main(String[] args) {
		//1.
		OuterClass oc = new  OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		inner.disp(); inner.show();
		System.out.println("============================");
		
		//2.
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.show();
	}
}
