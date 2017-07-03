package com.revature.Utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
public static Connection getconnection() throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection= DriverManager.getConnection("jdbc:mysql://35.154.162.204:3337/jpr_db","jpr_user","jpr_pwd");
		return connection;
	
	
}

}
