package ex.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Customers{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private String name, addr, number;

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public String getnumber() {
		return number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setnumber(String number) {
		this.number = number;
	}
	public void addCustomer() throws IOException {

		System.out.print("추가할 고객명을 입력하세요:");
		this.name = br.readLine();
		System.out.print("추가할 고객의 주소를 입력하세요:");
		this.addr = br.readLine();
		System.out.print("추가할 고객의 휴대폰 번호를 입력하세요:");
		this.number = br.readLine();	
	}
	public void updateCustomer() throws IOException {

		System.out.print("변경할 고객명을 입력하세요:");
		this.name = br.readLine();
		System.out.print("변경할 고객의 주소를 입력하세요:");
		this.addr = br.readLine();
		System.out.print("변경할 고객의 휴대폰 번호를 입력하세요:");
		this.number = br.readLine();	
	}
	
	
	
	@Override
	public String toString() {
		return " 고객명 = " + name + ", 주소 =" + addr + ", 전화번호 = " + number;
	}
	
	
	
}
public class Quiz_Customer {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int cnt;
		int man=0;
		Customers[] cs = new Customers[100];
		Customers update = new Customers();
		String name=""; 
		
		ArrayList<Customers> lists = new ArrayList<>();		
		while(true) {
			System.out.print("원하시는 기능을 입력하세요(1: 고객 추가, 2: 고객 삭제, 3: 고객 리스트 출력, 4: 고객 정보 수정, 5: 프로그램 종료 ");
			cnt = Integer.parseInt(br.readLine()); 
			
			switch (cnt) {
			case 1:
				System.out.println("------------- 고객 추가-------------");
				cs[man] = new Customers();
				cs[man].addCustomer();
				lists.add(cs[man]);
				System.out.println(lists);
				System.out.println("추가 완료");
				man++;
				continue;
			case 2:
				
				System.out.println("------------- 고객 삭제-------------");
				System.out.print("삭제할 고객명을 입력하세요:");
				name = br.readLine();				
				for (int i = lists.size()-1; i >= 0; i--) {
					if(name.equals(lists.get(i).getName())){						
						System.out.println(lists.get(i).getName() + "의 고객정보 삭제");
						lists.remove(i);
						man--;						
					}					
				}				
				continue;
			case 3:
				System.out.println("------------- 고객 리스트 출력-------------");				
				for (Customers item : lists) {
					System.out.println(item);
				}				
				System.out.println("추가 완료");
				continue;
			case 4:
				System.out.println("------------- 고객 정보 수정-------------");				
				System.out.print("변경할 고객명을 입력하세요:");
				name = br.readLine();
				System.out.println("변경할 정보를 이름 주소 휴대폰번호 순으로 입력하세요 ex) \"하성록\" \"부산\" \"01000000000\"  ");
				update.updateCustomer();
				
				
				for (int i = lists.size()-1; i >= 0; i--) {
					if(name.equals(lists.get(i).getName())){						
						System.out.println(lists.get(i).getName() + "의 고객정보 수정");
						lists.set(i,update);
						man--;						
					}					
				}	
				System.out.println("추가 완료");
				continue;
			case 5:
				System.out.println("------------- 프로그램 종료-------------");				
				break;			
			}
			System.out.println();
			if(cnt == 5) break;
			
		}
	}
}

//고객 추가/ 삭제 / 고객 리스트 출력 / 수정 / 프로그램 종료 
//Map : 이름 주소 연락
