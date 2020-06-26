package com.kubilaycicek.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kubilaycicek.db.DBConnection;

public class TestSpring {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		DBConnection dbConnection = configurableApplicationContext.getBean("dbConnection", DBConnection.class);
		dbConnection.openConnection();
		dbConnection.closeConnection();
		configurableApplicationContext.close();
	}
}
