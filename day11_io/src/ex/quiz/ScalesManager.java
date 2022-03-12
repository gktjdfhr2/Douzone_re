package ex.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ScalesManager extends Scales {	
	
	public ScalesManager() throws NumberFormatException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	static ArrayList<Scales> lists = new ArrayList<Scales>(); 
	
	public static void insert() throws NumberFormatException, IOException {
		lists.add(new Scales());		
		System.out.println("추가 완료");
	}
	
	public static void delete() throws IOException {
		System.out.print("삭제할 이름 입력:");
		String name = br.readLine();
		for (int i = lists.size()-1; i >= 0; i--) {			
			if (lists.get(i).getName().equals(name)) {
				System.out.println(lists.get(i).getName() + "의 정보 삭제");
				lists.remove(i);
			}
		}
	}
	
	public static void print() {
//		왠지는 모르겠지만 Itertator에 bmi값이 안들어감
//		Iterator<Scales> it = lists.iterator();
//		
//		System.out.println("  이름\t키\t몸무게\tBMI");
//		System.out.println(it.next());
		System.out.println(" 이름 \t키\t몸무게\tBMI");
		for (int i = 0; i < lists.size(); i++) {
			System.out.print(lists.get(i).getName() + "\t");
			System.out.print(lists.get(i).getTall()+ "\t");
			System.out.print(lists.get(i).getWeight()+ "\t");
			System.out.println(lists.get(i).getBmi()+ "\t");			
		}
		
	}
	
	public static void fileSave() throws IOException {
		
		ObjectOutputStream oos = null;
		File f = new File("bmiInfo.txt");
		try {
			
			
			FileOutputStream fos = new FileOutputStream(f, false);
			oos = new ObjectOutputStream(fos);
			for (int i = 0; i < lists.size(); i++) {
				oos.writeObject("---------" +lists.get(i).getName()+"의 정보 ---------") ;
				oos.writeObject("키 :" + lists.get(i).getTall());
				oos.writeObject("몸무게 : "+ lists.get(i).getWeight());				
				oos.writeObject("bmi : " + lists.get(i).getBmi());
			}

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			oos.close();
		}	
	}
	
	public static void fileOutput() {
		File f = new File("bmiInfo.txt");
		FileInputStream fis = null;
		ObjectInputStream bis = null;
		
		try {
			fis = new FileInputStream(f);
			bis = new ObjectInputStream(fis);
			
			for (int i = 0; i < lists.size(); i++) {
				System.out.println();
				System.out.println(bis.readObject());
				System.out.println(bis.readObject());
				System.out.println(bis.readObject());
				System.out.println(bis.readObject());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			
		} finally {
			
			
		}
	}
	
}
