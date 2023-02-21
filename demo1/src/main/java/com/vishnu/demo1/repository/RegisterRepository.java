package com.vishnu.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishnu.demo1.entity.Student;

@Repository
public interface RegisterRepository extends JpaRepository<Student, Integer>{

}
