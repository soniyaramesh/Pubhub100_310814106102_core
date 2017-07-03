package com.revature.Utill;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
public static Connection getconnection() {
	Connection connection=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://35.154.162.204:3337/jpr_db","jpr_user","jpr_pwd");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return connection;
	
	
}

}
