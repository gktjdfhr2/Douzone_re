package ex02.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		
		Shape[]ss = new Shape[3]; //배열 선언 및 생성
//		Shape ss = new Shape(); //자체적으로 객체 생성 못함
		
		ss[0] = new Circle();
		ss[1] = new Rect();
		ss[2] = new Trianlge();
		String[] name = {"Circle", "Rect", "Triangle"};
		
		Object[] shape = {new Circle(), new Rect() , new Trianlge()};
		for (int i = 0; i < ss.length; i++) {
			ss[i] = (Shape)shape[i];
		}
		
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].show(name[i]);
		}
				
		
		Shape sh = new Circle();
		sh.show("Circle Circle");
		
		sh = new Rect();
		sh.show("Rect Rect");
		
		
		Circle c = new Circle();
		c.show("원");
		
		Rect r = new Rect();
		r.show("Rectangle");
		
		Trianlge t = new Trianlge();
		t.show("삼각형");
		
		Shape s = new Circle();
		s.show("Circle");
	}
}
