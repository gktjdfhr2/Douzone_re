package ex01.Abstract;

abstract class Shape {
	double result = 0;
	public abstract double calc();
	public abstract void draw();
	
	public void show() {	//일반 메소드
		System.out.println("Super class Shape");
	}
}
class Triangle extends Shape {
	int h = 5;
	int w = 10;
	@Override
	public double calc() {
		// TODO Auto-generated method stub
		result = (double)((w * h) / 2);
		return result;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형의 넓이 : " + result);
		
	}
	
}
class Circle extends Shape {
	double r = 5.0;
	
	@Override
	public double calc() {
		// TODO Auto-generated method stub
		result = r * r *Math.PI;
		return result;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원의 넓이 : " + result);
		
	}
	
}
public class MainEntry {
	
	public static void main(String[] args) {
		
		Circle ci = new Circle();
		System.out.println(ci.calc());
		ci.draw();
		
		Triangle tr = new Triangle();
		System.out.println(tr.calc());
		tr.draw();
	}
}
