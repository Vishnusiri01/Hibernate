package com.hibernate.student.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.student.entity.StudentEntity;

public class SessionFactoryUtil {
	
	private static SessionFactory factory=null;
	
	public static SessionFactory getSessionFactoryObject() {
		if(factory==null) {
		Properties properties = PropertiesUtil.getProperties();
		Configuration cfg = new Configuration();
		cfg.addProperties(properties);
		cfg.addAnnotatedClass(StudentEntity.class);
		factory = cfg.buildSessionFactory();
		}
		return factory;
		
	}

}
