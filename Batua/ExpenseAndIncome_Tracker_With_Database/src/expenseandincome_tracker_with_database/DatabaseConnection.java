

package expenseandincome_tracker_with_database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 1BestCsharp
 */
public class DatabaseConnection {

    private static final String DB_NAME = "expense_income_db";
    private static final String JDBC_URL = "jdbc:mysql://localhost:8889/"+DB_NAME;
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    
    // create a function to get the connection
    public static Connection getConnection(){

        Connection connection = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL,USER,PASSWORD);
            System.out.println("Connected to the database");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Connection - ClassNotFoundException: " + ex.getMessage());
        }
        
        return connection;
        
    }
    
    
}
