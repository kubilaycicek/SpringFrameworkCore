package com.kubilaycicek.Test;

import com.kubilaycicek.db.DBConnection;

public class Test {

	public static void main(String[] args) {
		DBConnection connection =new DBConnection("mysql:localhost:8080","root","password");
		connection.openConnection();
		connection.closeConnection();
	}
}
