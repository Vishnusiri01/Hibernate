package com.hibernate.student.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.student.dto.StudentDto;
import com.hibernate.student.entity.StudentEntity;
import com.hibernate.student.util.SessionFactoryUtil;


public class StudentRepository {
	
	public void saveStudentDetails(StudentEntity studentEntity) {
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(studentEntity);
		transaction.commit();
	}
	
	public StudentEntity findStudentById(int id) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
		Session session = sessionFactory.openSession();
		StudentEntity entity = session.get(StudentEntity.class, id);
		return entity;
	}
	
	public void UpdateStudentDetails(StudentDto dto) {
		StudentEntity studentEntity = findStudentById(dto.getId());
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
		Session session = sessionFactory.openSession();
		studentEntity.setEmail(dto.getEmail());
		studentEntity.setHighestQualification(dto.getHighestQualification());
		Transaction transaction = session.beginTransaction();
		session.update(studentEntity);
		transaction.commit();
		
	}
	public void deleteStudentDetailsById(int id) {
		StudentEntity studentById = findStudentById(id);
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
		Session session = sessionFactory.openSession();
		
//		String query="delete from student where id=:d";
//		Query query2 = session.createQuery(query);
//		session.delete(query2);
		
		Transaction transaction = session.beginTransaction();
		session.delete(studentById);
		transaction.commit();
		
		
	}

}
