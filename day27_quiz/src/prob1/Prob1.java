package prob1;
 
public class Prob1 {
	public static void main(String[] args) {
		int seconds = 47567;
		System.out.println("<< " + seconds + " 초 변환 시간 >>");
		System.out.println(printTime(seconds));
		
		seconds = 11578;
		System.out.println("<< " + seconds + " 초 변환 시간 >>");
		System.out.println
		(printTime(seconds));
	}

	private static String printTime(int seconds) {
		// 구현하세요.
		int hour, minute, sec;
		hour = seconds / 3600;
		minute  = seconds % 3600 / 60;
		sec = seconds % 3600 %60;
		return hour +  "시 " + minute + "분 " + sec + "초" ;
	}
}
