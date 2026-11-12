package com.beginner.demoApplication.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.beginner.demoApplication.services.EmployeeService;
import com.beginner.demoApplication.dto.EmployeeDTO;
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
public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Integer id) {

    return ResponseEntity.ok(employeeService.getEmployee(id));
}

}
