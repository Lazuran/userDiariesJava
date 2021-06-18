
package usersdiaries;
   
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author calin lazuran
 */
public class dbConnection {
    private static String dbName = "user_db";
    private static String serverName = "127.0.0.1";
    private static Integer portNumber = 3306;
    private static String userName = "root";
    private static String password = "";
    
    public static Connection getConnection() {
        Connection conn = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(serverName);
        datasource.setUser(userName);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbName);
        datasource.setPortNumber(portNumber);
             
        try {
            conn = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
}
