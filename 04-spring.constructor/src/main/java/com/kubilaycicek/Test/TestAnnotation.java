package com.kubilaycicek.Test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kubilaycicek.config.AppConfig;
import com.kubilaycicek.db.DBConnection;

public class TestAnnotation {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		DBConnection connection = applicationContext.getBean(DBConnection.class);
		connection.openConnection();
		connection.closeConnection();
		applicationContext.close();
	}

}
