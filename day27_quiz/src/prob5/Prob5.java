package prob5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Prob5 {
	public static void main(String[] args) {
		String fileName = "./src/prob5/data.txt";
		makeVariable(fileName);
	}

	private static void makeVariable(String fileName) {
		// 구현하세요.		
		String url = "C:\\Users\\HASEONGROK\\DouZone\\day27_quiz\\src\\prob5\\data.txt";
		FileReader fr = null;
		BufferedReader br = null;			
		try {
			fr = new FileReader(url);
			br = new BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {			
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
