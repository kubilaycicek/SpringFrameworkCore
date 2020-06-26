package com.kubilaycicek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kubilaycicek.db.DBConnection;
import com.kubilaycicek.db.Database;

@Configuration
public class AppConfig {

	@Bean
	public Database database() {
		Database database = new Database("mysql:localhost", "root", "1234");
		return database;
	}

	@Bean
	public DBConnection dbConnection() {
		DBConnection connection = new DBConnection();
		connection.setDatabase(this.database());
		return connection;
	}

}
