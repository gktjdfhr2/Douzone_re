package ex03.quiz;

public class Subway extends Trans{
	String sound="";
	String name="";
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
		sound ="털컹털컹";
		System.out.println(name + "출발 :" + sound);
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		sound ="끼이이이이이익";
		System.out.println(name + "정지 :" + sound);
		
	}
	public String name(String name) {
		
		return name;
	}
	
}
