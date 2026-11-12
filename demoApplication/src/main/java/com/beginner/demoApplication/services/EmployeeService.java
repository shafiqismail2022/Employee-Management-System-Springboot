package com.beginner.demoApplication.services;

import com.beginner.demoApplication.dto.EmployeeDTO;
import com.beginner.demoApplication.entities.Employee;
import com.beginner.demoApplication.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeService(
            EmployeeRepository employeeRepository,
            EmployeeMapper employeeMapper
    ) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    public EmployeeDTO getEmployee(Integer id) {
        Employee employee = employeeRepository.getEmployee(id);
        return employeeMapper.toDto(employee);
    }
}