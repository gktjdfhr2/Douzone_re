package ex02.Abstract;

public class Rect extends Shape{
	int h = 10;
	@Override
	public double calc(double x) {
		// TODO Auto-generated method stub
		result = x * h;
		return result;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		calc(10);
		System.out.println(name + "의 크기는 " + result + " 입니다.");
	}

}
