package com.beginner.demoApplication.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.beginner.demoApplication.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController 
public class Employeecontroller {
@Autowired 
EmployeeService employeeService;

// Second endpoint
@GetMapping("/employee/{id}")
public ResponseEntity<String> getEmployee(@PathVariable Integer id) {

    
    String employee=employeeService.getEmployee(id);
    return ResponseEntity.ok(employee);
}

}
