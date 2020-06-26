package com.kubilaycicek.Test;



import com.kubilaycicek.db.DBConnection;

public class Test {

	public static void main(String[] args) {

	DBConnection connection = new DBConnection();
	connection.openConnection();
	connection.closeConnection();
		

	}
}
