package ex02.jdbc_mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import connUtil.DBConnection;

public class GiftController {	//Controller
	
	// 연결, 삽입, 삭제, 수정, 검색,.....
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
	
	
	
	//menu
	
	public static void menu() throws SQLException {
		Gift gift = new Gift();
		
		while(true) {
			DBConnection.menu();
			
			switch(sc.nextInt()) {
				case 1:
					selectAll(gift.getClassName());
					insert();
					selectAll(gift.getClassName());
					break;
				case 2:
					update(gift.getClassName());
					break;
					
				case 3:
					selectAll(gift.ClassName);
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
						selectAll(gift.getClassName());
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
	public static void commit() throws SQLException {
		conn.commit();
		System.out.println("commit success");
	}



	private static void selectAll(String className) throws SQLException {
		// TODO Auto-generated method stub
		rs = stmt.executeQuery("select * from " + className);
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
				}	//end switch
			}	//end for
			System.out.println();
		}	//end while
	}

	private static void insert() {
		// TODO Auto-generated method stub
		System.out.println("GNO : ");	String gno =sc.next();
		System.out.println("GNAME : ");	String gname =sc.next();
		System.out.println("G_START : ");	String g_start =sc.next();
		System.out.println("G_END : ");	String g_end =sc.next();
		
		
		try {
			pstmt = conn.prepareStatement("INSERT INTO gift VALUES(?,?,?,?)");
			pstmt.setNString(1, gno);
			pstmt.setNString(2, gname);
			pstmt.setNString(3, g_start);
			pstmt.setNString(4, g_end);
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "개 데이터가 추가 되었습니다.");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private static void update(String className) throws SQLException{
		System.out.print("변경할 상품 번호를 입력하세요 : ");
		String beforeGno = sc.next();
		System.out.println("변경 정보를 입력하세요");
		System.out.print("GNO : "); String afterGno = sc.next();
		System.out.print("GNAME : "); String gname = sc.next();
		System.out.print("G_START : "); String g_start = sc.next();
		System.out.print("G_END : "); String g_end = sc.next();
		try {
			
			pstmt = conn.prepareStatement("update gift set gno = ?, gname = ?, g_start = ?, g_end = ? where gno = ?");
			pstmt.setString(1, afterGno);
			pstmt.setString(2, gname);
			pstmt.setString(3, g_start);
			pstmt.setString(4, g_end);
			pstmt.setString(5, beforeGno);
			pstmt.executeUpdate();
			System.out.println(beforeGno + "데이터가 변경 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void select(String className) throws SQLException{
		
	}
	
	
	public static void close() {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
