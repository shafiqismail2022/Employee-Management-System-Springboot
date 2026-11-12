package com.beginner.demoApplication.services;

import com.beginner.demoApplication.dto.EmployeeDTO;
import com.beginner.demoApplication.entities.Employee;

public class EmployeeMapper {

   public EmployeeDTO toDto(Employee employee) {
    return new EmployeeDTO(
        employee.getId(),
        employee.getName(),
        employee.getDept(),
        employee.getAge()
    );
}

}
