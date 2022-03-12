package ex.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Score {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private String name;
	private int kor;
	private int eng;
	private int com;
	private int total;
	private double avg;
	
	public Score() throws IOException {
		// TODO Auto-generated constructor stub
		System.out.print("학생 이름 입력:");
		this.name = br.readLine();
		System.out.print("학생 국어점수 입력:");
		this.kor  = Integer.parseInt(br.readLine());
		System.out.print("학생 영어점수 입력:");
		this.eng = Integer.parseInt(br.readLine());
		System.out.print("학생 전산점수 입력:");
		this.com = Integer.parseInt(br.readLine());
		this.total = this.kor + this.eng + this.com;
		this.avg = (double)(total/3);
	}

	public BufferedReader getBr() {
		return br;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getCom() {
		return com;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	public void setBr(BufferedReader br) {
		this.br = br;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return " 이름=" + name + ", kor=" + kor + ", eng=" + eng + ", com=" + com + ", total="
				+ total + ", avg=" + avg + "]";
	}
	
	
}

public class Quiz_Score {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Score> lists = new ArrayList<Score>();
		int func=0;
		String name="";
		while(true) {
			home();
			func = Integer.parseInt(br.readLine());
			try {
				switch (func) {
				case 1:
					System.out.println();
					System.out.println("********** 학생 추가 **********");
					lists.add(new Score());	
					System.out.println();
					break;
				case 2:				
					System.out.println();
					System.out.println("********** 학생 삭제 **********");
					System.out.print("삭제할 학생 이름을 입력하세요 : ");
					name= br.readLine();
					for (int i = lists.size()-1; i>= 0 ; i--) {
						if(lists.get(i).getName().equals(name)) {
							System.out.println(lists.get(i).getName() +"학생 삭제");
							lists.remove(i);
						}						
					}
					break;
				case 3:				
					System.out.println();
					System.out.println("********** 학생 출력 **********");
					System.out.println("********** 학생리스트 **********");
					
					for (Score items : lists) {
						System.out.println(items);
					}
								
					break;
				case 4:
					System.out.println();
					System.out.println("********** 학생 수정 **********");
					System.out.print("수정할 학생 이름을 입력하세요 :");
					name = br.readLine();
					for (int i = lists.size()-1; i>= 0 ; i--) {
						if(lists.get(i).getName().equals(name)) {
							System.out.println(lists.get(i).getName() +"학생 수정");
							lists.set(i,new Score());
						}						
					}	
					break;
				case 5:
					System.out.println();
					System.out.println("********** 프로그램 종료 **********");					
					break;				
				}				
			} catch (Exception e) {
				// TODO: handle exception
			}
			if(func==5)	break;
			
		}
		
	}
	public static void home() {
		System.out.println("\n********** 원하시는 기능을 선택하세요 **********");
		System.out.print("( 1 : 고객 추가, 2 : 고객 삭제, 3 : 고객 리스트 출력, 4 : 고객 수정, 5 : 프로그램 종료):");
		
	}
	
	
	
}
