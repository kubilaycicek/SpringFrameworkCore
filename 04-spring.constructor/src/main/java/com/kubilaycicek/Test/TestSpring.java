package com.kubilaycicek.Test;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kubilaycicek.db.DBConnection;

public class TestSpring {

	public static void main(String[] args) {
	
		System.out.println("--------CONSTRUCTOR-----------");
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		DBConnection dbConnection = configurableApplicationContext.getBean("dbConnection", DBConnection.class);
		dbConnection.openConnection();
		dbConnection.closeConnection();
		configurableApplicationContext.close();
		
		System.out.println("---------------INDEX-----------------");
		ConfigurableApplicationContext configurableApplicationContext2 = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		DBConnection dbConnection2 = configurableApplicationContext2.getBean("dbConnectionIndex", DBConnection.class);
		dbConnection2.openConnection();
		dbConnection2.closeConnection();
		configurableApplicationContext2.close();
		
		

	}

}
