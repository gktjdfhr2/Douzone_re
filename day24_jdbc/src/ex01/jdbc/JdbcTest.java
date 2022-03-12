package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

//import connUtil.*;

public class JdbcTest {
	static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testConnection() {
        try (Connection con =
                     DriverManager.getConnection(
                             "jdbc:oracle:thin:@edudb_high?TNS_ADMIN=C:\\ORACLE\\Wallet_edudb",
                             "user01",
                             "xxxxxxAt22cc"
                     )) {
           System.out.println("connection success!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
