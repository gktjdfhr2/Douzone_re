package ex03.quiz;

public class Bus extends Trans{
	String sound;
	String name="";
	@Override
	public void start() {
		// TODO Auto-generated method stub
		sound ="부릉부릉";
		System.out.println(name + "출발 :"+sound);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		sound ="끼이이익";
		System.out.println(name + "정지 :"+sound);
	}
	
}
