package com.example.dockerspringbootapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeTemplateService empService;
	
	@PostMapping("/createEmployee")
	public Employee createEmployee(@RequestBody Employee e) {
		
		return empService.save(e);
	}
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getEmployees(){
		return (List<Employee>) empService.findAll();
	}
	

}
