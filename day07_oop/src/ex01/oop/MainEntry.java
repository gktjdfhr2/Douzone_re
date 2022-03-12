package ex01.oop;

public class MainEntry {
	private int x, y;

	public static void main(String[] args) {
		
	Circle c = new Circle();
	c.setX(100);	c.setY(100);	c.setR(5);	c.disp();
	
	System.out.println("=================");
	Point pt = new Point();
	pt.disp();
	pt.setX(5);	pt.setY(10);	pt.disp();
	}
}
