package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException{
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		String dbURL = "jdbc:mysql:://127.0.0.1:3306";
		String dbName = "";
		String dbUsername = "root";
		String dbPassword = "reven5397";
		
		Class.forName(dbDriver);
		Connection obj = DriverManager.getConnection(dbURL+dbName+dbUsername+dbPassword);
		
		return obj;	
	}

}
