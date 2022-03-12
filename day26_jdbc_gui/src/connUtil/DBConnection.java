package connUtil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	private static Connection conn;

	private DBConnection() {
	}

	static {
		// 환경설정 파일을 읽어오기 위한 객체 생성
		Properties properties  = new Properties();
		Reader reader;
		try {
//			reader = new FileReader("D:/DouZone_th2/1_Java/workspace/day24_jdbc/src/ib/oracle.properties");  // 읽어올 파일 지정
			reader = new FileReader("C:\\Users\\HASEONGROK\\DouZone\\day25_jdbc\\src\\connUtil\\oracle.properties"); 
			properties.load(reader);                           // 설정 파일 로딩하기
		} catch (FileNotFoundException e1) {
			System.out.println("예외: 지정한 파일을 찾을수없습니다 :" + e1.getMessage());
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String driverName = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String pwd = properties.getProperty("password");

		try {
			Class.forName(driverName);
//			System.out.println("drive load success");
			conn = DriverManager.getConnection(url, user, pwd);
//			System.out.println("connection success!!!!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("예외: 드라이버로드 실패 :" + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("예외: connection fail :" + e.getMessage());
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return conn;
	}
	public static void close() {
		
	}
	public static void menu() {
		System.out.println("\n-=-=-=-= JDBC Query =-=-=-=-");
		System.out.println("\n 1. 레코드 삽입(추가)");
		System.out.println("\n 2. 레코드 수정");
		System.out.println("\n 3. 전체보기");
		System.out.println("\n 4. 조건에 의한 검색(ex>사번)");
		System.out.println("\n 5. 레코드 삭제");
		System.out.println("\n 6. 프로그램 종료");
		System.out.println("원하는 메뉴를 선택 하세요.");
	}
	
}







