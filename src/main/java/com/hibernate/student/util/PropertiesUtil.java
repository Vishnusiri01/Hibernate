package com.hibernate.student.util;

import java.util.Properties;

public class PropertiesUtil {
	
	public static Properties getProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/trail1");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "123456789");
		properties.setProperty("hibernate.show_sql", "true");
		
		return properties;
	}

}
