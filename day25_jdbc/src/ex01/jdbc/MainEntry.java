package ex01.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connUtil.DBConnection;



public class MainEntry {
	
	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			//SQL 구문, HTML 태그는 java/jsp/servlet에서는 문자열 취급한다.
			String sql = "CREATE TABLE kosaTab(name VARCHAR2(20), age NUMBER)";
			System.out.println(sql.toString());
			stmt.executeUpdate(sql); //반환값이 없는 경우 (update, insert, delete)
			
			sql = "INSERT INTO kosaTab VALUES('aa', 33)";
			int result = stmt.executeUpdate(sql);
			
			sql = "SELECT * FROM kosaTab";
			rs = stmt.executeQuery(sql);	//반환값이 있는 경우 (select)
			
			
			
			while( rs.next()) {
				System.out.println("name : " + rs.getString(1));
				System.out.println("age : " + rs.getString("age"));
			}
			
			sql = "drop table kosaTab";
			result = stmt.executeUpdate(sql);
			System.out.println("drop table : " + result);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {			
			rs.close();
			stmt.close();
			conn.close();
		}
	}
}
