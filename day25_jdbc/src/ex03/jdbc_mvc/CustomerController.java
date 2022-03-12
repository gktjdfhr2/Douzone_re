package ex03.jdbc_mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import connUtil.DBConnection;

public class CustomerController {
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void connect() {
		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();			
			conn.setAutoCommit(false);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}	
	public static void printmenu() {
		System.out.println("\n-=-=-=-= JDBC Query =-=-=-=-");
		System.out.println("\n 1. 레코드 삽입(추가)");
		System.out.println("\n 2. 레코드 수정");
		System.out.println("\n 3. 전체보기");
		System.out.println("\n 4. 조건에 의한 검색(ex>사번)");
		System.out.println("\n 5. 레코드 삭제");
		System.out.println("\n 6. 프로그램 종료");
		System.out.println("원하는 메뉴를 선택 하세요.");
	}
	public static void menu() throws SQLException {
		Customer cs = new Customer();
		
		while(true) {
			printmenu();
			
			switch (sc.nextInt()) {
				case 1:					
					insert(cs.getClassName());
					selectAll(cs.getClassName());
					break;
				case 2:
					update(cs.getClassName());
					break;
					
				case 3:
					selectAll(cs.getClassName());
					break;
				
				case 6:
					close();
					System.out.println("프로그램 종료");
					System.exit(0);
				case 0:
					System.out.println("Commit 하시겠습니까?(Y/N)");
					System.out.println("안하시면 Rollback 합니다.");
					if( sc.next().equalsIgnoreCase("Y")) {
						commit();
						selectAll(cs.getClassName());
					}
					rollback();	
			}
		}
	}
	private static void rollback() throws SQLException {
		// TODO Auto-generated method stub
		conn.rollback();
		System.out.println("rollback success");
	}
	private static void commit() throws SQLException {
		// TODO Auto-generated method stub
		conn.commit();
		System.out.println("commit success");
	}
	private static void close() {
		// TODO Auto-generated method stub
		
	}
	private static void update(String className) {
		// TODO Auto-generated method stub
		System.out.print("변경할 상품 번호를 입력하세요 : ");
		String beforeCode = sc.next();
		System.out.println("변경 정보를 입력하세요");
		System.out.print("CODE : "); String afterCode = sc.next();
		System.out.print("NAME : "); String name = sc.next();
		System.out.print("EMAIL : "); String email= sc.next();
		System.out.print("PHONE : "); String phone = sc.next();
		try {
			
			pstmt = conn.prepareStatement("update gift set gno = ?, gname = ?, g_start = ?, g_end = ? where gno = ?");
			pstmt.setString(1, afterCode);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, phone);
			pstmt.setString(5, beforeCode);
			pstmt.executeUpdate();
			System.out.println(beforeCode + "데이터가 변경 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void insert(String className) {
		// TODO Auto-generated method stub
		String sql = null;
		
		System.out.println("CODE : ");	String code =sc.next();
		System.out.println("NAME : ");	String name =sc.next();
		System.out.println("EMAIL : ");	String email =sc.next();
		System.out.println("PHONE : ");	String phone =sc.next();
		sql = "INSERT INTO " + className + " VALUES(?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, code);
			pstmt.setNString(2, name);
			pstmt.setNString(3, email);
			pstmt.setNString(4, phone);
			
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "개 데이터가 추가되었습니다.");
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}
	private static void selectAll(String className) throws SQLException {
		// TODO Auto-generated method stub
			connect();			
			pstmt = conn.prepareStatement("SELECT * FROM " + className);
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();			
			
			while( rs.next()) {
				
				for (int i = 1; i <= count; i++) {
					switch (rsmd.getColumnType(i)) {
						case Types.NUMERIC:
						case Types.INTEGER:
							System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + " ");
							break;				
						case Types.FLOAT:
							System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + " ");
							break;
						case Types.DOUBLE:
							System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + " ");
							break;
						case Types.CHAR:
							System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
							break;
						case Types.DATE:
							System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + " ");
							break;
						default:
							System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
							break;
						}
				}
				System.out.println();
			}
			
			
		
	}
}
