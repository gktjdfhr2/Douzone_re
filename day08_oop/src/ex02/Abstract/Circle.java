package ex02.Abstract;

public class Circle extends Shape {

	@Override
	public double calc(double x) {
		result = x * x * Math.PI;
		
		return result;
	}

	@Override
	public void show(String x) {
		// TODO Auto-generated method stub
		calc(5.5);
		System.out.println();
		
	}
	
}
