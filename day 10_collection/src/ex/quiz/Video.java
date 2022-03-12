package ex.quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Video {	//model
	static Scanner sc = new Scanner(System.in);
	public static Scanner getSc() {
		return sc;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getLend() {
		return lend;
	}

	public String getLendName() {
		return lendName;
	}

	public String getLendDate() {
		return lendDate;
	}

	public static void setSc(Scanner sc) {
		Video.sc = sc;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setLend(String lend) {
		this.lend = lend;
	}

	public void setLendName(String lendName) {
		this.lendName = lendName;
	}

	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}

	protected String title;
	protected String category;
	protected String lend;
	protected String lendName;
	protected String lendDate;
	
	public Video() {
		// TODO Auto-generated constructor stub
		System.out.print("변경할 비디오 제목 입력:");
		this.title = sc.next();
		System.out.println("변경할 비디오 장르 입력");
		this.category = sc.next();
		System.out.print("대여 여부를 입력하세요 < y/n >: ");
		this.lend = sc.next();
		this.lendDate = todayDate();
		if(lend.equals("y")) {
			System.out.print("대여자 명을 입력하세요:");
			lendName = sc.next();
		}
	}
	
	public Video(String title, String category) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.category = category;
		System.out.print("대여 여부를 입력하세요 < y/n >: ");
		this.lend = sc.next();
		this.lendDate = todayDate();
		if(lend.equals("y")) {
			System.out.print("대여자 명을 입력하세요:");
			lendName = sc.next();
		}
		
	}

	private String todayDate() {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		Date day = cal.getTime();
		
		
		SimpleDateFormat today;
		today = new SimpleDateFormat("yy-MM-dd EEEE");
		return today.format(day);
	}
}