package ex06.oop;

class Point {
	private	int x,y;

	public int getX() {
		return x;
	}

	public void setX(int xx) {
		x = xx;
	}

	public int getY() {
		return y;
	}

	public void setY(int yy) {
		y = yy;
	}
	
}
public class MainEntry {
	public static void main(String[] args) {	
		Point pt = new Point();
		System.out.println(pt.getX() + "," + pt.getY());
		pt.setX(9);		pt.setY(8);
		
		System.out.println(pt.getX() + "," + pt.getY());
	}
}
