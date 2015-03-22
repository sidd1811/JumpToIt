package com.jti.phase_1;

import java.sql.*;

public class updateDb {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/JTI_DB";
	static final String USER = "root";
	static final String PASS = "black";
	
	public static void main(String[] args) {
		//FileReader
		//updateItems()
	}
	
	public static void updateItems(String itemName, String itemValue, String itemAccessMethod) {
		Connection conn = null;
		String sql1;
		
		try{
		      Class.forName("com.mysql.jdbc.Driver");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);
		      PreparedStatement preparedStatement;
		      sql1 = "UPDATE jti_iva_table SET item_name = ?, item_value = ?, item_access_method = ?;";
		      preparedStatement = conn.prepareStatement(sql1);
		      preparedStatement.setString(1, itemName);
		      preparedStatement.setString(2, itemValue);
		      preparedStatement.setString(3, itemAccessMethod);
		} catch(Exception e) {
			e.printStackTrace();			
		}
	}
}
