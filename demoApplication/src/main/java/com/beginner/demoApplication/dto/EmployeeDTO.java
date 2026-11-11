package dto;

import entities.Employee;

public class EmployeeDTO {
    String name;
    String dept;
    Integer age;
    
    public void setName(String name) {
    this.name = name;
}

public void setDept(String dept) {
    this.dept = dept;
}

public void setAge(Integer age) {
    this.age = age;
}

public String getName() {
    return name;
}

public String getDept() {
    return dept;
}

public Integer getAge() {
    return age;
}
public EmployeeDTO employeeMapper(Employee employee) {

    this.setName(employee.getName());
    this.setDept(employee.getDept());
    this.setAge(employee.getAge());

    return this;
}
}

