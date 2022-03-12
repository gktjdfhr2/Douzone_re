package ex06.staticMember;

class Atm {
	int count;
	static int total;
	
	public Atm(int amount) {
		count += amount;
		total += amount;
	}
	
	public static void view() {
		total = total + 100;
//		count = count + 100;	//static 함수에서 일반 변수는 사용 불가능
	}
	
	public void display() {
		System.out.println("count =" + count);
		System.out.println("total =" + total);
	}
} // Atm end


public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm at = new Atm(1000);
		at.display();
		System.out.println("-------------------------------");
		
		Atm at2 = new Atm(1000);
		at2.display();
		System.out.println("-------------------------------");
		
		Atm at3 = new Atm(1000);
		at3.display();
		System.out.println("-------------------------------");
		
		
	}	
}
