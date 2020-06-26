package com.kubilaycicek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kubilaycicek.db.DBConnection;

@Configuration
public class AppConfig {
	@Bean
	public DBConnection getDbConnection() {
		DBConnection dbConnection = new DBConnection();
		dbConnection.setUrl("mysql:localhost:8080");
		dbConnection.setUsername("root");
		dbConnection.setPassword("password");
		return dbConnection;
		
	}
}
