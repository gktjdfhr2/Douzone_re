package ex02.Abstract;

public class Trianlge extends Shape {
	int h;
	@Override
	public double calc(double x) {
		// TODO Auto-generated method stub
		result = (double)((x * h) / 2);
		return result;
	}

	@Override
	public void show(String x) {
		// TODO Auto-generated method stub
		
		System.out.println();
	}

}
