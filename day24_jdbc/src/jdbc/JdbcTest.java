package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

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
                             "admin",
                             "71039818hH!!"
                     )) {
           System.out.println("connection success!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

