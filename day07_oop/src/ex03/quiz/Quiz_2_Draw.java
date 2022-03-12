package ex03.quiz;

public class Quiz_2_Draw {
	protected int w,h;
	protected double result;
	
	
	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}

	public double getResult() {
		return result;
	}

	public void setW(int w) {
		this.w = w;
	}

	public void setH(int h) {
		this.h = h;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public Quiz_2_Draw() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Quiz_2_Draw [w=" + w + ", h=" + h + ", result=" + result + "]";
	}

	protected double calc () {
		return result;
	}
	

}
