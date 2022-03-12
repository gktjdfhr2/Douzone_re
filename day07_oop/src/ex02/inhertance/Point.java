package ex02.inhertance;

public class Point {
	protected int x,y;
	public Point() {
		// TODO Auto-generated constructor stub
		x=y=20;
		System.out.println("Point default");
	}
	
	public Point(int x) {
		this.x = x;
		y = 9;
		System.out.println("Point 1");
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point 2");
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	
//	public void disp() {
//		// TODO Auto-generated method stub
//		System.out.print("x: " + x + "\ty : " + y);		
//	}
	
//	public String toString() {
//		String str ="X :" + x + "\ty : " + y;
//		return str;
//	}


}
