package com.beginner.demoApplication.repositories;

import org.springframework.stereotype.Repository;

import entities.Employee;

@Repository     
public class EmployeeRepository {
    public Employee getEmployee(Integer id){
        return new Employee(282067, "Shafiq", "ICT", 29);
        
    }
}
