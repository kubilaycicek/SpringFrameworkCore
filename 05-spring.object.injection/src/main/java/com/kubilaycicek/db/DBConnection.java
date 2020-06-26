package com.kubilaycicek.db;

public class DBConnection {
	
	public Database database;
	
	public void openConnection() {
		System.out.println("Open connection");
		System.out.println(this.database.toString());
	}
	
	public void closeConnection() {
		System.out.println("Close connection");
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
	
	public Database getDatabase() {
		return database;
	}
	
}
