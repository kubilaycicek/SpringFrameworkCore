package com.kubilaycicek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kubilaycicek.db.DBConnection;

@Configuration
public class AppConfig {

	@Bean
	public DBConnection getDBConnection() {
		DBConnection dbConnection = new DBConnection();
		return dbConnection;
	}
	
}
