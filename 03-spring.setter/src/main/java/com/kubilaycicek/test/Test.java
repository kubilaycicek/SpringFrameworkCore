package com.kubilaycicek.test;

import com.kubilaycicek.db.DBConnection;

public class Test {
	
	public static void main(String[] args) {
		
			DBConnection connection = new DBConnection();
			connection.setUrl("mysql:localhost:8080");
			connection.setUsername("root");
			connection.setPassword("password");
			connection.openConnection();
			connection.closeConnection();
		
	}
}
