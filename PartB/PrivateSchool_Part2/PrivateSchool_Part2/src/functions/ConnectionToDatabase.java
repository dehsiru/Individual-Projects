package functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDatabase {
    
    
    
    public static Connection openConnection() throws SQLException{
    
     String URL = "jdbc:mysql://localhost:3306/db_tables?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
     String USERNAME = "root";
     String PASS = "ABGMNPTabgmnpt2";
     Connection conn=DriverManager.getConnection(URL, USERNAME, PASS);
        
     return conn;   
    }
}
