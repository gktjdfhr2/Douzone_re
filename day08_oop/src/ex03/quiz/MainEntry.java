package ex03.quiz;

public class MainEntry {
	//Trans 추상클래스
	//추상메소드 start() / stop()
	//public String name(String name) {
	//	return name;
	//}	
	//sub class: Subway / Bus / Bicycle / Plain
	
	public static void main(String[] args) {
		Trans[] tr = new Trans[4];
		
		String []name = {"Subway", "Biclycle","Bus","Prain"};
		Object []trans = {new Subway(), new Bicycle(), new Bus(), new Plain()};
		
		for(int i = 0; i< name.length; i++) {
			
			tr[i] = (Trans)trans[i];
			System.out.println(tr[i].name(name[i]));
			tr[i].start();
			tr[i].stop();
			
		}
		

	}
}
