package ex04.staticMethod;

class A{
	public static void setData(int xx, int yy) {
		System.out.println(xx + "," + yy);
	}
}
public class MainEntry {
	public static void main(String[] args) {
		int x, y;
		
		//static method
		A a = new A();
		x=10;
		y=20;
		a.setData(x, y);
	}
}
