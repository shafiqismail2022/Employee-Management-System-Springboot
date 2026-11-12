package com.beginner.demoApplication.repositories;
// EmployeeRepository.java
import com.beginner.demoApplication.entities.Employee;
import org.springframework.stereotype.Repository;

@Repository     
public class EmployeeRepository {
    public Employee getEmployee(Integer id){
        return new Employee(282067, "Shafiq", "ICT", 29);
        
    }
}
