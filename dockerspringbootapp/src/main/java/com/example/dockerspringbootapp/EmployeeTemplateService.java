package com.example.dockerspringbootapp;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeTemplateService  extends CrudRepository<Employee, Long>{

}
