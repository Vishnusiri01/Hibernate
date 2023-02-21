package com.vishnu.demo1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishnu.demo1.costant.Appconstant;
import com.vishnu.demo1.entity.Student;
import com.vishnu.demo1.service.RegisterService;
@RestController
@RequestMapping(value=Appconstant.FORWARD_SLASH)
public class RegisterController  {
	
	@Autowired
	private RegisterService registerService;
	
	@PostMapping(value=Appconstant.SAVE_STUDENT_DETAILS)
	public void saveRegisterDetails(@RequestBody Student student) {
		registerService.saveDetails(student); 
		
	}
	
	@GetMapping(value=Appconstant.GET_ALLDETAILS)
	public  @ResponseBody List<Student> Details() {
		return registerService.getAllDetails();
		
	}
	@DeleteMapping(value=Appconstant.DELETE_BY_ID)
	public void deleteById(Integer id) {
		registerService.deleteById(id);
	}

}
