package com.vishnu.demo1.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishnu.demo1.entity.Student;
import com.vishnu.demo1.repository.RegisterRepository;

@Service
public class RegisterService {
	@Autowired
	private RegisterRepository registerRepository;

	public void saveDetails(Student student) {
		registerRepository.save(student);
	}
	
	public List<Student> getAllDetails() {
		
		List<Student> student = registerRepository.findAll();
		
		return student;
	}
	
	public void deleteById(Integer id) {
		registerRepository.deleteById(id);
	}
	
	

}
