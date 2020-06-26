package com.kubilaycicek.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kubilaycicek.db.DBConnection;

public class TestSpring {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DBConnection connection = (DBConnection)applicationContext.getBean("dbConnection");
		
		connection.openConnection();
		
		connection.closeConnection();
		
		applicationContext.close();
	}

}
