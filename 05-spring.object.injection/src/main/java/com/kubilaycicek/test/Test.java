package com.kubilaycicek.test;

import com.kubilaycicek.db.DBConnection;
import com.kubilaycicek.db.Database;

public class Test {

	public static void main(String[] args) {

		Database database = new Database("mysql:localhost:8080", "root", "1234");

		DBConnection connection = new DBConnection();
		connection.setDatabase(database);
		
		connection.openConnection();
		connection.closeConnection();
	}

}
