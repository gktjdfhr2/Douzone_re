package ex07.Enum;

enum UserStatus {
	PENDING,
	ACTIVE,
	INACTIVE,
	DELETE;
}

enum Day {
	SUNDAY,
	MONDAY,
	TUESDAY
}
public class MainEntry {
	Day day;	//열거형 변수 선언
	public MainEntry() {
		// TODO Auto-generated constructor stub
		//3.
		this.day = day;
	}
	public void tells() {
		switch(day) {
			case SUNDAY:
				break;
			default :
				break;
		}
	}
	public static void main(String[] args) {
		//1.
		System.out.println(UserStatus.ACTIVE);
		System.out.println("-----------------");
		
		//2.
		for(UserStatus status : UserStatus.values()) {
			System.out.println(status);
		}
		
		
	}
}
