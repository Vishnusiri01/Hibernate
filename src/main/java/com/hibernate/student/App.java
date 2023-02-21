package com.hibernate.student;

import com.hibernate.student.entity.StudentEntity;
import com.hibernate.student.repository.StudentRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       StudentEntity studentEntity = new StudentEntity();
       studentEntity.setName("vishnu");
       studentEntity.setEmail("yallasiri9@gmail.com");
       studentEntity.setHighestQualification("B.tech");
       studentEntity.setYearOfPassing("2022");
       
       StudentRepository studentRepository = new StudentRepository();
       studentRepository.saveStudentDetails(studentEntity);
       
    }
}