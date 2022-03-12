package ex02.inhertance;

public class Circle extends Point {
	private int r;
	
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
//	public void disp() {
//		super.disp();
//		
//		System.out.println("\tr : " + r);
//	}
	public Circle() {
		// TODO Auto-generated constructor stub
		x = y = 10;
	}
	public Circle(int x) {
		super(x);
	}
	public Circle(int x, int y) {
		super(x,y);
	}
	public Circle(int x, int y, int r) {
		this.r = r ;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + ", x=" + x + ", y=" + y + "]";
	}
}
