package com.beginner.demoApplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beginner.demoApplication.repositories.EmployeeRepository;

@Service 
public class EmployeeService {
    @Autowired 
    EmployeeRepository employeeRepository;
    public String getEmployee(Integer id){
        final String emp=employeeRepository.getEmployee(id);
        return emp;    
        }

}
