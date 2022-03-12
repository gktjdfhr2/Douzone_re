package ex03.quiz;

public class Bicycle extends Trans{
	String sound;
	String name="";
	@Override
	public void start() {
		// TODO Auto-generated method stub
		sound ="따릉따릉";
		System.out.println(name + "출발 :"+sound);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		sound ="끼익";
		System.out.println(name + "정지 :"+sound);
	}
}
