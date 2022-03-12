package ex08.api;

class Rectangle{
	int x,  y;
	public void disp() {
		System.out.println(x + "," + y);
	}
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
}


public class ToString {
	
	
	
	@Override
	public String toString() {
		return "ToString [toString()="+super.toString() + "]";
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.disp();
		System.out.println(r);
		System.out.println(r.toString());
	}
}
